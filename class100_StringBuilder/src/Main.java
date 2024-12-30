public class Main {
    public static void main(String[] args) {
        String string = "Hello " + "World";
        string.concat(" , is nice to be here !");
        StringBuilder builder = new StringBuilder("Hello " + "World");
        builder.append(" , is nice to be here !");
        
        printInformation(string);
        printInformation(builder);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
    }
}