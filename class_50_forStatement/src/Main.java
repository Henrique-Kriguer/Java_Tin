public class Main {
    public static void main(String[] args) {
        for (int counter = 0; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestRate = interestCalculator(10000, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestRate);
        }
    }

        public static double interestCalculator ( double amount, double interestRate){
            return (amount * (interestRate / 100));
        }

}