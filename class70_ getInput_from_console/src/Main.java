import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;
        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static int checkdata(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }
        return (currentYear - dob);
    }
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what´s your name ? ");
        System.out.println("Hi " + name + " ,thanks for taking the couser!\"");
        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

        public static String getInputFromScanner(int currentYear){

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, what´s your name?");
        String name = sc.nextLine();
        System.out.println("Hi "+ name + " ,thanks for taking the couser!\"");
        System.out.println("What year were you born? ");
            boolean validDob = false;
            int age = 0;

            do {
                System.out.println("Enter a year of birth >= " +
                        (currentYear - 125) + " and <= " + (currentYear));
                try {
                    age = checkdata(currentYear, sc.nextLine());
                    validDob = age < 0 ? false : true;
                } catch (NumberFormatException badUserData){
                    System.out.println("Characters not allowedd!!! Try again.");
                }

            } while (!validDob);
            return "So you are " + age + " years old";
    }
}