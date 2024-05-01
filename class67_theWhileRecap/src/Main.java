public class Main {
    public static void main(String[] args) {
        int number = 0;

        while(number < 16) {
            number++;

            if (number <= 5) {
                System.out.println("number skipped " + number);
                continue;
            }
            System.out.println("number " + number);

            if (number >=10){
                System.out.println("stopping at number  " + number);
                break;

            }
        }
    }
}