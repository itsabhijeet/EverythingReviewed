package com.example.abhij.everythingreviewed.SearchCreate;

import com.example.abhij.everythingreviewed.CreateReview.ReviewModel;

import java.util.ArrayList;
import java.util.List;

public class SearchCreatePresenter implements SearchCreateScreenContract.presenter {

    private SearchCreateScreen view;

    public SearchCreatePresenter(SearchCreateScreen view) {
        this.view = view;
    }


    @Override
    public void handleOnCreateReviewClicked() {

        view.onCreateReviewClicked();

    }

    @Override
    public void handleOnQuerySearch(CharSequence query) {
         System.out.println("Query : " + query);
         // To DB Call to fetch Reviews based on query and get Review List

        // Dummy List

        List<ReviewModel>  reviews = createDummyReviews();
        view.onQuerySearch(reviews);

    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }

    private List<ReviewModel> createDummyReviews() {
        List<ReviewModel> reviews = new ArrayList<>();
        ReviewModel reviewModel = new ReviewModel("Book","Zero to One","Rare,Concise,Perfect",(float)4.5);
        reviews.add(reviewModel);
        ReviewModel reviewModel1 = new ReviewModel("Mobile","Iphone SE","Rare,Concise,Perfect,Concise,Concise",(float)5.0);
        reviews.add(reviewModel1);
        ReviewModel reviewModel2 = new ReviewModel("Television","Samsung TV","Rare,Concise,Perfect,Concise,Concise",(float)4.0);
        reviews.add(reviewModel2);

        return  reviews;
    }
}
