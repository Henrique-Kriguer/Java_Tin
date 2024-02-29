public class Main {
    public static void main(String[] args) {

        System.out.println( getDurationString(56, 5600));
        System.out.println( getDurationString(8960));
    }

    public static String getDurationString(int seconds) {
        if( seconds <0 ){

            return "Invalid data !";
        }else {

            int hours = seconds / 3600;
            int minutes = (seconds % 3600);
            int remainMinutes = minutes/60;
            int remainSeconds = minutes % 60;

            return hours + "h " + remainMinutes + "m " + remainSeconds + "s";
        }



    }
   public static String getDurationString(int minutes, int seconds) {
       return getDurationString(seconds += minutes * 60);
   }
}
