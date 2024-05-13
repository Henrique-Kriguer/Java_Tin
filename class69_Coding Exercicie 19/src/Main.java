public class Main {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(23,34));
    }
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 > 99 || number1 < 10 || number2 > 99 || number2 < 10) {
            return false;
        }
        int Lastdigit1 = number1%10;
        int firstDigit1 = number1/10;
        int Lastdigit2 = number2%10;
        int firstDigit2 = number2/10;

        if(firstDigit1 == Lastdigit1 ||
                firstDigit1 == firstDigit2 ||
                    firstDigit1 == Lastdigit2 ||
                        Lastdigit1 == firstDigit2 ||
                            Lastdigit1 == Lastdigit2 ||
                                firstDigit2 == Lastdigit2)  {

            return true;
        }
        return false;
    }
}
/*
Shared Digit
Write a method named hasSharedDigit with two parameters of type int.

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers
is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers,
 such as 2 in 12 and 23; otherwise, the method should return false.



EXAMPLE INPUT/OUTPUT:

hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers


 */