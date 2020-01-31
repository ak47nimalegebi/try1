package com.bawei6.conultsactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bawei6.basemodule.api.BaseRespEntity;
import com.bawei6.basemodule.api.LogBean;
import com.bawei6.basemodule.mvvm.ModelRepository;

public class MainActivity extends AppCompatActivity{

    private EditText log_edi_yan,log_edi_name,log_edi_pwd,log_edi_pwd2;
    private Button log_btn_yan,log_btn_dl,log_btn_zc;
    private NotificationManager notificationManager;
    private LogBean logBean=new LogBean();
    private ModelRepository modelRepository=new ModelRepository();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log_edi_yan=findViewById(R.id.log_edi_yan);
        log_edi_name=findViewById(R.id.log_edi_name);
        log_edi_pwd=findViewById(R.id.log_edi_pwd);
        log_edi_pwd2=findViewById(R.id.log_edi_pwd2);
        log_btn_yan=findViewById(R.id.log_btn_yan);
        log_btn_dl=findViewById(R.id.log_btn_dl);
        log_btn_zc=findViewById(R.id.log_btn_zc);



        log_btn_dl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = log_edi_name.getText().toString();
                String pwd = log_edi_pwd.getText().toString();
                String pwd2 = log_edi_pwd2.getText().toString();
                if(pwd.equals(pwd2)){
                    LiveData<BaseRespEntity<LogBean>> log = modelRepository.log(name, pwd);
                    log.observe(MainActivity.this, new Observer<BaseRespEntity<LogBean>>() {
                        @Override
                        public void onChanged(BaseRespEntity<LogBean> logBeanBaseRespEntity) {
                            Toast.makeText(MainActivity.this, logBeanBaseRespEntity.getMsg(), Toast.LENGTH_SHORT).show();
                            if(logBeanBaseRespEntity.getMsg().equals("用户登录成功")){
                                startActivity(new Intent(MainActivity.this,WeclActivity.class));
                            }
                        }
                    });
                }else {
                    Toast.makeText(MainActivity.this, "两次密码不一致", Toast.LENGTH_SHORT).show();
                }

            }
        });





    }
}
