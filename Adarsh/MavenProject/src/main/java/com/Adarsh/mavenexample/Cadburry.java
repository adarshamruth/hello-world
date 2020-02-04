package com.ArutlaHarish.mavenexample;
class Cadburry extends Chocolates
{

    public Cadburry(int Chocolate_content, int weight, int price, String chocolate_name) {
        super(Chocolate_content, weight, price, chocolate_name);

    }

    @Override
    void Chocolate_description() {
        System.out.println( "I am CAdburr");

    }
    
}