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

public class NabiViewAdapter extends RecyclerView.Adapter<NabiViewAdapter.NabiViewHolder>{

    private Context ctx;
    private List<VideoList> dataList;

    public NabiViewAdapter(Context ctx, List<VideoList> dataList) {
        this.ctx = ctx;
        this.dataList = dataList;
    }

    @Override
    public NabiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.list_nabi, null);
        NabiViewHolder holder = new NabiViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final NabiViewHolder holder, final int position) {
        final VideoList data   =   dataList.get(position);

        holder.titleNabi.setText(data.getTitle());
        holder.detailNabi.setText(data.getDetail());
        holder.imgNabi.setImageDrawable(ctx.getResources().getDrawable(data.getImage()));
        holder.viNabi.setImageDrawable(ctx.getResources().getDrawable(data.getImageVideo()));

        holder.nabiLayout.setOnClickListener(new View.OnClickListener() {
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

    class NabiViewHolder extends RecyclerView.ViewHolder{

        TextView titleNabi, detailNabi;
        ImageView imgNabi, viNabi;
        RelativeLayout nabiLayout;

        public NabiViewHolder(View itemView) {
            super(itemView);

            titleNabi       =   itemView.findViewById(R.id.titleNabi);
            detailNabi      =   itemView.findViewById(R.id.detailNabi);
            imgNabi         =   itemView.findViewById(R.id.imageNabi);

            nabiLayout      =   itemView.findViewById(R.id.nabiLayout);
            viNabi          =   itemView.findViewById(R.id.videoNabi);
        }
    }
}
