public class car_emicalculator {
    public static void main(String[] args) {

        // inputs values.
        String vehicleModel = "mahindraScorpip";
        int onroadPrice = 2190887;
        int downPayment = 380000;
        double Intrest = 9.50;

        int loanPeriodYears = 4;

        // calculations
        double monthlyIntrestRate = Intrest / (12 * 100);
        int loanPeriod = loanPeriodYears * 12;

        int loanAmount = onroadPrice - downPayment;

        // emi formula

        double emi = (loanAmount * monthlyIntrestRate * Math.pow(1 + monthlyIntrestRate, loanPeriod)) /
                (Math.pow(1 + monthlyIntrestRate, loanPeriod) - 1);

        double totalPayable = emi * loanPeriod;

        System.out.println("vehical Model         : " + vehicleModel);
        System.out.println("Onroad Price          : " + onroadPrice);
        System.out.println("Down Payment          : ₹" + downPayment);
        System.out.println("Bank Intrest  Rate    : ₹" + Intrest);
        System.out.println("Loan Period           : ₹" + loanPeriodYears);
        System.out.println("Total Loan Amount     : ₹" + loanAmount);
        System.out.println("Payable Amount        : ₹" + totalPayable);
        System.out.println("EMI per MONTH         : ₹" + emi);



    }
}
