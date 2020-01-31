package com.bawei6.basemodule.mvvm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.bawei6.basemodule.api.BaseRespEntity;
import com.bawei6.basemodule.api.LogBean;
import com.bawei6.basemodule.bean.NewsBean;

public class BaseViewModel extends AndroidViewModel {

    ModelRepository modelRepository;

    public BaseViewModel(@NonNull Application application) {
        super(application);
        modelRepository=new ModelRepository();
    }

    public LiveData<BaseRespEntity<LogBean>> log(String userName,String pwd){
        return modelRepository.log(userName,pwd);
    }

    public LiveData<BaseRespEntity<NewsBean>> newss(String userName, String pwd,int size){
        return modelRepository.news(userName,pwd,size);
    }


}
