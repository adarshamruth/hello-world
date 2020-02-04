package com.ArutlaHarish.mavenexample;
 public class FiveStar extends Chocolates
{

    public FiveStar(int Chocolate_content, int weight, int price, String chocolate_name) {
        super(Chocolate_content, weight, price, chocolate_name);
       
    }

    @Override
    void Chocolate_description() {
   System.out.println("I am Five Star");
    }

}