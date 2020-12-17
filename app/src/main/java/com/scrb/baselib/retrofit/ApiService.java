package com.scrb.baselib.retrofit;

import com.scrb.baselib.entity.BaseBean;
import com.scrb.baselib.entity.BaseUrlBean;
import com.scrb.baselib.entity.CommentBean;
import com.scrb.baselib.entity.CountryFlag;
import com.scrb.baselib.entity.DataBean;
import com.scrb.baselib.entity.FinanceAffairs;
import com.scrb.baselib.entity.FinanceCalendar;
import com.scrb.baselib.entity.FinanceTalk;
import com.scrb.baselib.entity.NewsFlash;
import com.scrb.baselib.entity.Sign;
import com.scrb.baselib.entity.Talk;
import com.scrb.baselib.entity.User;
import com.scrb.baselib.entity.WebURLCXX;
import com.scrb.baselib.entity.WindStormBean;

import java.util.HashMap;
import java.util.List;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface ApiService {


    /**
     * 获取手机短信验证码
     *
     * @param phone   手机号
     * @param type    1-注册 2-重置密码 3-验证码登录
     * @param project 项目名
     * @return
     */
    @FormUrlEncoded
    @POST("http://94.191.60.183:3003/system/sendCode")
    Observable<BaseBean> sendCodeNew(@Field("phone") String phone, @Field("type") int type, @Field("project") String project);


    /**
     * 登录
     *
     * @param phone    手机号
     * @param password 密码 （如果时验证码登录时，密码就传验证码)
     * @param type     1：密码登录（默认） 2：验证码登录
     * @param project  项目名
     * @return
     */
    @GET("http://94.191.60.183:3003/system/login")
    Observable<BaseBean<User>> loginNew(@Query("phone") String phone, @Query("password") String password, @Query("type") int type, @Query("project") String project);

    /**
     * 账号注册
     * @param phone
     * @param password
     * @param confirmPassword
     * @param code
     * @param type
     * @param project
     * @return
     */
    @FormUrlEncoded
    @POST("http://94.191.60.183:3003/system/register")
    Observable<BaseBean<User>> registerNew(@Field("phone") String phone,@Field("password")String password,@Field("confirmPassword")String confirmPassword,@Field("code")String code,@Field("type")int type,@Field("project")String project);


    /**
     * 找回密码/修改密码
     *
     * @param phone           手机号
     * @param newPassword     新密码
     * @param confirmPassword 确认密码
     * @param code            验证码
     * @param project         项目名
     * @return
     */
    @FormUrlEncoded
    @POST("http://94.191.60.183:3003/system/resetPassword")
    Observable<BaseBean> resetPasswordNew(@Field("phone") String phone, @Field("newPassword") String newPassword, @Field("confirmPassword") String confirmPassword, @Field("code") String code, @Field("project") String project);


    /**
     * 登录
     *
     * @param phone    手机号
     * @param password 密码
     * @param type     1：密码登录（默认） 2：验证码登录
     * @param project  项目名
     * @param code     验证码 （默认000000）
     * @return
     */
    @GET("system/login")
    Observable<BaseBean<User>> login(@Query("phone") String phone, @Query("password") String password, @Query("type") int type, @Query("project") String project, @Query("code") String code);

    /**
     * 获取图形验证码
     *
     * @return
     */
    @GET("system/sendVerify")
    Observable<BaseBean<String>> sendVerify();

    /**
     * 获取手机短信验证码
     *
     * @param phone   手机号
     * @param type    1-注册 2-验证码登录 3-重置密码
     * @param project 项目名
     * @param code    图形验证码
     * @return
     */
    @FormUrlEncoded
    @POST("system/sendCode")
    Observable<BaseBean> sendCode(@Field("phone") String phone, @Field("type") int type, @Field("project") String project, @Field("code") String code);



    /**
     * 注销账号
     *
     * @param userId 用户id
     * @return
     */
    @GET("user/personal/deleteByUserId")
    Observable<BaseBean> deleteByUserId(@Query("userId") int userId);


    /**
     * 账号注册
     *
     * @param phone           手机号
     * @param password        密码
     * @param confirmPassword 确认密码
     * @param code            验证码
     * @param type            1-普通用户 2-系统用户
     * @param project         项目名
     * @return
     */
    @FormUrlEncoded
    @POST("system/register")
    Observable<BaseBean> register(@Field("phone") String phone, @Field("password") String password, @Field("confirmPassword") String confirmPassword, @Field("code") String code, @Field("type") int type, @Field("project") String project);


    /**
     * 找回密码/修改密码
     *
     * @param phone           手机号
     * @param newPassword     新密码
     * @param confirmPassword 确认密码
     * @param code            验证码
     * @param project         项目名
     * @return
     */
    @FormUrlEncoded
    @POST("system/resetPassword")
    Observable<BaseBean> resetPassword(@Field("phone") String phone, @Field("newPassword") String newPassword, @Field("confirmPassword") String confirmPassword, @Field("code") String code, @Field("project") String project);


    /**
     * 获取用户信息
     *
     * @param id 用户id
     * @return
     */
    @FormUrlEncoded
    @POST("user/personal/queryUser")
    Observable<BaseBean<User>> getUser(@Field("userId") int id);

    /**
     * 根据项目名获取推荐说说
     *
     * @param project    项目名
     * @param pageNumber 页码
     * @param pageSize   每页的个数
     * @return
     */
    @GET("user/talk/getRecommandTalk")
    Observable<BaseBean<DataBean<Talk>>> getRecommandTalk(@Query("project") String project, @Query("pageNumber") int pageNumber, @Query("pageSize") int pageSize);


    /**
     * 财经大事  行业风暴
     *
     * @param date       时间
     * @param pageNumber 页码
     * @param pageSize   每页个数
     * @return
     */
    @GET("admin/getFinanceAffairs")
    Observable<BaseBean<List<FinanceAffairs>>> getFinanceAffairs(@Query("date") String date, @Query("pageNumber") int pageNumber, @Query("pageSize") int pageSize);

    /**
     * 行业风暴
     * int pageNum
     * int pageSize
     * String project
     * @param params
     * @return
     */
    @GET("news/getNewListByProject.do")
    Observable<BaseBean<DataBean<WindStormBean>>> getWindData(@QueryMap HashMap<String,Object> params);


    /**
     * 财经说说  7.24快讯
     *
     * @param date       时间
     * @param pageNumber 页码
     * @param pageSize   每页个数
     * @return
     */
    @GET("admin/getFinanceTalk")
    Observable<BaseBean<List<FinanceTalk>>> getFinanceTalk(@Query("date") String date, @Query("pageNumber") int pageNumber, @Query("pageSize") int pageSize);

    /**
     * 获取每日快讯数据 7.24快讯
     * int id (回调数据中的bottomId，实现分页加载）;
     * String flag（down 获取顺序）;
     * @param params
     * @return
     */
    @GET("http://api.coindog.com/live/list")
    Observable<NewsFlash> getNewsFlash(@QueryMap HashMap<String,String> params);

    /**
     * 获取国旗
     * @return
     */
    @GET("admin/queryAllCountry")
    Observable<List<CountryFlag>> queryAllCountry();

    /**
     * 财经日历  日历数据
     * @param date
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @FormUrlEncoded
    @POST("admin/getFinanceCalender")
    Observable<BaseBean<List<FinanceCalendar>>> getFinanceCalender(@Field("date") String date, @Field("pageNumber") int pageNumber, @Field("pageSize") int pageSize);

    /**
     * 根据项目名获取说说列表
     *
     * @param project    项目名称
     * @param pageNumber 页码
     * @param pageSize   每页的个数
     * @return
     */
    @GET("user/talk/getTalkListByProject")
    Observable<BaseBean<DataBean<Talk>>> getTalkList(@Query("project") String project, @Query("pageNumber") int pageNumber, @Query("pageSize") int pageSize);

    /**
     * 获取推荐关注用户
     *
     * @param userId 用户id
     * @return
     */
    @GET("user/follow/getRecommandUserList")
    Observable<BaseBean<List<User>>> getRecommandUserList(@Query("userId") int userId);
    /**
     * 是否关注了用户
     *
     * @param userId   用户id
     * @param followId 关注用户id
     * @return
     */
    @GET("user/follow/isFollow")
    Observable<BaseBean<Boolean>> isFollow(@Query("userId") int userId, @Query("followerId") int followId);


    /**
     * 上传图片到服务器
     *
     * @param part 添加图片到body
     * @return
     */
    @Multipart
    @POST("http://image.yysc.online/upload")
    Observable<String> uploadImg(@Part MultipartBody.Part part);

    /**
     * 更新用户信息
     *
     * @param user 用户实体类
     * @return
     */
    @PUT("user/personal/updateUser")
    Observable<BaseBean> updateUser(@Body User user);

    /**
     * 获取关注列表
     *
     * @param userId     用户id
     * @param type       1-用户关注总数 2-用户粉丝总数
     * @param pageNumber 页码
     * @param pageSize   每页的个数
     * @return
     */
    @GET("user/follow/getUserFollowList")
    Observable<BaseBean<DataBean<User>>> getUserFollowList(@Query("userId") int userId, @Query("type") int type, @Query("pageNumber") int pageNumber, @Query("pageSize") int pageSize);


    /**
     * 关注用户
     *
     * @param userId   用户id
     * @param followId 关注的用户id
     * @param isFollow 关注/取关
     * @return
     */
    @FormUrlEncoded
    @POST("user/follow/follow")
    Observable<BaseBean> follow(@Field("userId") int userId, @Field("followerId") int followId, @Field("isFollow") Boolean isFollow);

    /**
     * 今日是否签到
     *
     * @param userId 用户id
     * @return
     */
    @GET("user/sign/hasSign")
    Observable<BaseBean<Boolean>> hasSign(@Query("userId") int userId);

    /**
     * 立即签到
     *
     * @param userId 用户id
     * @return
     */
    @FormUrlEncoded
    @POST("user/sign/signNow")
    Observable<BaseBean> signNow(@Field("userId") int userId);

    /**
     * 获取签到历史
     *
     * @param userId 用户id
     * @return
     */
    @GET("user/sign/getSignList")
    Observable<BaseBean<List<Sign>>> getSignList(@Query("userId") int userId);

    /**
     * 获取评论列表
     *
     * @param body 评论json
     * @return
     */
    @Headers({"Content-Type: application/json", "Accept: application/json"})//需要添
    @POST("user/talk/getCommentList")
    Observable<BaseBean<DataBean<CommentBean>>> getCommentList(@Body RequestBody body);

    /**
     * 评论说说
     *
     * @param userId  用户id
     * @param talkId  说说id
     * @param content 评论的内容
     * @return
     */
    @FormUrlEncoded
    @POST("user/talk/commentTalk")
    Observable<BaseBean> commentTalk(@Field("userId") int userId, @Field("talkId") int talkId, @Field("content") String content);


    /**
     * 用户浏览,点赞,转发操作
     *
     * @param userId  用户id
     * @param talkId  说说id
     * @param type    1-浏览 2-点赞 3-转发
     * @param content 说说内容
     * @return
     */
    @PUT("user/userTalk/userTalkOperation")
    Observable<BaseBean> userTalkOperation(@Query("userId") int userId, @Query("talkId") int talkId, @Query("type") int type, @Query("content") String content);
    /**
     * 获取用户对说说的操作
     *
     * @param userId 用户id
     * @param talkId 说说id
     * @param type   1-浏览 2-点赞 3-转发
     * @return
     */
    @GET("user/userTalk/getUserTalkListCount")
    Observable<BaseBean<Double>> getIsZan(@Query("userId") int userId, @Query("talkId") int talkId, @Query("type") int type);


    /**
     * 根据用户id获取说说
     *
     * @param userId 用户id
     * @return
     */
    @GET("admin/talk/getAllTalkByUserId")
    Observable<List<Talk>> getAllTalkByUserId(@Query("userId") int userId);


    /**
     * 发布说说
     *
     * @param userId  用户id
     * @param content 说说内容
     * @param picture 图片
     * @return
     */
    @FormUrlEncoded
    @POST("user/talk/publishTalk")
    Observable<BaseBean<Talk>> publishTalk(@Field("userId") int userId, @Field("content") String content, @Field("picture") String picture);



    /**
     * web请求地址 （CXX）
     * @param url
     * @return
     */
    @GET()
    Observable<WebURLCXX> getWebURLCXX(@Url String url);

    /**
     * 请求WebURL （YT、SD）
     * @param body
     * @return
     */
    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添
    @POST("https://api.qhniua.com/checkVersion")
    Observable<String> getWebURL( @Body RequestBody body);


    /**
     *
     * @return
     */
    @POST("")
    Observable<BaseUrlBean> getBaseURL(@Url String url);


}
