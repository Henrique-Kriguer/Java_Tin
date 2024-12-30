public class Main {
    public static void main(String[] args) {
        String birthdate = "23/10/1971";
        int startingIndex = birthdate.indexOf("1971");
        System.out.println("startingIndex= " + startingIndex);
        System.out.println("Birth year = " + birthdate.substring(startingIndex));

        System.out.println("Month= " + birthdate.substring(3,5));

        String newDate = String.join("-", "23", "10", "1971");
        System.out.println("newDate= " + newDate);

        System.out.println("-".repeat(40));
    }
}