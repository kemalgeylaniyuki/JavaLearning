package com.kemalgeylaniyuki.javalearning;

public class Statements {

    public static void main(String[] args){

        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x = x * 5;
        System.out.println(x);

        int y = 4;

        System.out.println(x<y);

        System.out.println(x>y);

        y = 30;

        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x==y);
        System.out.println(x!=y);

        // and &&
        // or ||

        x = 30;
        y = 30;
        int z = 5;

        System.out.println(x<y && z>y);

        // if statements

        if (x < y) {
            System.out.println("y bigger x");
        }
        else if (x > y) {
            System.out.println("X bigger y");
        }
        else {
            System.out.println("x = y");
        }

        // Switch

        int day = 1;
        String dayString = " ";

        switch (day){

            case 1:
                dayString = "Monday";
                break;

            case 2:
                dayString = "Tuesday";
                break;

            case 3:
                dayString = "Wednesday";
                break;

            default:
                dayString = "Sunday";
        }

        System.out.println(dayString);



    }

}
