package com.example.sanil.daggernewdemo;



import dagger.android.AndroidInjector;
import dagger.android.DaggerActivity;
import dagger.android.DaggerApplication;

/**
 * Created by sanil on 21-07-2018.
 */

public class AppController extends DaggerApplication{


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {

        AppComponent appComponent = DaggerAppComponent.builder().attachApplicationContext(this).build();
        appComponent.inject(this);
        return appComponent;
    }
}
