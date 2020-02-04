package com.ArutlaHarish.mavenexample;
import java.util.*;
class Chocolates_sorter implements Comparator<Chocolates>
{

    @Override
    public int compare(Chocolates o1, Chocolates o2) {
        return o2.get_weight()-o1.get_weight();
    }
  

}