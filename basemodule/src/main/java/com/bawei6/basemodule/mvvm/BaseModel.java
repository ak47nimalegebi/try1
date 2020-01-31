package com.bawei6.basemodule.mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import com.bawei6.basemodule.api.BaseRespEntity;
import com.bawei6.basemodule.api.LogBean;
import com.bawei6.basemodule.api.TokenApi;
import com.bawei6.basemodule.bean.NewsBean;
import com.bawei6.basemodule.factory.RetrofitFactory;


public class BaseModel {

            //登陆
        public LiveData<BaseRespEntity<LogBean>> getLogBean(String userName,String pwd){
            LiveData<BaseRespEntity<LogBean>>gtelog= RetrofitFactory.getInstance().create(TokenApi.class).logBean(userName,pwd);
            return gtelog;
        }

        //新闻页面
        public LiveData<BaseRespEntity<NewsBean>> getnewBean(String newstype, String pagenum,int pagesize){
            LiveData<BaseRespEntity<NewsBean>> aa= RetrofitFactory.getInstance().create(TokenApi.class).newsBean(newstype,pagenum,pagesize);
            return aa;
        }
}
