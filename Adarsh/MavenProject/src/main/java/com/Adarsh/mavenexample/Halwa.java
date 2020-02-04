package com.ArutlaHarish.mavenexample;
public class Halwa extends Sweets
{

    public Halwa(int sugar_content, int weight, int price, String sweetname) {
      
        super(sugar_content, weight, price, sweetname); 
    }

    @Override
    void Sweet_description() 
    {
    System.out.println("I am Halwa and I like to be more orange");
    }
    
}