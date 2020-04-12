package com.example.abhij.everythingreviewed.ReviewsFeed;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abhij.everythingreviewed.CreateReview.ReviewModel;
import com.example.abhij.everythingreviewed.R;

import java.util.ArrayList;
import java.util.List;

public class ReviewsList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ReviewAdapter reviewAdapter;
    private List<ReviewModel>  reviews;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review_list);

        recyclerView = findViewById(R.id.reviewListContainer);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Dummy Reviews for testing purpose

        createDummyReviews();

        reviewAdapter = new ReviewAdapter(reviews);
        recyclerView.setAdapter(reviewAdapter);
    }

    private void createDummyReviews() {
            reviews = new ArrayList<>();
            ReviewModel reviewModel = new ReviewModel("Book","Zero to One","Rare,Concise,Perfect",(float)4.5);
            reviews.add(reviewModel);
            ReviewModel reviewModel1 = new ReviewModel("Mobile","OnePlus7tPro","Rare,Concise,Perfect,Concise,Concise",(float)5.0);
            reviews.add(reviewModel1);
            ReviewModel reviewModel2 = new ReviewModel("Television","OnePlus TV","Rare,Concise,Perfect,Concise,Concise",(float)4.0);
            reviews.add(reviewModel2);
    }
}
