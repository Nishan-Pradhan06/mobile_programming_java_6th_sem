package com.lunar.melo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class FirstActivity extends Activity {
    Button btnOk;
    @Override
    protected void onCreate(@Nullable Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.first_acitivity);
        btnOk= findViewById(R.id.button);
        btnOk.setOnClickListener(View->{
            Toast.makeText(FirstActivity.this,"Hi, Android Developers!!!",Toast.LENGTH_LONG).show();
        });
    }
}
