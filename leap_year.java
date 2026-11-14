public class leap_year {
    public static void main(String[] args) {
        System.out.println("Leap Year Checker");
        checkLeapYear(2020);
        checkLeapYear(2021);
    }

    public static void checkLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
