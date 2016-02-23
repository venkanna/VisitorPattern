package com.venkanna.visitorpattern.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.venkanna.visitorpattern.R;
import com.venkanna.visitorpattern.helpers.BaseViewHolder;
import com.venkanna.visitorpattern.model.Employee;
import com.venkanna.visitorpattern.model.Item;
import com.venkanna.visitorpattern.model.Student;
import com.venkanna.visitorpattern.helpers.StudentViewHolder;
import com.venkanna.visitorpattern.visitor.StudentVisitable;
import com.venkanna.visitorpattern.visitor.StudentVisitor;

import java.util.List;

/**
 * Created by pcs-30 on 23/2/16.
 */
public class StudentAdapter extends BaseAdapter {

    private Context mcontext;

    private List<Item> list;

    private StudentVisitor msStudentVisitor;

    public StudentAdapter(final Context context, final List<Item> mlist,StudentVisitor studentVisitor) {
        this.mcontext = context;
        this.list = mlist;
        this.msStudentVisitor = studentVisitor;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Item getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        StudentViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mcontext).inflate(R.layout.list_item, null);
            holder = new StudentViewHolder();
            convertView.setTag(holder);
            holder.title = (TextView) convertView.findViewById(R.id.rowTextView);
        } else {
            holder = (StudentViewHolder) convertView.getTag();
        }
        //
//        holder.title.setText(getItem(position).getName());
//        msStudentVisitor.visit(getItem(position),holder);
        Item item =  getItem(position);
        if(item instanceof Student){
            Student s = (Student) getItem(position);
            s.accept(msStudentVisitor, holder);
        }else if(item instanceof Employee){
            Employee s = (Employee) getItem(position);
           // s.accept(msStudentVisitor, holder);
        }


        return convertView;
    }



}
