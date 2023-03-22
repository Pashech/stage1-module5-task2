package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        List<Integer> list = new ArrayList<>();
        return (list1) -> {
            for(Integer i : list1){
                list.add(i / divider);
            }
            return list;
        };
    }
}
