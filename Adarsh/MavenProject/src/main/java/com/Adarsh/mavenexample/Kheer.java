package com.ArutlaHarish.mavenexample;
public class Kheer extends Sweets
{

    public Kheer(int sugar_content, int weight, int price, String sweetname) {
     
        super(sugar_content, weight, price, sweetname);
       
    }

    @Override
    void Sweet_description() {
      System.out.println("I am Kheer and I like to be in Green Colour");
        
    }

}
