package bank.application;

public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest = 7;
        HdfcBank.rateOfInterest = 6;

        SBI account1 = new SBI(100000,"123","Dev");
        SBI account2 = new SBI(150000,"456","Rakshit");
        HdfcBank account3 = new HdfcBank(150000,"789","Mehran");

        //Wrong password
        int balance = account1.checkBalance("233");
        System.out.println("The balance for account1 is " + balance);

        //Correct password
        int balanceCheck = account1.checkBalance("123");
        System.out.println("The balance for account1 is " + balanceCheck);

        String bankMessage = account2.addMoney(50000);
        System.out.println(bankMessage);

        String message = account3.withdrawMoney(50000, "123");
        System.out.println(message);
        String message1 = account3.withdrawMoney(50000, "789");
        System.out.println(message1);

        double interest = account1.calculateTotalInterest(20);
        System.out.println("The total interest you will get " + interest);

        double interest1 = account3.calculateTotalInterest(20);
        System.out.println("The total interest you will get " + interest1);
    }
}