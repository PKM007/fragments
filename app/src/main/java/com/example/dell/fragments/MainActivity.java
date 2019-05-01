package com.example.dell.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeFragment(View view){
        Fragment fragment1,fragment2;

        if(view == findViewById(R.id.button))
        {
            fragment1=new FragmentOne();
            FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_place,fragment1);
            ft.commit();
        }
        if(view == findViewById(R.id.button2))
        {
            fragment2=new FragmentTwo();
            FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_place,fragment2);
            ft.commit();
        }
    }
}
