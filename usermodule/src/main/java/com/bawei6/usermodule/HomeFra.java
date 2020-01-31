package com.bawei6.usermodule;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


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

public class HomeFra extends Fragment {

    private FragmentManager manager;
    private CommonTabLayout commonTabLayout;
    private FrameLayout frameLayout;
    private Fragment tuiFra,guanFra,reFra,caiFra,liFra,meiFra;
    private ArrayList<CustomTabEntity> mTabEntitys = new ArrayList<>();

    public HomeFra(FragmentManager manager) {
        this.manager=manager;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = getLayoutInflater().inflate(R.layout.homefra, null);
        commonTabLayout=inflate.findViewById(R.id.user_comm);

        tuiFra=new TuiFragment();
        guanFra=new GuanFragment();
        reFra=new ReFragment();
        caiFra=new CaiFragment();
        liFra=new LiFragment();
        meiFra=new MeiFragment();

        mTabEntitys.add(new MyCustomTabEntity("关注"));
        mTabEntitys.add(new MyCustomTabEntity("推荐"));
        mTabEntitys.add(new MyCustomTabEntity("热点"));
        mTabEntitys.add(new MyCustomTabEntity("财经"));
        mTabEntitys.add(new MyCustomTabEntity("历史"));
        mTabEntitys.add(new MyCustomTabEntity("美食"));

        commonTabLayout.setTabData(mTabEntitys);

        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.user_fra,guanFra,"f1")
                .addToBackStack("f1")
                .commit();

        commonTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                switch (position){
                    case 0:
                        FragmentTransaction fragmentTransaction = manager.beginTransaction();
                        fragmentTransaction.replace(R.id.user_fra,guanFra,"f1")
                                .addToBackStack("f1")
                                .commit();
                        break;

                    case 1:
                        FragmentTransaction fragmentTransaction2 = manager.beginTransaction();
                        fragmentTransaction2.replace(R.id.user_fra,tuiFra,"f2")
                                .addToBackStack("f2")
                                .commit();
                        break;

                    case 2:
                        FragmentTransaction fragmentTransaction3 = manager.beginTransaction();
                        fragmentTransaction3.replace(R.id.user_fra,reFra,"f3")
                                .addToBackStack("f3")
                                .commit();
                        break;

                    case 3:
                        FragmentTransaction fragmentTransaction4 = manager.beginTransaction();
                        fragmentTransaction4.replace(R.id.user_fra,caiFra,"f4")
                                .addToBackStack("f4")
                                .commit();
                        break;

                    case 4:
                        FragmentTransaction fragmentTransaction5 = manager.beginTransaction();
                        fragmentTransaction5.replace(R.id.user_fra,liFra,"f5")
                                .addToBackStack("f5")
                                .commit();
                        break;

                    case 5:
                        FragmentTransaction fragmentTransaction6 = manager.beginTransaction();
                        fragmentTransaction6.replace(R.id.user_fra,meiFra,"f6")
                                .addToBackStack("f6")
                                .commit();
                        break;
                }
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
        return inflate;
    }
}
