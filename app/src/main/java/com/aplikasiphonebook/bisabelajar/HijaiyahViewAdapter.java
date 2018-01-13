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
 * Created by Muchamat on 08/12/2017.
 */

public class HijaiyahViewAdapter extends RecyclerView.Adapter<HijaiyahViewAdapter.HijaiyahViewHolder>{

    private Context ctx;
    private List<VideoList> vList;

    public HijaiyahViewAdapter(Context ctx, List<VideoList> vList) {
        this.ctx = ctx;
        this.vList = vList;
    }

    @Override
    public HijaiyahViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.list_hijaiyah, null);
        HijaiyahViewHolder holder = new HijaiyahViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(HijaiyahViewHolder holder, final int position) {
        final VideoList data   =   vList.get(position);

        holder.titleH.setText(data.getTitle());
        holder.detailH.setText(data.getDetail());
        holder.imageH.setImageDrawable(ctx.getResources().getDrawable(data.getImage()));
        holder.viewH.setImageDrawable(ctx.getResources().getDrawable(data.getImageVideo()));

        holder.HLayout.setOnClickListener(new View.OnClickListener() {
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

    class HijaiyahViewHolder extends RecyclerView.ViewHolder{

        ImageView imageH, viewH;
        TextView titleH, detailH;

        RelativeLayout HLayout;

        public HijaiyahViewHolder(View itemView) {
            super(itemView);

            imageH   =   itemView.findViewById(R.id.imageHijaiyah);
            viewH  =   itemView.findViewById(R.id.viewHijaiyah);
            titleH     =   itemView.findViewById(R.id.titleHijaiyah);
            detailH    =   itemView.findViewById(R.id.detailHijaiyah);

            HLayout =   itemView.findViewById(R.id.hijaiyahLayout);
        }
    }
}
