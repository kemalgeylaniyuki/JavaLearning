package com.kemalgeylaniyuki.javalearning;

public class Variables {
    public static void main(String[] args){
        // Variables

        // Integer

        int age = 20;

        System.out.println(10 * age);
        System.out.println(age / 5);

        int x = 5;
        int y = 10;

        System.out.println(y / x);

        // Double - Float

        double z = 5;
        double a = 11;

        System.out.println(a / z);

        double pi = 3.14;
        int r = 5;
        double cevre;
        cevre = 2*pi*r;
        System.out.println(cevre);

        // String

        String name = "Kemal";
        String surname = "Yuki";
        String fullname = name + " " + surname;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);

        // Boolean : sadece doğru veya yanlış değerini alan değişken tipi

        boolean isAlive = true;
        isAlive = false;

        System.out.println(isAlive);

        // Final

        final int myInteger = 5; // final int yazarsak artık başka değer atayamayız!
        System.out.println("myInteger : " + myInteger);

        //myInteger = 4;   // final int olduğu için 4 değerini atayamayız
       // System.out.println("myInteger : " + myInteger);
    }
}


