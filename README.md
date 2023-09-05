# Dice Game :game_die:
![Dice Logo](/img/dice.jpg)

## Objectives
* To practice the 3-step problem solving process
* Read numeric input with a Scanner object
* Decompose an integer using integer division and remainders
* Practice with your first if-else statement

## Problem description
Read in a four-digit integer from the user and print out each digit on a separate line, from the most significant (leftmost) one to the least significant (rightmost). You should use integer division and the modulo (remainder) operator to deconstruct the number and print it out piece by piece. You may use as many variables as you’d like. You are not allowed to convert the number into any other data type or use any techniques beyond chapter 3.

Hint: the remainder of any number when divided by 10 is the rightmost digit. E.g., 9875 % 10 is 5. The quotient of any number when divided by 10 (using integer division) is all the digits except the rightmost. E.g., 9875 / 10 is 987.

After you get the number chopping part working, add input validation for the user input by adding an if-statement. If the number you read in is indeed four digits, execute all the chopping code you just wrote. If the number is less than four digits, print “too small” and end the program. If the number is larger than four digits, print “too large” and end the program. Hint: four digit numbers are at least 1000 and at most 9999.

**Your code must work for any valid 4-digit number, not just the one in the examples. You may assume only integer input will be given.**

## Getting started
Open `src/main/java/edu/citadel/NumberChopper.java` and add your code to the main method. To run your main method locally, enter the run and debug menu on the left, or right-click the main method and select `Run Java`.

To run the test cases locally, open a terminal and type `mvn test`. Alternatively, you can open the file `src/test/java/edu/citadel/NumberChopperTests.java` and click the play buttons. You can review the tests in this file, but do not modify any file other than `NumberChopper.java`.

## Testing and Submission
When you think you are done, commit your changes to GitHub to trigger the autograder. You can do this on the terminal, or using the Source Control menu option to the left (recommended). You do not need to create a branch or pull request; just commit your changes and push/synchronize them.

If you open the assignment page on GitHub.com you will see the results of your submission. If the tests pass locally when you run `mvn test`, they should also pass there.
