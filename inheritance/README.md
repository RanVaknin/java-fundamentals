My app creates both a Restaurant and Review classes.

- I make sure reviews cannot be under 0 or over 5 stars.
- I decided to make the Restaurants know what reviews are associated with them by storing reviews in a linked list inside of the Restaurant.
- There's a helper function called calculate averages that just averages data.
- The addReview function takes in a review, makes sure it doenst already exists, adds it to the review list, and updates the score of the restaurant with the helper function.
If the review already exists the function will throw a RuntimeException.




