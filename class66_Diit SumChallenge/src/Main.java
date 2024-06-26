public class Main {
    public static void main(String[] args) {

        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-345));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(32123));
    }
    public static int sumDigits( int number){
        int sum=0;

        if(number <0){
            return -1;
        }
        while( number > 9) {
            sum += number % 10;
            number /= 10;
        }
        sum+=number;
        return sum;
    }
}