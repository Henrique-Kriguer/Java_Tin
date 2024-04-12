public class Main {
    public static void main(String[] args) {
        int day = 2;
    printDayOfWeek(day);
    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek =
        switch (day) {
            case 0 -> {
                yield "sunday";
            }
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            default -> day + "is out of week number ";

        };
        System.out.println(day + " - "+ dayOfWeek);
    }
}