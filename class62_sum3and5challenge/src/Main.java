public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for( int n = 1; n <= 1000; n++){
            if(n % 3 == 0 && n % 5 == 0 ){
                System.out.println(n);
                sum += n;
                count ++;
            } if( count == 5){
                break;
            }
        }
        System.out.println(sum);
    }
}