package com.venkanna.visitorpattern.visitor;

import android.content.Context;

import com.andhradroid.common.components.logger.Log;
import com.andhradroid.common.components.logger.LogImpl;
import com.andhradroid.common.components.util.ToastFactory;
import com.andhradroid.common.components.util.ToastFactoryImpl;


/**
 * Created by pcs-30 on 23/2/16.
 */
public class StudentVisitorFactory  {
    private Context mContext;
    private Log mlog;
    private ToastFactory toastFactory;

    public StudentVisitorFactory(Context context){
        mlog=new LogImpl();
        mContext = context;
        toastFactory = new ToastFactoryImpl(mContext);
    }

    public StudentVisitor newStudentAdapter(Context context){
        return new StudentVisitorImpl(context, mlog, toastFactory);
    }
}
