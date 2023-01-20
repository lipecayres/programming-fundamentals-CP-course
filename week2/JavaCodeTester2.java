/**	Application Purpose: Learn methods and bacis operations on Java
*	Author: Felipe Cayres
*	Date: Jan 18th, 2023
*	Time: 11 PM
*/

    // Challenge 2

public class JavaCodeTester2 {                  // Step 1 - declaration called JavaCodeTester1  
    public static void main(String[]args) {     // Step 2 and 3 - main method
        String stringTest1 = "String1";         //    
        String stringTest2 = "String2";         // Step 4 - Store three String values in three different variables 
        String stringTest3 = "String3";         //

        String stringsConcatenate = stringTest1 + stringTest2 + stringTest3;   // Step 5 - Concatenate the three Strings 

        System.out.println(stringsConcatenate.charAt(2) + " " + stringsConcatenate.charAt(4) + " " + stringsConcatenate.charAt(6));
        System.out.println("These are the 3rd, 5th and 7th character of the concatenated string!");   // Step 6 - Display the 3rd and 5th and 7th character + message.

        System.out.println(stringsConcatenate.startsWith("test"));      // Step 7 - Display the Boolean value (start with "test"?)

        System.out.println(stringsConcatenate.toUpperCase());       // Step 8 - display string in all upper case letters

        int integerTest1 = 0;               // Step 9 - Store an integer value in a variable

        System.out.println(integerTest1);           //
        System.out.println(++integerTest1);         // Step 10 - Use the increment operator to display the value of the variable 
        System.out.println(integerTest1);           //      (Increment before)

        int integerTest2 = 0;                       //  
        System.out.println(integerTest2);           // Step 11 - Use the increment operator to display the value of the same variable
        System.out.println(integerTest2++);         //      (increment after)
        System.out.println(integerTest2);           //

        // Question - What did you notice about the print outs?

        /* When we place the increment operator before the variable, it's gonna add a number before showing at the display.
         * This way we are available to see the incremented number at first following occurrence.
         *  
         * But when we place the increment operator after the variable, the sum is gonna happen after the number showing
         * at the display. So, we just are available to see the incremented number at the second following occurrence. 
        */

    // Challenge 3

    int numberTest = 15;        // Step 1 - store an integer value in a variable 

    if (numberTest % 2 == 0){           // Step 2 - modulus operator to determine if is even or odd
        System.out.println("The number is even");
    } else {
        System.out.println("The number is odd");
    }

        }
}
    