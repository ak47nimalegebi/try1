package com.bawei6.usermodule.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei6.basemodule.AdapterCallBack;
import com.bawei6.basemodule.bean.NewsBean;
import com.bawei6.usermodule.R;
import com.bumptech.glide.Glide;

import java.util.List;

public class RecyGameAdapter extends RecyclerView.Adapter<RecyGameAdapter.GameViewHolder> {


    private Context context;
    private List<NewsBean.DataBean> list;
    private AdapterCallBack adapterCallBack;

    public void  getonClick(AdapterCallBack adapterCallBack){
        this.adapterCallBack=adapterCallBack;
    }

    public RecyGameAdapter(Context context, List<NewsBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.gameitem, parent, false);
        return new GameViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, final int position) {
        Glide.with(context).load(list.get(position).getMainimgurl()).into(holder.game_img);
        holder.game_tv_title.setText(list.get(position).getTitle());
        holder.game_tv_wang.setText("新华网");
        holder.game_tv_ping.setText("20评论");
        holder.game_tv_time.setText("刚刚");

        holder.game_tv_title.setOnClickListener(new View.OnClickListener() {
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

    class GameViewHolder extends RecyclerView.ViewHolder {
        TextView game_tv_title;
        TextView game_tv_wang;
        TextView game_tv_time;
        TextView game_tv_ping;
        ImageView game_img;
        public GameViewHolder(@NonNull View itemView) {
            super(itemView);
            game_img=itemView.findViewById(R.id.game_img);
            game_tv_ping=itemView.findViewById(R.id.game_tv_ping);
            game_tv_time=itemView.findViewById(R.id.game_tv_time);
            game_tv_wang=itemView.findViewById(R.id.game_tv_wang);
            game_tv_title=itemView.findViewById(R.id.game_tv_title);
        }
    }
}
