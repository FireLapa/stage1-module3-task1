package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public List<List<String>> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<String> secondList = new ArrayList<>();
        secondList.add(String.valueOf(firstList));
        return Collections.singletonList(secondList);
    }

    //TODO: Refactor Method-2
    public <T>Object genericMethod(Object data) {
        return (T)data;
    }

    //TODO: Refactor Method-3
    public <T> void cloneMethod(List<? super T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }

}