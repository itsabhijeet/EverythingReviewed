package com.example.abhij.everythingreviewed.ReviewsFeed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abhij.everythingreviewed.CreateReview.ReviewModel;
import com.example.abhij.everythingreviewed.R;

import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.MyViewHolder> {

    List<ReviewModel> reviews;

    public ReviewAdapter(List<ReviewModel> reviews) {
        this.reviews = reviews;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.review_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
               ReviewModel review = reviews.get(position);
               holder.Name.setText(review.getName());
               holder.comments.setText(review.getReviewComment());
               holder.rating.setRating(review.getRating());
    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        public TextView Name,comments;
        public RatingBar rating;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.tv_name);
            rating = itemView.findViewById(R.id.rating);
            comments = itemView.findViewById(R.id.tv_comments);
        }
    }
}
