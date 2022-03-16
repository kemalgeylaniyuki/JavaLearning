package com.kemalgeylaniyuki.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args){

        // Arrays

        String[] myStringArray = new String[3]; // myStringArray adında obje oluştur

        myStringArray[0] = "Kemal";
        myStringArray[1] = "Geylani";
        myStringArray[2] = "Yuki";

        System.out.println(myStringArray[1]);

        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;

        System.out.println(myIntegerArray[1]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8,9};
        System.out.println(myNumberArray[2]);

        // Lists : dizilere göre daha esnek

        ArrayList<String> myMusicans = new ArrayList<>();

        myMusicans.add("Kemal");
        myMusicans.add("Geylani");
        myMusicans.add(1,"Yuki");
        myMusicans.add("Rob");

        System.out.println(myMusicans.get(0));
        System.out.println(myMusicans.get(1));
        System.out.println(myMusicans.get(2));
        System.out.println(myMusicans.get(3));

        System.out.println(myMusicans.size());

        // Sets : bir eleman içerisinde bir kez yer alabiliyor.

        HashSet<String> mySet = new HashSet<>();

        mySet.add("Kemal");
        mySet.add("Kemal");

        System.out.println(mySet.size() );

        // HashMap : index yerine anahtar kelime kullanabiliyoruz

        HashMap<String, String> myHashMap = new HashMap<>();

        myHashMap.put("name", "Kemal");
        myHashMap.put("Instrument", "Guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("Instrument"));

        HashMap<String, Integer> mySecondMap = new HashMap<>();

        mySecondMap.put("run", 100);
        mySecondMap.put("basketball", 200);

        System.out.println(mySecondMap.get("run"));
        System.out.println(mySecondMap.get("basketball"));
        

        

        

        

    }
}
