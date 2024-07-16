import java.util.Scanner;

public class Main {

    public static void main (String args[]) {


       // public static void inputThenPrintSumAndAverage() {
            Scanner sc = new Scanner(System.in);
            int number = 0;
            int sum = 0;
            long avg = 0;
            int counter = 0;

            while (true) {
                try {
                    number = Integer.parseInt(sc.next());
                    sum += number;
                    counter++;
                } catch (NumberFormatException e) {
                    break;
                }
                avg = sum / counter;
            }
        System.out.println(sum);
        System.out.println(counter);
        System.out.println(avg);
        }

    //}
}