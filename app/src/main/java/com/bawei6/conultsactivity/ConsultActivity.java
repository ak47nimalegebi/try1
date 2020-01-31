package com.bawei6.conultsactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.bawei6.usermodule.HomeFra;
import com.bawei6.usermodule.MyFra;
import com.bawei6.usermodule.VideoFra;
import com.bawei6.usermodule.WeiFra;
import com.bawei6.usermodule.homefra.CaiFragment;
import com.bawei6.usermodule.homefra.GuanFragment;
import com.bawei6.usermodule.homefra.LiFragment;
import com.bawei6.usermodule.homefra.MeiFragment;
import com.bawei6.usermodule.homefra.ReFragment;
import com.bawei6.usermodule.homefra.TuiFragment;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

public class ConsultActivity extends AppCompatActivity {

    private FrameLayout frameLayout;
    private CommonTabLayout commonTabLayout;
    private FragmentManager manager;

private Fragment homeFra,videoFra,weiFra,myFra;
    private ArrayList<CustomTabEntity> mTabEntitys = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);

        frameLayout=findViewById(R.id.main_fra);
        commonTabLayout=findViewById(R.id.main_comm);


        manager=getSupportFragmentManager();
        homeFra=new HomeFra(manager); videoFra=new VideoFra(); weiFra=new WeiFra(); myFra=new MyFra();

        mTabEntitys.add(new MyCustomTabEntity("首页",R.drawable.unfangzi,R.drawable.fangzi));
        mTabEntitys.add(new MyCustomTabEntity("视频",R.drawable.unbo,R.drawable.bo));
        mTabEntitys.add(new MyCustomTabEntity("微头条",R.drawable.unshenglvehao,R.drawable.shenglvehao));
        mTabEntitys.add(new MyCustomTabEntity("我的",R.drawable.untouxiang,R.drawable.touxiang));

        commonTabLayout.setTabData(mTabEntitys);

        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.main_fra,homeFra,"f1")
                .addToBackStack("f1")
                .commit();

        commonTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                switch (position){
                    case 0:
                        FragmentTransaction fragmentTransaction = manager.beginTransaction();
                        fragmentTransaction.replace(R.id.main_fra,homeFra,"f1")
                                .addToBackStack("f1")
                                .commit();
                        break;

                    case 1:
                        FragmentTransaction fragmentTransaction2 = manager.beginTransaction();
                        fragmentTransaction2.replace(R.id.main_fra,videoFra,"f2")
                                .addToBackStack("f2")
                                .commit();
                        break;

                    case 2:
                        FragmentTransaction fragmentTransaction3 = manager.beginTransaction();
                        fragmentTransaction3.replace(R.id.main_fra,weiFra,"f3")
                                .addToBackStack("f3")
                                .commit();
                        break;

                    case 3:
                        FragmentTransaction fragmentTransaction4 = manager.beginTransaction();
                        fragmentTransaction4.replace(R.id.main_fra,myFra,"f4")
                                .addToBackStack("f4")
                                .commit();
                        break;
                }
            }

            @Override
            public void onTabReselect(int position) {

            }
        });


    }


}
