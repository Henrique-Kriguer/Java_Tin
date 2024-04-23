public class Main {
    public static void main(String[] args) {
        int number = 1369;
        System.out.println(number +" is " + (isPrime(number)? "" : "NOT") + " a prime number.");
    }
    public static boolean isPrime(int number){
        if(number <=2 ){
            return number==2; // return false if number is different from 2;
        }
        for(int divisor = 2; divisor <= number/2; divisor ++){
            //System.out.println(divisor);
            if(number % divisor == 0) {
                System.out.println(number + " is divisible by "+ divisor);
                return false; // if some divisor are found, return false means number is not prime .
            }
        }
    return true; // if no divisor found, the number is prime.
    }
}