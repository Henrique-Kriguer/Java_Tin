import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter a number or any character to quit.");
        boolean valid = true;
        double counter = 1;
        double number;
        double Min = 0;
        double Max = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("enter number#" + counter);
                number = Double.parseDouble(sc.next());
                if (counter == 1 || Min > number) {
                    Min = number;
                }
                if (counter == 1 || Max < number) {
                    Max = number;
                }
                counter++;
            } catch (NumberFormatException e) {
                valid = false;
            }
        } while (valid);
        if (counter > 1 || valid) {
            System.out.println("Minimum number = " + Min);
            System.out.println("Maximum number = " + Max);
        } else {
            System.out.println("Programm finished.");
        }
    }
}