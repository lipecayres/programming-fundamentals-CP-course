/**	Application Purpose: Learn methods and basic operations on Java
*	Author: Felipe Cayres
*	Date: Jan 18th, 2023
*	Time: 11 PM
*/

    // Challenge 2

public class JavaCodeTester2 {                  // Step 1
    public static void main(String[]args) {     // Step 2 and 3
        String firstName = "Felipe";          //    
        String secondName = "Simoes";         // Step 4 - 
        String lastName = "Cayres";           //

        String fullName = firstName + secondName + lastName;   // Step 5

        System.out.println(fullName.charAt(2) + " " + fullName.charAt(4) + " " + fullName.charAt(6));
        System.out.println("These are the 3rd, 5th and 7th character of the concatenated string!");   // Step 6 

        System.out.println(fullName.startsWith("test"));      // Step 7 

        System.out.println(fullName.toUpperCase());       // Step 8 

        int incrementBeforeTest = 0;               // Step 9

        System.out.println(incrementBeforeTest);           //
        System.out.println(++incrementBeforeTest);         // Step 10 
        System.out.println(incrementBeforeTest);           //     

        int incrementAfterText = 0;                       //  
        System.out.println(incrementAfterText);           // Step 11 
        System.out.println(incrementAfterText++);         //     
        System.out.println(incrementAfterText);           //

        // Question - What did you notice about the print outs?

        /* When we place the increment operator before the variable, it's going to add a number before showing at the display.
         * This way we are available to see the incremented number at first following occurrence.
         *  
         * But when we place the increment operator after the variable, the sum is going to happen after the number showing
         * at the display. So, we just are available to see the incremented number at the second following occurrence. 
        */
    
    //
    // Challenge 3
    //

        int eggsPack = 12;        // Step 1 

        if (eggsPack % 2 == 0){           // Step 2
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}
    