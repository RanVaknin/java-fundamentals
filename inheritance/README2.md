day 2 of inheritance lab.
- I created a super class called business. and made Theater, Shop and Restaurant inherit from it.
- it has a couple different constructor per the requirement of the specific child class.
- all child classes have their own methods and tests.
- I created an interface called reviewable that all child classes implement, with three methods:

    - addReview - adds a review to the business and updates the star review.
    - getReviews -  gets the list of reviews.
    - calculateAvg - helper function to help calculate the averages.