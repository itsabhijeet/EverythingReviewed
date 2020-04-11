package com.example.abhij.everythingreviewed.CreateReview;

import android.content.Context;
import android.view.View;

public class CreateReviewPresenter implements CreateReviewContract.presenter {

    private CreateReviewActivity view;

    public CreateReviewPresenter(CreateReviewActivity view){

        this.view = view;
    }

    @Override
    public void handlePostReviewClick() {
          ReviewModel review =  view.getReviewDetails();
          System.out.println("ReviewCheck : " + review.toString());
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}
