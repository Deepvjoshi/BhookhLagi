package com.example.deepjoshi.bhookh_lagi;

/**
 * Created by Deep Joshi on 15-12-2016.
 */

public class model {

    String name;
    int value; /* 0 -&gt; checkbox disable, 1 -&gt; checkbox enable */

    model(String name, int value){
        this.name = name;
        this.value = value;
    }
    public String getName(){
        return this.name;
    }
    public int getValue(){
        return this.value;
    }
}
