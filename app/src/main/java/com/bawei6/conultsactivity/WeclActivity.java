package com.bawei6.conultsactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bawei6.basemodule.AdapterCallBack;

import java.util.ArrayList;
import java.util.List;

public class WeclActivity extends AppCompatActivity {

    private Button wecl_btn_next;
    private List<String> griList=new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyWeclAdapter recyWeclAdapter;
    private Intent intent;
    public int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wecl);

        recyclerView=findViewById(R.id.wecl_recy);
        wecl_btn_next=findViewById(R.id.wecl_btn_next);

        griList.add("游戏");
        griList.add("娱乐");
        griList.add("体育");
        griList.add("汽车");
        griList.add("财经");
        griList.add("科技");
        griList.add("军事");
        griList.add("时尚");
        griList.add("历史");
        griList.add("旅游");
        griList.add("美文");
        griList.add("美食");

        recyWeclAdapter=new RecyWeclAdapter(this,griList);
        recyclerView.setAdapter(recyWeclAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        intent= new Intent(WeclActivity.this, ConsultActivity.class);
        recyWeclAdapter.getCallBack(new AdapterCallBack() {
            @Override
            public void onclick(View view, int position) {

                if(view.getId()==R.id.tv_next){
                    view.setBackgroundColor(Color.RED);
                }

                if(view.getId()==R.id.img_cha){
                    view.setBackgroundColor(Color.DKGRAY);
                }

            }
        });

        wecl_btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

    }
}
