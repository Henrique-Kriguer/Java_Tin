import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

      System.out.println(getBucketCount(3.26,0.75));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        try {
            if(width<0||height<0||areaPerBucket<0){
                return -1;
            }
            return (int) Math.ceil((width * height / areaPerBucket) - extraBuckets);
        }catch (NumberFormatException e){
            System.out.println("Please try again, input an number");
        }
        return -1;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        try {
            if(width<0||height<0||areaPerBucket<0){
                return -1;
            }
            return (int) Math.ceil((width * height / areaPerBucket) );
        }catch (NumberFormatException e){
            System.out.println("Please try again, input an number");
        }
        return -1;
    }
    public static int getBucketCount(double area,double areaPerBucket){
        try {
            if(area<0||areaPerBucket<0){
                return -1;
            }
            return (int) Math.ceil((area / areaPerBucket) );
        }catch (NumberFormatException e){
            System.out.println("Please try again, input an number");
        }
        return -1;
    }
}