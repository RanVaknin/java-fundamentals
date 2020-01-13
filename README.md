1. roll method:
The roll method accepts a parameter - n and returns an array with the length of n whereas every element in a random integer between 1 - 6 (representing a 6 sided die).
- created a new array with a length of n.
- populated every index in the array with a random integer between 1 - 6.
- return the array

2. containsDuplicates method:
the containsDuplicates takes in an array of integers and returns a true if array contains duplicates or false if it doesn't.
- created a value to check against and setting it to the first element in the given array.
- iterating over the given array and comparing each value to the check variable.
- if value repeats itself return true, if not return false.

3. calculateAverages method:
the function takes in an array of integers and returns an integer that represents the average of all elements.
- created an average variable set to 0 as a placeholder.
- looped through the array and with every iteration adding each element.
- returning the sum of all elements in the array and divided them by the array length.

4. averageOfAllArrays method:
the function takes in a 2 dimensional array of integers and returns the smallest average of all averages.
- created an array called averages[] to store all the averages of all nested arrays.
- created a for loops to iterate through the exterior array.
- created a variabe to hold temporarly a single value - the average of that iterations's array.
- created another for loop to iterate and calculate the average of the nested array.
- stored that in the array in order.
- compared each element in averages[] array.
- returns the smallest.

5. temperature method:
The temperature method, goes through a multi dimensional array of temperature and finds the minimum and maximum temperatures.
- created a for loop to iterate over a range of consecutive numbers starting from the min to the max+1
- created an if statemnt to check if any of these numbers don't correspond with the ones in the multi dimensional array.
- stored and returned unique numbers.

6. tally method:
the tally method takes in a list of strings representing votes and returns the string that appears the most. 
creating a hashmap and initializing every unqiue key of the list into the hashmap and setting their initiale value to 0.
incrementing values by 1 whenever a the same string appears.
returns formatted string based on which key in the hashmap has the largest value.
if there is a tie it returns a tie.
if no votes were counted it returns no votes.

7. linter:
The linter takes in a file and based on criteria retuns a formatted string of which line does not contain a semi colon.
also tests the following:
Test the linter on a file that contains no errors.
Test the linter on a file that contains one error.
Test the linter on a file that contains few errors.
Test the linter on a file that contains many errors.
Test the linter on an empty file.
