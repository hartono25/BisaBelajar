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

public class WudhuViewAdapter extends RecyclerView.Adapter <WudhuViewAdapter.WudhuViewHolder>{


    private Context ctx;
    private List<VideoList> vList;

    public WudhuViewAdapter(Context ctx, List<VideoList> vList) {
        this.ctx = ctx;
        this.vList = vList;
    }

    @Override
    public WudhuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.list_wudhu, null);
        WudhuViewHolder holder = new WudhuViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final WudhuViewHolder holder, final int position) {

        final VideoList data   =   vList.get(position);

        holder.tvTitle.setText(data.getTitle());
        holder.tvDetail.setText(data.getDetail());
        holder.imageView.setImageDrawable(ctx.getResources().getDrawable(data.getImage()));
        holder.imageVideo.setImageDrawable(ctx.getResources().getDrawable(data.getImageVideo()));

        holder.wudhuLayout.setOnClickListener(new View.OnClickListener() {
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
        return vList.size();
    }

    class WudhuViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView,imageVideo;
        TextView tvTitle, tvDetail;
        RelativeLayout wudhuLayout;

        public WudhuViewHolder(View itemView) {
            super(itemView);

            imageView   =   itemView.findViewById(R.id.imageWudhu);
            imageVideo  =   itemView.findViewById(R.id.video_View);
            tvTitle     =   itemView.findViewById(R.id.titleWudhu);
            tvDetail    =   itemView.findViewById(R.id.detailWudhu);

            wudhuLayout =   itemView.findViewById(R.id.wudhuLayout);

        }
    }
}
