package com.venkanna.visitorpattern.model;

import com.venkanna.visitorpattern.helpers.StudentViewHolder;
import com.venkanna.visitorpattern.visitor.StudentVisitable;
import com.venkanna.visitorpattern.visitor.StudentVisitor;

/**
 * Created by pcs-30 on 23/2/16.
 */
public class Student extends Item  implements StudentVisitable<StudentViewHolder>{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(StudentVisitor studentVisitor,StudentViewHolder viewder) {
        studentVisitor.visit(this,viewder);
    }
}
