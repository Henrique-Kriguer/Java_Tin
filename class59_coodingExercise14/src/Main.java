public class Main {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(3,2000));


    }
    public static int getDaysInMonth(int month, int year){
        if (month<1 || month > 12 || year < 1 || year >= 9999 ) {
            return -1;

        }else{
            boolean lapYear = isLeapYear(year);

            switch (month){
                case 1:
                    return 31;
                case 2:
                    if(lapYear==false) {
                        return 28;
                    }else{
                        return 29;
                        }
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
                default:
                    return -1;
            }

        }
    }
    public static boolean isLeapYear(int year){
        if(year > 1 && year <= 9999 ) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else
                return false;
        }return false;
        }
    }
