package com.example.sanil.daggernewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity{

    @Inject
    SharedPrefDataSource sharedPrefRepository;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        AndroidInjection.inject(this);



        Log.i(Constant.TAG,"value is "+sharedPrefRepository.getString("Demo","No Val"));


        findViewById(R.id.txtVw).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sharedPrefRepository.putString("Demo","value 2");

                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);

            }
        });

    }
}
