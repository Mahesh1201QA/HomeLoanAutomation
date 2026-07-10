package com.homeloan.utils;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;


public class JsonReader {


    public static String getUserData(
            int index,
            String key
    ){


        String value = null;


        try{


            JSONParser parser =
                    new JSONParser();


            JSONObject jsonObject =
                    (JSONObject) parser.parse(
                            new FileReader(
                                    "src/test/resources/testdata/LoginData.json"
                            )
                    );


            JSONArray users =
                    (JSONArray) jsonObject.get("users");


            JSONObject user =
                    (JSONObject) users.get(index);


            value =
                    user.get(key).toString();


        }

        catch(Exception e){


            e.printStackTrace();


        }


        return value;


    }


}