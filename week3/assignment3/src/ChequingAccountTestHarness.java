public class ChequingAccountTestHarness {
    public static void main (String [] args) {

        // Challenge 2

    ChequingAccount account1 = new ChequingAccount("Joe", "Smith", 300.15 , 102030);

    System.out.println();    
    System.out.println("Account Informations:");
    System.out.println("--- " + "First Name: " + account1.getFirstName());
    System.out.println("--- " +"Last Name: " + account1.getLastName());
    System.out.println("--- " +"Balance: $" + account1.getBalance());
    System.out.println("--- " +"Account Number: " + account1.getAccountNumber());
    
    System.out.println();

        // Challenge 3
    
    System.out.println("Account Informations Updated:");
    account1.setFirstName("Camila");
    account1.setLastName("Cayres");

    System.out.println();
    System.out.println("New First Name: " + account1.getFirstName());
    System.out.println("New Last Name: " + account1.getLastName());
    System.out.println();

    //    System.out.println("Balance: $" + account1.getBalance());
//    System.out.println("Account Number: " + account1.getAccountNumber());


    System.out.println("Account Informations:");
    System.out.println("--- " + "First Name: " + account1.getFirstName());
    System.out.println("--- " +"Last Name: " + account1.getLastName());
    System.out.println("--- " +"Balance: $" + account1.getBalance());
    System.out.println("--- " +"Account Number: " + account1.getAccountNumber());

System.out.println();



    System.out.println();

}
}
