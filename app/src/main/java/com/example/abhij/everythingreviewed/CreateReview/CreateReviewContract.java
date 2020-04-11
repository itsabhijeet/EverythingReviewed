package com.example.abhij.everythingreviewed.CreateReview;

import com.example.abhij.everythingreviewed.BaseInterfaces.BasePresenter;
import com.example.abhij.everythingreviewed.BaseInterfaces.BaseView;

public interface CreateReviewContract {


    interface presenter extends BasePresenter{

          void handlePostReviewClick();
    }

    interface view extends BaseView<presenter>{
         void onPostReviewClicked();
    }
}
