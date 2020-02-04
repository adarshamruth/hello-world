package com.ArutlaHarish.mavenexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Test_driver
{
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int sugarcontent = 0;
    int weight = 0;
    int price = 0;
    String sweetname="";
    int chocolatecontent = 0;
    int choco_weight = 0;
    int choco_price = 0;
    String Choco_name = "";

    System.out.println("Enter the Sweet details ");
    System.out.println("Enter the Details of Halwa");
    System.out.println("Enter the SugarContent of Halwa");
    sugarcontent = sc.nextInt();
    System.out.println("Enter the weight ");
    weight = sc.nextInt();
    System.out.println("Enter the price ");
    price = sc.nextInt();
    System.out.println("Enter the sweetname");
    sweetname =sc.next();
    Halwa halwa =new Halwa(sugarcontent, weight, price, sweetname);
    
    
    System.out.println("Enter the Details of Gulabjamun");
    System.out.println("Enter the SugarContent of Gulabjamun");
    sugarcontent = sc.nextInt();
    System.out.println("Enter the weight ");
    weight = sc.nextInt();
    System.out.println("Enter the price ");
    price = sc.nextInt();
    System.out.println("Enter the sweetname");
    sweetname =sc.next();
    GulabJamun gulabJamun = new GulabJamun(sugarcontent, weight, price, sweetname);

       

    System.out.println("Enter the Details of Kheer");
    System.out.println("Enter the SugarContent of Kheer");
    sugarcontent = sc.nextInt();
    System.out.println("Enter the weight ");
    weight = sc.nextInt();
    System.out.println("Enter the price ");
    price = sc.nextInt();
    System.out.println("Enter the sweetname");
    sweetname =sc.next();
    Kheer kheer = new Kheer(sugarcontent, weight, price, sweetname);

   
    ArrayList<Sweets> list =new ArrayList<Sweets>();
    list.add(halwa);
    list.add(kheer);
    list.add(gulabJamun);

    for(Sweets s:list)
    {
        System.out.println(s);
    }
    
    int totalweight = 0;
    for(Sweets sweets: list)
    {
        totalweight+=sweets.get_weight();
    }
    System.out.println("The Total Weight is "+totalweight);
   
    System.out.println("Enter the Chocolate details ");
    System.out.println("Enter the Details of Cadburry");
    System.out.println("Enter the ChocolateContent of Cadburry");
    chocolatecontent = sc.nextInt();
    System.out.println("Enter the weight ");
    choco_weight = sc.nextInt();
    System.out.println("Enter the price ");
    choco_price = sc.nextInt();
    System.out.println("Enter the sweetname");
    Choco_name =sc.next();
    Cadburry cadburry =new Cadburry(chocolatecontent,choco_weight , choco_price, Choco_name);
    
    
    System.out.println("Enter the Details of FiveStar");
    System.out.println("Enter the ChocolateContent of FiveStar");
    chocolatecontent = sc.nextInt();
    System.out.println("Enter the weight ");
    choco_weight = sc.nextInt();
    System.out.println("Enter the price ");
    choco_price = sc.nextInt();
    System.out.println("Enter the sweetname");
    Choco_name =sc.next();
    FiveStar fiveStar=new FiveStar(chocolatecontent,choco_weight , choco_price, Choco_name);

      

    
    System.out.println("Enter the Details of Gems");
    System.out.println("Enter the ChocolateContent of Gems");
    chocolatecontent = sc.nextInt();
    System.out.println("Enter the weight ");
    choco_weight = sc.nextInt();
    System.out.println("Enter the price ");
    choco_price = sc.nextInt();
    System.out.println("Enter the sweetname");
    Choco_name =sc.next();
    Gems gems=new Gems(chocolatecontent,choco_weight , choco_price, Choco_name);

    ArrayList<Chocolates> chocolates = new ArrayList<Chocolates>();
    chocolates.add(cadburry);
    chocolates.add(fiveStar);
    chocolates.add(gems);


    Collections.sort(chocolates,new Chocolates_sorter());
    System.out.println("After Sorting the Chocolates based on Weights");
    for(Chocolates c: chocolates)
    {
        System.out.println(c);
    }
    sc.close();
   


}
}