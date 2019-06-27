package com.pig20190410.jxufe;

import java.util.ArrayList;

public class ArrayListQueue<T> implements Queue<T> {

    private ArrayList arrayList = new ArrayList();

    private int length = arrayList.size();

    @Override
    public void push(T obj) {
        arrayList.add(0,obj);
    }

    @Override
    public T get() {
        return (T)arrayList.get(length);
    }

    @Override
    public T pop() {
        return (T)arrayList.get(length);
    }
}
