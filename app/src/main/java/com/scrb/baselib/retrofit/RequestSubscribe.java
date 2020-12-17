package com.scrb.baselib.retrofit;

import com.scrb.baselib.net.ExceptBean;
import com.scrb.baselib.net.ExceptionHandle;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public abstract class RequestSubscribe<T> implements Observer<T> {
    @Override
    public void onSubscribe(Disposable d) {
        onNetSubscribe(d);

    }

    @Override
    public void onNext(T t) {

        onRequestSuccess(t);
    }

    @Override
    public void onError(Throwable t) {
        onRequestError(ExceptionHandle.handleException(t));
    }


    @Override
    public void onComplete() {
    }

    /**
     * 请求数据成功
     *
     * @param response
     */
    protected abstract void onRequestSuccess(T response);


    /**
     * 请求错误
     *
     * @param e
     */
    protected abstract void onRequestError(@NonNull ExceptBean e);


    /**
     * 网络请求订阅
     *
     * @param d 可以在此取消网络请求
     */
    protected void onNetSubscribe(Disposable d) {
    }

}

