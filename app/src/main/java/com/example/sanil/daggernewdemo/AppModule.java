package com.example.sanil.daggernewdemo;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by sanil on 21-07-2018.
 */

@Module(includes = AndroidInjectionModule.class)
public abstract class AppModule {


//    @Provides
//    @Singleton
    @Binds
    abstract SharedPrefDataSource getSharedPrefRepository(SharedPrefRepository sharedPrefRepository);
//    {
//        return new SharedPrefRepository(context);
//    }
}
