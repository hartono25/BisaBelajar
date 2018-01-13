package com.aplikasiphonebook.bisabelajar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Muchamat on 04/12/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>{


    private Context ctx;
    private List<listData> dataList;

    public RecyclerViewAdapter(Context ctx, List<listData> dataList) {
        this.ctx = ctx;
        this.dataList = dataList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.list_layout, null);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        final listData data   =   dataList.get(position);

        holder.tvTitle.setText(data.getTitle());
        holder.tvDetail.setText(data.getDetail());
        holder.imageView.setImageDrawable(ctx.getResources().getDrawable(data.getImage()));

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position){
                    case 0:
                        Intent intent4 = new Intent(ctx, hijaiyah.class);
                        ctx.startActivity(intent4);
                        break;
                    case 1:
                        Intent intent = new Intent(ctx, wudhu_layout.class);
                        ctx.startActivity(intent);
                        break;
                    case 2:
                        Intent intent1 = new Intent(ctx, sholat_layout.class);
                        ctx.startActivity(intent1);
                        break;
                    case 3:
                        Intent intent2 = new Intent(ctx, Doa_Layout.class);
                        ctx.startActivity(intent2);
                        break;
                    case 4:
                        Intent intent3  =   new Intent(ctx, KisahNabi.class);
                        ctx.startActivity(intent3);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tvTitle, tvDetail;
        RelativeLayout relativeLayout;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            imageView   =   itemView.findViewById(R.id.item_image);
            tvTitle     =   itemView.findViewById(R.id.item_title);
            tvDetail    =   itemView.findViewById(R.id.item_detail);

            relativeLayout  =   (RelativeLayout) itemView.findViewById(R.id.relativeLayout);
        }
    }
}
