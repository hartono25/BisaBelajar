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
 * Created by Muchamat on 06/12/2017.
 */

public class DoaViewAdapter extends RecyclerView.Adapter<DoaViewAdapter.DoaViewHolder>{

    private Context ctx;
    private List<VideoList> dataList;

    public DoaViewAdapter(Context ctx, List<VideoList> dataList) {
        this.ctx = ctx;
        this.dataList = dataList;
    }

    @Override
    public DoaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.list_doa, null);
        DoaViewHolder holder = new DoaViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(DoaViewHolder holder, int position) {
        final VideoList data   =   dataList.get(position);

        holder.tiTleDoa.setText(data.getTitle());
        holder.detailDoa.setText(data.getDetail());
        holder.imgDoa.setImageDrawable(ctx.getResources().getDrawable(data.getImage()));
        holder.viewDoa.setImageDrawable(ctx.getResources().getDrawable(data.getImageVideo()));

        holder.rLayout.setOnClickListener(new View.OnClickListener() {
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

    class DoaViewHolder extends RecyclerView.ViewHolder{

        TextView tiTleDoa, detailDoa;
        ImageView imgDoa, viewDoa;
        RelativeLayout rLayout;

        public DoaViewHolder(View itemView) {
            super(itemView);

            tiTleDoa    = itemView.findViewById(R.id.titleDoa);
            detailDoa   = itemView.findViewById(R.id.detailDoa);
            imgDoa      = itemView.findViewById(R.id.imageDoa);
            viewDoa     = itemView.findViewById(R.id.videoDoa);

            rLayout     = itemView.findViewById(R.id.doaLayout);
        }
    }
}
