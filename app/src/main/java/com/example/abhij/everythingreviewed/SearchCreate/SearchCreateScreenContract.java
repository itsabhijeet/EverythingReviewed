package com.example.abhij.everythingreviewed.SearchCreate;

import com.example.abhij.everythingreviewed.BaseInterfaces.BasePresenter;
import com.example.abhij.everythingreviewed.BaseInterfaces.BaseView;
import com.example.abhij.everythingreviewed.CreateReview.ReviewModel;

import java.util.List;

public interface SearchCreateScreenContract {

    interface presenter extends BasePresenter{

        void handleOnCreateReviewClicked();
        void handleOnQuerySearch(CharSequence query);
    }

    interface view extends BaseView<presenter>{

        void onCreateReviewClicked();
        void onQuerySearch(List<ReviewModel> reviews);
    }
}
