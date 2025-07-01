public class AnnualPayCalculator {
    public static void main(String[] args) {
        
        double payAmount = 2000.00;  
        int payPeriods = 12;         

        double annualPay = payAmount * payPeriods;
        System.out.println("Total annual pay is:" + annualPay);
    }
}
