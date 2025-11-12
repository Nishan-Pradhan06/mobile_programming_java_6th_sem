package com.lunar.interest_calulator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class InterestCalculator extends Activity {

    EditText editPrincipal, editTime,editRate;

    Button btnCalulate;

    TextView viewResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calulator_layout);


        editPrincipal= findViewById(R.id.editPrincipal);

        editRate = findViewById(R.id.editRate);

        editTime =  findViewById(R.id.editTime);

        btnCalulate = findViewById(R.id.btnCalulate);

        viewResult = findViewById(R.id.viewResult);

        btnCalulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float p,t,r,i;
                p = Float.parse
            }
        });
    }
}
