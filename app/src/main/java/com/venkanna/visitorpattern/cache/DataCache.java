package com.venkanna.visitorpattern.cache;

public interface DataCache {

    void saveResponse(String key, String value) ;

    String getResponse(String key);

}

