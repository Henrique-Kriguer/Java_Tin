public class Main {
    public static void main(String[] args) {

        String bullet = "Print a Bullet list: " +
                "\n\t\u2022 first bullet" +
                "\n\t\u2022 second bullet" +
                "\n\t\u2022 third bullet\n";

        System.out.println(bullet);

        String textBlock = """
                print a bullet list:
                \t\u2022 first bullet
                \t\u2022 second bullet
                \t\u2022 third bullet
                """;
        System.out.println(textBlock);

        int age = 53;
        int yearBirth = 2024-age; ;

        System.out.printf("Age = %.1f, Year of birth: %d%n%n",(float)age,yearBirth);

        for( int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }
    }
}