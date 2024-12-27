public class Main {
    public static void main(String[] args) {

        String string = "Hello World";

        printInformation(string);

        System.out.println(string.toUpperCase());
        System.out.println(string.indexOf('d'));
        System.out.println(string.lastIndexOf('l'));
        System.out.println(string.startsWith("Hello"));
        System.out.println(string.endsWith("World"));
        System.out.println(string.contains("World"));

         }

         public static void printInformation(String string){

        int length = string.length();
        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last character is %c %n", string.charAt(length - 1));// length - 1 because index starts from 0

         }
}