package com.bawei6.basemodule.mvvm;

import androidx.lifecycle.LiveData;

import com.bawei6.basemodule.api.BaseRespEntity;
import com.bawei6.basemodule.api.LogBean;
import com.bawei6.basemodule.bean.NewsBean;

public class ModelRepository {
    BaseModel baseModel;

    public ModelRepository() {
        baseModel=new BaseModel();
    }

    public LiveData<BaseRespEntity<LogBean>> log(String userName,String pwd){
        return baseModel.getLogBean(userName,pwd);
    }

    public LiveData<BaseRespEntity<NewsBean>> news(String userName, String pwd,int size){
        return baseModel.getnewBean(userName,pwd,size);
    }

}
