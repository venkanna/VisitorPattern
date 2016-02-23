package com.venkanna.visitorpattern.visitor;

/**
 * Created by pcs-30 on 23/2/16.
 */
public interface StudentVisitable<T> {
    void accept(StudentVisitor studentVisitor,T holder);
}
