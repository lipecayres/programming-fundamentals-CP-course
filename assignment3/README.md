COMP 1030
Assignment #3

Setters, Getters, Constructors

Introduction
The purpose of this lab is to build two classes to demonstrate the concepts of instance variables, constructors, setters, getters, and blueprint classes (classes with no methods). During this lab you will build two java classes, the first class will contain the required state and behaviour for the object but NO main method.  The second class will contain simply the main method to give the JRE an entry point into the program, a line to instantiate a new object based upon the first class and a few lines to invoke the methods (behaviour) within the object to demonstrate their behaviour. 

When writing your code, keep these grading guidelines in mind:
•	Start each class with the proper javadoc comment header.  The first line of that header should be the purpose of the class not just its name, along with the three other required pieces of information.
•	Provide an explanation comment (not a javadoc comment) for each section of code.
•	Follow the layout for your blueprint class as illustrated below, 

Javadoc comment header
Import statements (if required)
Class declaration
	State (instance variables/data)
	Constructor(s) (if required)
	Behaviour(s)  (method(s))
Close class declaration

•	Use whitespace and proper indentations to make your code more readable and easy to debug.
•	Use notepad and the command prompt only to do your work.
•	Be sure to clearly understand your work 
•	Ensure your code is working according to the instructions

Challenge 1
Step 1     Using the terminal window create a directory called assignment3, below the COMP1030 directory to save your work.
Step 2     Create a class called ChequingAccount , following the layout above.  The specifications of the class are:  

Four instance variables (state) which will represent:
First  Name
Last  Name
Balance
Account  Number
One constructor that takes four arguments 
A setter and getter for each state

Challenge 2
Step 1     Create a second class (as a separate file) called ChequingAccountTestHarness.  
Step 2     Write a main method within this class.
Step 3     Within the main method test the class in the following way:

Instantiate a ChequingAccount object and pass in four appropriate arguments.
Print out the state of the object on separate lines (with an appropriate message for each state element) by invoking the appropriate getters.
Challenge 3
Step 1     Within the main method of challenge 2 of the test harness, add code to test the class in this way:
Use the appropriate setter methods to change the first and last name.
Again, print out the state of the object on separate lines (with an appropriate message for each state element) by invoking the appropriate getters inside the println() method.


Late Penalty
	A grade of 0 will be assigned to late submissions.

Here are some tips to help you to complete this assignment:

•	Read/listen to the lecture slides
•	Reference the topics using the recommended sites provided in the announcement to-do list for week #1.
•	Attend/listen to the tutorial recording
•	Reach out to your study group 




