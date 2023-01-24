public class ChequingAccountTestHarness {
    public static void main (String [] args) {

        // Challenge 2

    ChequingAccount account1 = new ChequingAccount("Joe", "Smith", 300.15 , 102030);
    
    System.out.println("First Name: " + account1.getFirstName());
    System.out.println("Last Name: " + account1.getLastName());
    System.out.println("Balance: $" + account1.getBalance());
    System.out.println("Account Number: " + account1.getAccountNumber());
    

    }
}
