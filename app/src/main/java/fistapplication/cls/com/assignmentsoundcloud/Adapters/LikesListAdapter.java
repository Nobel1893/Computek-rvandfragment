package fistapplication.cls.com.assignmentsoundcloud.Adapters;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import fistapplication.cls.com.assignmentsoundcloud.Model.Track;
import fistapplication.cls.com.assignmentsoundcloud.R;

/**
 * Created by CLS on 8/1/2018.
 */

public class LikesListAdapter  extends RecyclerView.Adapter<LikesListAdapter.ViewHolder>{


    ArrayList<Track> allTracks;
    OnItemClickListener onItemClickListener;
    OnItemClickListener ontLikeClickListener;
    OnItemClickListener onShareClickListener;
    OnItemClickListener onCommentClickListener;

    public void setOntLikeClickListener(OnItemClickListener ontLikeClickListener) {
        this.ontLikeClickListener = ontLikeClickListener;
    }

    public void setOnShareClickListener(OnItemClickListener onShareClickListener) {
        this.onShareClickListener = onShareClickListener;
    }

    public void setOnCommentClickListener(OnItemClickListener onCommentClickListener) {
        this.onCommentClickListener = onCommentClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public LikesListAdapter(ArrayList<Track> allTracks) {
        this.allTracks = allTracks;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_song ,null);
        ViewHolder viewHolder =new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Track track = allTracks.get(position);
        holder.date.setText(track.getDate());
        holder.uploader.setText(track.getUploader());
        holder.songName.setText(track.getSongName());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener!=null)
                onItemClickListener.onItemClick(track,position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return allTracks.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView uploader;
        TextView date;
        TextView songName;
        View parent;
        public ViewHolder(View cardView){
            super(cardView);
            image=cardView.findViewById(R.id.image);
            uploader=cardView.findViewById(R.id.uploader);
            date=cardView.findViewById(R.id.date);
            songName=cardView.findViewById(R.id.song_name);
            parent=cardView.findViewById(R.id.parent);

        }



    }

    public static interface OnItemClickListener{
       void onItemClick(Track track,int position);
    }

}
