package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView; // 이 부분을 추가하세요
import android.os.Bundle;
import androidx.appcompat.widget.SearchView;
import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private List<Post> postList;

    public PostAdapter(List<Post> postList) {
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_home_item, parent, false);
        return new PostViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.postImageView.setImageResource(post.getImageResource());
        holder.titleTextView.setText(post.getTitle());
        holder.hashtagTextView.setText(post.getHashtag());
        holder.locationTextView.setText(post.getLocation());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    static class PostViewHolder extends RecyclerView.ViewHolder {
        ImageView postImageView;
        TextView titleTextView;
        TextView hashtagTextView;
        TextView locationTextView;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            postImageView = itemView.findViewById(R.id.postImageView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            hashtagTextView = itemView.findViewById(R.id.hashtagTextView);
            locationTextView = itemView.findViewById(R.id.locationTextView);
        }
    }
}
