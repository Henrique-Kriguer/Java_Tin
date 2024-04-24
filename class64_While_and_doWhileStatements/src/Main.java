public class Main {
    public static void main(String[] args) {
        /*
        int j = 0;
        while (j<=5){
        System.out.println(j);
        j++;
        another way to do the loop :
         int j = 0;
         while (true){
             if(j > 5){
                 break;
             }
             System.out.println(j);
             j++;
         }

         int k = 1;
         boolean isReady = true;
         do{
             if( k >5){
                 break;
             }
             System.out.println(k + " ( do while Statement )");
             k++;
         }while (isReady);*/

        int number = 0;
        while(number <50){
            number +=5;
            if(number % 25 == 0){
               continue;
            }
            System.out.print(number+ " - ");
        }
    }
}