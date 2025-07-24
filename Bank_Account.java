public class Bank_Account {
    public static void main(String[] args) {
        

        //Account holder details

        String AccountHolderName = "kareemullapacha";
        double BankBalance =20000.00;
        double withdrawlAmount = 1000;
        double DepositeAmount = 2000;
        int NumOfTransactions = 0;
        double Minium_Balance = 500.00;

        //calculations
        double FirstTransaction = BankBalance-withdrawlAmount;
        NumOfTransactions++;
        double SecondTransaction = FirstTransaction-DepositeAmount;
        NumOfTransactions++;

        boolean isActive = NumOfTransactions>0;

        

        boolean belowMinimummBalance = BankBalance<Minium_Balance;

        boolean accountStatus = isActive && ! belowMinimummBalance;

        //account details.

        System.out.println("-----------ACCOUNT DETAILS-----------");
        System.out.println("BANK HOLDER NAME :"+AccountHolderName);
        System.out.println("BANK BALANCE :"+BankBalance);
        System.out.println("-----------Transactions-----------");
        System.out.println("FIRST TRANSACTION : "+FirstTransaction);
        System.out.println("SECOND TRANSACTION :"+SecondTransaction);
        System.out.println("Number of Transactions : " + String.format("%02d", NumOfTransactions));
        System.out.println("Balance Below Minimum :" + isActive);
        System.out.println("Account Status :"+accountStatus);
        

    }
    
}
