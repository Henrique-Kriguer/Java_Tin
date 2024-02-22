public class Main {
    public static void main(String[] args) {

        System.out.println("Height 1: "+ incheToCentimeterConverter(5,8) + " cm." );
        System.out.println("Height 2: "+ incheToCentimeterConverter(68) + " cm." );
    }

    public static double incheToCentimeterConverter(int heightInches){
        return heightInches * 2.54;
    }

    public static double incheToCentimeterConverter(int heightFeet, int heightInches){
        return incheToCentimeterConverter((heightFeet * 12)+heightInches);
    }
}