package com.venkanna.visitorpattern.visitor;

import com.venkanna.visitorpattern.helpers.StudentViewHolder;
import com.venkanna.visitorpattern.model.Employee;
import com.venkanna.visitorpattern.model.Student;

/**
 * Created by pcs-30 on 23/2/16.
 */
public interface StudentVisitor {
    void visit(Student student, StudentViewHolder viewHolder);
    void visit(Employee employee, StudentViewHolder viewHolder);
}
