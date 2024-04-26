public class Main {
    public static void main(String[] args) {

        int number =4;
        int oddNumber = 0;
        int evenNumber = 0;
        while (number<=20){
            number++;
            if(!isEvenNumber(number)){
                oddNumber++;
                continue;
            }
            System.out.println(number + " is even number.");
            evenNumber++;

            if(evenNumber>=5){
                break;
            }
        }
        System.out.println("Total of even numbers: "+evenNumber);
        System.out.println("Total of odd numbers: "+oddNumber);

    }


    public static boolean isEvenNumber(int number){
        if(number%2 == 0) {
            return true;
        }return false;
    }
}
