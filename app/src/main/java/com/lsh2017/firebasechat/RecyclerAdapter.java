package com.lsh2017.firebasechat;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 이소희 on 2017-09-22.
 */

public class RecyclerAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<ChatData> items;


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false);
        Holder holder=new Holder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Holder holder1=(Holder) holder;

        holder1.userName.setText(items.get(position).getUserName());
        holder1.message.setText((items.get(position).getMessage()));
        holder1.date.setText(items.get(position).getDate());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        TextView userName;
        TextView message;
        TextView date;


        public Holder(View itemView) {
            super(itemView);

            userName=(TextView) itemView.findViewById(R.id.text_name);
            message=(TextView) itemView.findViewById(R.id.text_content);
            date=(TextView)itemView.findViewById(R.id.text_date);

        }
    }
}
