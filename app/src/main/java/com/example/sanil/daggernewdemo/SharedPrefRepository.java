package com.example.sanil.daggernewdemo;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * Created by sanil on 21-07-2018.
 */

public class SharedPrefRepository implements SharedPrefDataSource{

    SharedPreferences sharedPreferences;
    String sharedPrefName = "MVPSharedPref";


    @Inject
    public SharedPrefRepository(AppController context)
    {
        sharedPreferences = context.getSharedPreferences(sharedPrefName, Context.MODE_PRIVATE);
    }


    @Override
    public void putString(String key, String value) {

        sharedPreferences.edit().putString(key,value).commit();
    }

    @Override
    public String getString(String key,String defaultValue) {
        return sharedPreferences.getString(key,defaultValue);
    }
}
