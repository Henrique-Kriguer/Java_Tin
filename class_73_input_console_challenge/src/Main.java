import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while(counter<6){
            try {

                System.out.println("Enter number #" + counter);
                int number = Integer.parseInt(sc.next());
                sum += number;
                counter ++;

            } catch (NumberFormatException n){
                System.out.println("Bad data, please enter a valid integer number! Try again");

            }

        }
        System.out.println("sum = "+sum);

    }
}