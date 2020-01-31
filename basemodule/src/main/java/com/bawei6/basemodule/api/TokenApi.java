package com.bawei6.basemodule.api;

import androidx.lifecycle.LiveData;

import com.bawei6.basemodule.bean.NewsBean;
import com.bawei6.basemodule.bean.TokenRespEntity;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface TokenApi {
    @FormUrlEncoded
    @POST("token")
    Call<TokenRespEntity> getToken(@Field("grant_type") String grant_type, @Field("username") String username, @Field("password") String password);

    @POST("api/User/login?")
    LiveData<BaseRespEntity<LogBean>> logBean(@Query("username")String username, @Query("pwd")String pwd );

    @GET("api/News/getNews?")
    LiveData<BaseRespEntity<NewsBean>> newsBean(@Query("newstype")String newstype,@Query("pagenum")String pagenum ,@Query("pagesize")int pagesize);

}
