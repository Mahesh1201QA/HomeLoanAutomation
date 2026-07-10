package com.homeloan.tests;


import com.homeloan.utils.JsonReader;


public class JsonTest {


    public static void main(String[] args) {


        System.out.println(
                JsonReader.getUserData(
                        0,
                        "username"
                )
        );


        System.out.println(
                JsonReader.getUserData(
                        0,
                        "password"
                )
        );


    }


}