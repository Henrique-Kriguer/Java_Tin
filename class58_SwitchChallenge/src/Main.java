

public class Main {
    public static void main(String[] args) {
        char switchValue = 'A';

        switch (switchValue) {
            case 'A':
                System.out.println(switchValue +" = Able");
                break;
            case 'B':
                System.out.println(switchValue +" = Baker");
                break;
            case 'C':
                System.out.println(switchValue +" = Charlie");
                break;
            case 'D':
                System.out.println(switchValue +" = Dog");
                break;
            case 'E':
                System.out.println(switchValue +" = Easy");
                break;
            default:
                System.out.println(switchValue +" = Invalid value");

        }

    }
}