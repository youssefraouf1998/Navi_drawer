package com.wds.future.navi_drawer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ahmed on 11/11/2018.
 */

public class recycle_view_adapter extends RecyclerView.Adapter<recycle_view_adapter.ViewHolder>{

    private List<data> List_Item;
    private Context context;

    public recycle_view_adapter(List<data> list_Item, Context context) {
        List_Item = list_Item;
        this.context = context;
    }

    @Override
    public recycle_view_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.drinks_content, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(recycle_view_adapter.ViewHolder holder, final int position) {

        holder.tvTitle.setText(List_Item.get(position).getS1());
        holder.tvDescription.setText(List_Item.get(position).getS2());
        holder.imageView.setImageResource(List_Item.get(position).getImage());
     //   Picasso.with(context).load(List_Item.get(position).Image).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return (null != List_Item ? List_Item.size() : 0);
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{


        private ImageView imageView;
        private TextView tvTitle;
        private TextView tvDescription;

        public ViewHolder(View view) {
            super(view);

            imageView = (ImageView) view.findViewById(R.id.img);
            tvTitle = (TextView) view.findViewById(R.id.txt1);

            tvDescription = (TextView) view.findViewById(R.id.txt2);
        }
    }
}