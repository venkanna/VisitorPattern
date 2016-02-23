package com.venkanna.visitorpattern;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.venkanna.visitorpattern.adapters.StudentAdapter;
import com.venkanna.visitorpattern.model.Item;
import com.venkanna.visitorpattern.model.Student;
import com.venkanna.visitorpattern.visitor.StudentVisitor;
import com.venkanna.visitorpattern.visitor.StudentVisitorFactory;

import java.util.ArrayList;
import java.util.List;

public class MainVisitorActivity extends AppCompatActivity {

    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_visitor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        List<Item> studentList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Student mStudent = new Student();
            mStudent.setName("Student #" + i);
            studentList.add(mStudent);
        }
        list = (ListView) findViewById(R.id.list);
        StudentVisitor visitor = new StudentVisitorFactory(this).newStudentAdapter(this);
        //StudentVisitor visitor = new StudentVisitor();
        StudentAdapter adapter = new StudentAdapter(MainVisitorActivity.this, studentList, visitor);
        list.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_visitor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
