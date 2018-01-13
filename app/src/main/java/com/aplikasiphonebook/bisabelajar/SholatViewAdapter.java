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
 * Created by Muchamat on 05/12/2017.
 */

public class SholatViewAdapter extends RecyclerView.Adapter<SholatViewAdapter.SholatViewHolder>{

    private Context ctx;
    private List<VideoList> dataList;

    public SholatViewAdapter(Context ctx, List<VideoList> dataList) {
        this.ctx = ctx;
        this.dataList = dataList;
    }

    @Override
    public SholatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.list_sholat, null);
        SholatViewHolder holder = new SholatViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final SholatViewHolder holder, final int position) {
        final VideoList data   =   dataList.get(position);

        holder.tvSholat.setText(data.getTitle());
        holder.dtSholat.setText(data.getDetail());
        holder.imgSholat.setImageDrawable(ctx.getResources().getDrawable(data.getImage()));
        holder.vSholat.setImageDrawable(ctx.getResources().getDrawable(data.getImageVideo()));

        holder.sholatLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ctx, VideoPlayer.class);
                intent.putExtra("posisi", data.getTitle());
                ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class SholatViewHolder extends RecyclerView.ViewHolder{

        TextView tvSholat, dtSholat;
        ImageView imgSholat, vSholat;
        RelativeLayout sholatLayout;

        public SholatViewHolder(View itemView) {
            super(itemView);

            tvSholat    =   itemView.findViewById(R.id.titleSholat);
            dtSholat    =   itemView.findViewById(R.id.detailSholat);
            imgSholat   =   itemView.findViewById(R.id.imageSholat);

            sholatLayout = itemView.findViewById(R.id.sholatLayout);
            vSholat     = itemView.findViewById(R.id.videoSholat);
        }
    }
}
