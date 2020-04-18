package com.example.abhij.everythingreviewed.SearchCreate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.abhij.everythingreviewed.CreateReview.CreateReviewActivity;
import com.example.abhij.everythingreviewed.CreateReview.ReviewModel;
import com.example.abhij.everythingreviewed.R;
import com.example.abhij.everythingreviewed.ReviewsFeed.ReviewsList;

import java.io.Serializable;
import java.util.List;

public class SearchCreateScreen extends AppCompatActivity implements SearchCreateScreenContract.view{
    private SearchView searchView;
    private Button createReviewButton;
    private SearchCreateScreenContract.presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_create_screen);

        presenter = new SearchCreatePresenter(this);
        this.setPresenter(presenter);

        init();

    }

    private void init() {

        searchView = findViewById(R.id.searchView);
        createReviewButton = findViewById(R.id.bt_create_review);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                CharSequence query = searchView.getQuery();
                System.out.println("Search : Here");
                presenter.handleOnQuerySearch(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });

        createReviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Create Review Clicked.");
                presenter.handleOnCreateReviewClicked();
            }
        });
    }

    @Override
    public void onCreateReviewClicked() {
              Intent intent = new Intent(this, CreateReviewActivity.class);
              startActivity(intent);
    }

    @Override
    public void onQuerySearch(List<ReviewModel> reviews) {
        Intent intent = new Intent(this, ReviewsList.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("Reviews",(Serializable) reviews);
        intent.putExtra("Bundle",bundle);
        startActivity(intent);

    }

    @Override
    public void setPresenter(SearchCreateScreenContract.presenter presenter) {
           this.presenter = presenter;
    }
}
