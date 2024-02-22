public class Main {
    public static void main(String[] args) {
        // printMegaBytesAndKiloBytes(2000);
        //System.out.println(isLapYear(2600));
        //1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756 ));

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int mod = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " kb = " + megaBytes + " MB and " + mod + " KB");
        }
    }

    public static boolean isLapYear(int year) {
        if (year<1 || year>9999) {
            return false;
        } else {
            if ((year % 4 == 0 && year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100!= 0)) {
                return true;
            } else {
                return false;
            }
        }
    }

          public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        /*DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.



EXAMPLES OF INPUT/OUTPUT:

areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.

*/
              long number1Rounded = (long) (number1*1000);
              long number2Rounded = (long) (number2*1000);
              System.out.println(number1Rounded+" - "+number2Rounded);
              return number1Rounded == number2Rounded;

          }
    }



