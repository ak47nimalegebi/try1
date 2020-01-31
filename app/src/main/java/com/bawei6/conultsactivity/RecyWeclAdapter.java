package com.bawei6.conultsactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei6.basemodule.AdapterCallBack;

import java.util.List;

public class RecyWeclAdapter extends RecyclerView.Adapter<RecyWeclAdapter.MyWeclHodler> {

    private Context context;
    private List<String> list;
    private AdapterCallBack adapterCallBack;

    public void getCallBack(AdapterCallBack adapterCallBack){
        this.adapterCallBack=adapterCallBack;
    }

    public RecyWeclAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyWeclHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_recy, parent, false);
        return new MyWeclHodler(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyWeclHodler holder, final int position) {
        holder.tv_next.setText(list.get(position));

        holder.tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapterCallBack.onclick(view,position);
            }
        });
        holder.img_cha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapterCallBack.onclick(view,position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyWeclHodler extends RecyclerView.ViewHolder {
        TextView tv_next;
        ImageView img_cha;
        public MyWeclHodler(@NonNull View itemView) {
            super(itemView);
            tv_next=itemView.findViewById(R.id.tv_next);
            img_cha=itemView.findViewById(R.id.img_cha);
        }
    }
}
