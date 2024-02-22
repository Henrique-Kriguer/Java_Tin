public class Main {
    public static void main(String[] args) {
       double kilometersPerHour = 120.0;
       printConversion(kilometersPerHour);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0 ){
            return -1;

        }else {
            kilometersPerHour/= 1.609;
        }
        return (Math.round(kilometersPerHour));
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0 ){
            System.out.println("Invalid value");
        }else{
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}