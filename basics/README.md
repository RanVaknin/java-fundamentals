1. Pluralize:
This method takes a string and an integer, makes sure that it is either 0 or bigger than one to pluralize.
Then it adds an "s" to the noun according to the number that was input as an integer.

2. flipNHeads:
This method creates and instance counter to count how many times it ran in TOTAL.
Creates a head counter to count the times we want to check for heads in a row.
then it randomizes a number between 0 and 1. if larger than 0.5 it heads.
It adds 1 to head counter if it heads until id adds up to the input number of "heads" in a row.
if it hits "tails" it resets the head counter. 
Finally it returns, and prints everything to the console.

3. clock:
This method would just print the current time to the console every second.

First I created a clock class in which I imported a few Time libraries to get the time now, and format it into the required time format.
second I added the inhertance of a TimerTask class to so it could be used to schedule a task using timer.schedule.
then I input the arguments based on the requirements. 0 delay, and every 1 second. and voila!

