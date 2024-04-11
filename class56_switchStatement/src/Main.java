public class Main {
    public static void main(String[] args) {
//
//        int value = 1;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if ( value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

//        int switchValue = 7;
//
//        switch (switchValue){
//            case 1:
//                System.out.println("Value was 1 ");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println(" Values was 3, 4 or 5");
//                System.out.println("Value was " + switchValue);
//            default:
//                System.out.println(" Value wasn´t 1, 2, 3, 4 or 5");
//                break;
//        }

        int switchValue = 3;
        switch(switchValue){
            case 1 -> System.out.println(" Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> System.out.println("value was 3, 4 or 5");
            default -> {System.out.println("value was't 1,2,3,4,or 5");
                        System.out.println("Actually was a "+ switchValue);
        }}

        String month = "JANUARY";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
    public static  String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st"; }
            case "APRIL", "MAY", "JUNE" -> {yield "2nd"; }
            case "JULY", "AUGUST", "SEPTEMBER" -> {yield "3rd"; }
            case "OCTOBER", "NOVEMBER", "DEZEMBER" -> { yield "4th"; }
            default -> {
                String badresponse = month + " is bad";
                yield badresponse;
            }
        };
    }

}