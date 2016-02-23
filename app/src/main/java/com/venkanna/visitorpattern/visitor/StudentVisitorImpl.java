package com.venkanna.visitorpattern.visitor;

import android.content.Context;

import com.andhradroid.common.components.logger.Log;
import com.andhradroid.common.components.util.ToastFactory;
import com.venkanna.visitorpattern.helpers.StudentViewHolder;
import com.venkanna.visitorpattern.model.Employee;
import com.venkanna.visitorpattern.model.Student;

/**
 * Created by pcs-30 on 23/2/16.
 */
public class StudentVisitorImpl implements StudentVisitor{
    private Log log;
    private ToastFactory toastFactory;
    private Context mcontext;

    public StudentVisitorImpl(Context context,Log log, ToastFactory toastFactory){

    }

    @Override
    public void visit(Student student, StudentViewHolder viewHolder) {
        viewHolder.title.setText(student.getName());
    }

    @Override
    public void visit(Employee employee, StudentViewHolder viewHolder) {
        viewHolder.title.setText(employee.getName());
    }
}
