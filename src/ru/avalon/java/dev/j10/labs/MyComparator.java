package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class MyComparator implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        String p1 = (String) t;
        String p2 = (String) t1;
        
        return p2.compareTo(p1);
    }    
}
