package com.scrb.baselib.retrofit;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitUtil {
    private Retrofit retrofit;
    private static ApiService apiService;
    private static RetrofitUtil mInstance;
    public Handler mHandler = new Handler(Looper.getMainLooper());

    private  RetrofitUtil(){

    }
    /**
     * 单例设计模式
     *
     * @return
     */
    public static RetrofitUtil getInstance() {
        if (mInstance == null) {
            synchronized (RetrofitUtil.class) {
                if (mInstance == null) {
                    mInstance = new RetrofitUtil();
                }
            }
        }
        return mInstance;
    }

    public void initRetrofit() {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .addInterceptor(new MyLogInterceptor())
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(DefaultURL.BaseURL)
                .client(client)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);
    }

    public ApiService Api() {
        if (apiService == null)
            throw new IllegalStateException("需要在BaseURL请求回调中初始化");
        return apiService;
    }


    public interface ResultCallback<T> {

        void onSuccess(T t, String msg);

        void onError(Throwable throwable);

    }

    public <T> void requestData(Call<T> call, final ResultCallback<T> resultCallback) {
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(final Call<T> call, final Response<T> response) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        resultCallback.onSuccess(response.body(), response.message());
                    }
                });
            }

            @Override
            public void onFailure(final Call<T> call, final Throwable t) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        resultCallback.onError(t);
                    }
                });
            }
        });
    }
}
