package com.example.abhij.everythingreviewed.CreateReview;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class ReviewModel implements Serializable {


    String category;
    String name;
    String reviewComment;
    Float rating;

    public ReviewModel(String category, String name, String reviewComment, Float rating) {
        this.category = category;
        this.name = name;
        this.reviewComment = reviewComment;
        this.rating = rating;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReviewComment() {
        return reviewComment;
    }

    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    @NonNull
    @Override
    public String toString() {
        return  "Category : " + category + "- Name : " + name + "- Comments : " + reviewComment + "- Rating : " + rating;
    }

}
