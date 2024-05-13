public class Main {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(212));
    }

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int numberModific = number;
        int lastDigit = 0;
        int evenSum = 0;
        while(numberModific>0){
            lastDigit = numberModific%10;
            if(lastDigit % 2==0){
                evenSum+=lastDigit;
            }
            numberModific/=10;
        }
        return evenSum;
    }


    /*
    Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.

The method should return the sum of the even digits within the number.

If the number is negative, the method should return -1 to indicate an invalid value.



EXAMPLE INPUT/OUTPUT:

getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20

getEvenDigitSum(252); → should return 4 since 2 + 2 = 4

getEvenDigitSum(-22); → should return -1 since the number is negative



NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.
     */
}