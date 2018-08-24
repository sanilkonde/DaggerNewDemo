package com.example.sanil.daggernewdemo;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by sanil on 24-07-2018.
 */


@Module
public abstract class ActivityBinder {

    @ContributesAndroidInjector(modules = AppModule.class)
    abstract MainActivity injectMainActivity();

    @ContributesAndroidInjector(modules = AppModule.class)
    abstract HomeActivity demo1Activity();
}
