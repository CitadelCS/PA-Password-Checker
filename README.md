# Dice Game :game_die:
![Dice Logo](/img/dice.jpg)

## Objectives
* To practice the 3-step problem solving process
* To use random numbers
* To use conditional statements – if, if-else, and switch
* To practice following specific output format guidelines

## Collaboration policy
Please see the syllabus for the full policy. This course permits many forms of collaboration, including with course staff and classmates. However, you must be careful to collaborate only as authorized below. If you get stuck, check out code examples from the textbook, or post on Discord in the #201 channel (without revealing your solutions), DM the course staff, or visit tutoring.

Activity	| Course staff	| Classmates/others	| CSCI 201 graduates
--|--|--|--
Discuss concepts	| ✔	| ✔	| ✔
Acknowledge collaboration	| ✔	| ✔	| ✔
Expose solutions to	| ✔	| no	| ✔
View solutions from	| no	| no	| no
Plagiarize code from	| no	| no	| no

## Overview
Follow the three-step problem solving process to make a simple dice game. **In this assignment it is very important to match output instructions verbatim.** First, after a prompt (sentence 1), the user enters an amount of money for a wager. The program then replies with a sentence based on that wager (see options for sentence 2). Then the program simulates rolling two independent six-sided dice by generating two random integers between 1 and 6. The program then reports the rolled values (see format for sentence 3). Finally, the program should use a switch or if/else statement to compute the winnings (or losses) based on the total value rolled and displays a sentence describing the result (see options for sentence 4). The program finishes with a sentence reporting how much money was won (see format for sentence 5).

## Output format instructions for sentences referenced above
1. The prompt for the initial wager should say: `Enter your wager amount:`
2. The program outputs one of the following sentences based on the wager amount:
    * `Invalid bet.`	If the wager is <= 0 (you should reset the wager to zero for them in this case)
    * `Small bet.`	If the wager is >0 and < 15
    * `Medium bet.`	If the wager is >= 15 and < 60
    * `High roller.`	If the wager is >= 60
3. The program outputs this sentence: `You rolled X and Y.`
    * X and Y should be replaced with the numeric roll values as in the sample runs.
4. The program outputs one of the five following sentences based on the sum of the dice rolls:
    * If the sum is 2 or 12, the player wins 15x the wager. Display: `Big winner!`
    * If the sum is 3 or 11, the player wins 10x the wager. Display: `Medium winner!`
    * If the sum is 4 or 10, the player wins 5x the wager. Display: `Small winner.`
    * If the sum is 5 or 9, the player wins the wager back. Display: `Draw.`
    * If the sum is 6, 7, or 8, the player loses the wager. Display: `You lose.`
5. Finally, display this sentence: `You won $X`
    * X is replaced by the winnings (or zero if the wager is lost)
    * No decimal or formatting is required. Only the dollar sign.

## Getting started
Open `src/main/java/edu/citadel/DiceGame.java` and add your code to the main method. To run your main method locally, enter the run and debug menu on the left, or right-click the main method and select `Run Java`.

To run the test cases locally, open a terminal and type `mvn test`. Alternatively, you can open the file `src/test/java/edu/citadel/DiceGameTest.java` and click the play buttons. You can review the tests in this file, but do not modify any file other than `DiceGame.java`.

## Sample Output from four separate runs of the solution
```
Enter your wager amount: 
50.00
Medium bet.
Rolling the dice!
You rolled 3 and 2.
Draw.
You won $50.0
```
```
Enter your wager amount: 
3.5
Small bet.
Rolling the dice!
You rolled 5 and 2.
You lose.
You won $0.0
```
```
Enter your wager amount: 
99.99
High roller.
Rolling the dice!
You rolled 1 and 1.
Big Winner!
You won $1499.85
```
```
Enter your wager amount: 
-27
Invalid bet.
Rolling the dice!
You rolled 6 and 4.
Small Winner.
You won $0.0
```

## Testing and Submission
When you think you are done, commit your changes to GitHub to trigger the autograder. You can do this on the terminal, or using the Source Control menu option to the left (recommended). You do not need to create a branch or pull request; just commit your changes and push/synchronize them.

If you open the assignment page on GitHub.com you will see the results of your submission. If the tests pass locally when you run `mvn test`, they should also pass there with a little green checkmark.
