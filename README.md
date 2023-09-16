# Password Checker :white_check_mark:
![Dice Logo](/img/dice.png)

## Objectives
* To process strings and characters
* To practice conditional statements
* To see loops in action


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
Follow the problem solving process to make a password validation program. First, prompt the user to enter an 8-character password. Then, check it according to the rules below. Then, output the word GOOD or BAD based on if the password follows the rules or not.

### Rules for valid passwords
To make your code easier, valid passwords must satisfy all of the following conditions:
* Exactly 8 characters
* At least one uppercase letter
* At least one lowercase letter
* At least one digit
* At least one symbol, which must be either `!` or `?` or `*` (and nothing else)


## Getting started
Open `src/main/java/edu/citadel/PasswordChecker.java` and add your code to the main method. To run your main method locally, enter the run and debug menu on the left, or right-click the main method and select `Run Java`.

To run the test cases locally, open a terminal and type `mvn test`. Alternatively, you can open the file `src/test/java/edu/citadel/PasswordCheckerTest.java` and click the play buttons. You can review the tests in this file, but do not modify any file other than `PasswordChecker.java`.

### Super big hint
We haven’t really learned loops yet, but a loop makes it really easy to process one character at a time in the password string without repeating our code over and over again. So, after you read in the password from the user with your scanner, use the following code to sequentially check each character in the string. I called my password string from the user `pw`, and each character is called `ch` as it is processed by the loop.
```java
    // code to prompt and read in the password goes up here before the loop
    for (char ch : pw.toCharArray()) { // don’t worry about how this works yet

	// Put your if-statements here to check the character ch
	// against the rules above. Consider using counters to track
	// the required character classes.

    }
    // code to check and finish up goes down here.
```

## Sample Output from four separate runs of the solution
```
ENTER PASSWORD PLEASE:
cadet
BAD
```
```
ENTER PASSWORD PLEASE:
cadet!
BAD
```
```
ENTER PASSWORD PLEASE:
Cadet!
BAD
```

## Testing and Submission
When you think you are done, commit your changes to GitHub to trigger the autograder. You can do this on the terminal, or using the Source Control menu option to the left (recommended). You do not need to create a branch or pull request; just commit your changes and push/synchronize them.

If you open the assignment page on GitHub.com you will see the results of your submission. If the tests pass locally when you run `mvn test`, they should also pass there with a little green checkmark.
