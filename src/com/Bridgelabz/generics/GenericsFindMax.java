package com.Bridgelabz.generics;

import java.util.*;

public class GenericsFindMax <T extends Comparable<T>> {

    public <T extends Comparable<T>>T findMaximum(T... x){
        T max = x[0];
        List <T> parameterArray = new ArrayList<>();
        for (T element : x){
            parameterArray.add(element);
            if(element.compareTo(max)>0){
                max = element;
            }
        }
        System.out.println("Maximum of "+parameterArray.toString()+" is "+max);
        return max;
    }
    public static void main(String[] args) {
	GenericsFindMax genericsFindMax = new GenericsFindMax();
        System.out.println(genericsFindMax.findMaximum(4,5,3,6,10));
        System.out.println(genericsFindMax.findMaximum(1.5,2.5,3.5,3.7));
        System.out.println(genericsFindMax.findMaximum("apple", "peach", "banana","orange"));
    }
}
