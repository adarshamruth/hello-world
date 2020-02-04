package com.ArutlaHarish.mavenexample;
public class Gems extends Chocolates
{

    public Gems(int Chocolate_content, int weight, int price, String chocolate_name) {
        
        super(Chocolate_content, weight, price, chocolate_name);
       
    }

    @Override
    void Chocolate_description() {
   System.out.println("I am Gems");
    }

}