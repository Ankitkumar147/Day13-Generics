package com.Bridgelabz.generics;

public class GenericsFindMax <T extends Comparable<T>> {

    public <T extends Comparable<T>>T findMaximum(T x,T y,T z){
        T max = x;
        if (y.compareTo(max)>0)
            max = y;
        if (z.compareTo(max)>0)
            max = z;
        return max;
    }
    public static void main(String[] args) {
	GenericsFindMax genericsFindMax = new GenericsFindMax();
        System.out.println(genericsFindMax.findMaximum(4,5,3));

    }
}
