package basic;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args){

        Scanner day = new Scanner(System.in);
        System.out.println("Enter a day:");
        int dayNum = day.nextInt();

        switch(dayNum) {

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuseday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    }


