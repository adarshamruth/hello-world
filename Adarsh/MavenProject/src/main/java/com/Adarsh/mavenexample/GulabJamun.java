package com.ArutlaHarish.mavenexample;
public class GulabJamun extends Sweets
{

    public GulabJamun(int sugar_content, int weight, int price, String sweetname) {
        super(sugar_content, weight, price, sweetname);  
    }

    @Override
    void Sweet_description() {
        System.out.println("I am Gulab jamun i like to be in Brown colour");
    }

}
