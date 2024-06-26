public class Main {


    public static void main(String[] args) {
        String currentYear = "2024";
        String usersDateOfBirth = "1971";

        int currentYearInt = Integer.parseInt(currentYear);
        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYearInt-dateOfBirth));
    }
}