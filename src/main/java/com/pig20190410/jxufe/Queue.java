package com.pig20190410.jxufe;

public interface Queue<T> {
    void push(T obj);
    T get();
    T pop();
}
