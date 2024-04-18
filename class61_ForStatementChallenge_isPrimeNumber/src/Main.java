public class Main {
    public static void main(String[] args) {
        int number = 99;
        System.out.println(number +" is " + (isPrime(number)? "" : "NOT") + " a prime number.");
    }
    public static boolean isPrime(int number){
        if(number <=2 ){
            return number==2; // return false if number is different from 2;
        }
        for(int divisor = 2; divisor <= number/2; divisor ++){
            if(number % divisor == 0) {
                return false;
            }
        }
    return true;
    }
}