package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

public class MySort implements Sort {

    @Override
    public void sort(Object[] array) { 
        //Массив объектов, не имплементирующий интерфейсы Comparable
        //или Comparator - не сортируется, поэтому сюда попадает массив типа Cat,
        //который не имплементирует эти интерфейсы.
        for(Object p : array) {
            System.out.println(p);
        }        
    }

    @Override
    public void sort(Comparable[] array) {
        Arrays.sort(array);
        for(Comparable p : array) {
            System.out.println(p);
        }
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        Arrays.sort(array, new MyComparator());
        for(Object p : array) {
            System.out.println(p);
        }
    }   
}
