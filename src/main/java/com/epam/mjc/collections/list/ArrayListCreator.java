package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        if (sourceList.size()<3) {
            return new ArrayList<>();
        }
        else {
            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i <= sourceList.size(); i++) {
                if (i % 3 == 0 && i!=0) {
                    strings.add(sourceList.get(i - 1));
                    strings.add(sourceList.get(i - 1));
                }
            }
            return strings;
        }
    }
}
