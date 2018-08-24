package com.example.sanil.daggernewdemo;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by sanil on 21-07-2018.
 */

@Singleton
@Component(modules = {ActivityBinder.class,AndroidSupportInjectionModule.class,AndroidInjectionModule.class})
interface AppComponent extends AndroidInjector<DaggerApplication> {
    void inject(AppController app);
    @Component.Builder
    interface Builder{

        @BindsInstance
        AppComponent.Builder attachApplicationContext(AppController application);
        AppComponent build();


    }
}
