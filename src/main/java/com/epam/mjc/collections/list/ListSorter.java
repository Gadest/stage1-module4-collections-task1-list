package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
       sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        double first = 5*Math.pow(Double.parseDouble(a),2)+3;
        double second = 5*Math.pow(Double.parseDouble(b),2)+3;
        if (first>second) {
            return 1;
        } else if (first<second) {
            return -1;
        }
        else return -1;
    }
}
