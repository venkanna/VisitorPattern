package com.venkanna.visitorpattern.cache;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by pcs-30 on 23/2/16.
 */
public class DataCacheImpl implements DataCache {

    private Context mContext;

    private SharedPreferences mPreferences;

    public DataCacheImpl(Context context) {
        mContext = context;
        mPreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
    }

    @Override
    public void saveResponse(String key, String value) {
        mPreferences.edit().putString(key,value).commit();
    }

    @Override
    public String getResponse(String key) {
        return mPreferences.getString(key,null);
    }
}
