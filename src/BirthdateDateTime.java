import java.util.Scanner;

public class BirthdateDateTime {
    public static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        int year = (SafeInput.getRangedInt(in, "Enter your year of birth", 1950, 2015));
        int month = (SafeInput.getRangedInt(in, "Enter your month of birth", 1, 12));
        int numDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && (!(year % 100 == 0)) || (year % 400 == 0))) {
                    numDays = 29;}
                else {
                    numDays = 28;}
                break;
        }
        int day = (SafeInput.getRangedInt(in, "Enter your day of birth", 1, numDays));
        int hour = (SafeInput.getRangedInt(in, "Enter your hour of birth in 24 hour format", 1, 24));
        int minute = (SafeInput.getRangedInt(in, "Enter your minute of birth in 24 hour format", 1, 60));
        String afterNoonCheck = " A.M.";
        if (hour > 12) {
            hour -= 12;
            afterNoonCheck = " P.M.";
        }
        System.out.println("You were born at " + hour + ":" + minute + afterNoonCheck + " on " + month + "/" + day + "/" + year + ".");
    }}