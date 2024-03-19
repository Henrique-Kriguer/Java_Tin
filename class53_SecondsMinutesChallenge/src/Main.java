public class Main {
    public static void main(String[] args) {

        System.out.println( getDurationString(65, 45));
        System.out.println( getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        if( seconds <0 ){

            return "Invalid data for secounds! ( " + seconds + " ) Must be positive integer value.";
        }else {

            int hours = seconds / 3600;
            int minutes = (seconds % 3600);
            int remainMinutes = minutes/60;
            int remainSeconds = minutes % 60;

            return hours + "h " + remainMinutes + "m " + remainSeconds + "s";
        }



    }
   public static String getDurationString(int minutes, int seconds) {
       if (minutes<0 ){
           return "Invalid data for ( " + minutes + " )minutes must be integer positive value.";
       }else if (seconds<0 || seconds > 60){
           return "Invalid data for ( " +seconds + " ) seconds must be positive integer between 0 to 59.";

       }
       return getDurationString(seconds += minutes * 60);
   }
}
