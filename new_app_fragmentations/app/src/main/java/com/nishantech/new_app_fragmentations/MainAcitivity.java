package com.nishantech.new_app_fragmentations;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainAcitivity extends AppCompatActivity {

    Button btnRect, btnCircle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        btnRect= findViewById(R.id.btnRect);
        btnCircle =findViewById(R.id.btnCircle);

        //BUTTON ONE
        btnRect.setOnClickListener(e->{
          loadFragment(new RectangleFragment());
        });

        //BUTTON TWO

        btnCircle.setOnClickListener(e->{
           loadFragment(new CircleFragment());
        });
    }


    /// REUSEABLE FOR BUTTON
    public void loadFragment(Fragment f){
        FragmentManager fa = getSupportFragmentManager();
        FragmentTransaction transaction = fa.beginTransaction();
        transaction.replace(R.id.myFrame,f);
        transaction.commit();
    }
}
