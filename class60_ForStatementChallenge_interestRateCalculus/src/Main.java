public class Main {
    public static void main(String[] args) {
        double amount = 1000;
        for(double rate = 7.5; rate <= 10.0 ; rate += 0.25){
            double parcel = interestCalculator(amount, rate);
            if(rate>8.0){
                break;
            }
            System.out.println(amount +" amount with a interest rate of "+ rate+ " results: $"+ parcel);

        }

    }
    public static double interestCalculator(double amount, double interestRate){
        return (amount * (interestRate / 100.0));
    }
}