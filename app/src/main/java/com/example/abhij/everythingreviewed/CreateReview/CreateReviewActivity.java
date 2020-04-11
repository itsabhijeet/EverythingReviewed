package com.example.abhij.everythingreviewed.CreateReview;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.abhij.everythingreviewed.R;

public class CreateReviewActivity extends AppCompatActivity implements CreateReviewContract.view {

    private Spinner category;
    private EditText name;
    private EditText reviewComments;
    private RatingBar rating;
    private Button postButton;
    private CreateReviewContract.presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_review_screen);

        init();
        presenter = new CreateReviewPresenter(this);
        this.setPresenter(presenter);


    }

    private void init() {

       category =  findViewById(R.id.spinner);
       name = findViewById(R.id.et_name);
       reviewComments = findViewById(R.id.et_review);
       rating = findViewById(R.id.ratingBar);
       postButton = findViewById(R.id.bt_post);

       // Fill Spinner Values


       // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.categories, android.R.layout.simple_spinner_item);
       // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       // Apply the adapter to the spinner
        category.setAdapter(adapter);

        // Setting on click Listener for Post Review Button

        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 reviewComments.getText();
                 presenter.handlePostReviewClick();
            }
        });
    }

    @Override
    public void onPostReviewClicked() {

    }

    @Override
    public void setPresenter(CreateReviewContract.presenter presenter) {
            this.presenter = presenter;
    }


    public ReviewModel getReviewDetails() {

            String categoryValue = category.getSelectedItem().toString();
            String nameValue = name.getText().toString();
            String commentValue = reviewComments.getText().toString();
            float ratingValue = rating.getRating();

            ReviewModel reviewModel = new ReviewModel(categoryValue,nameValue,commentValue,ratingValue);

            return reviewModel;

    }
}
