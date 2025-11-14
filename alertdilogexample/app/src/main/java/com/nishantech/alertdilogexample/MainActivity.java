package com.nishantech.alertdilogexample;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Button btnExit;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity_layout);


        btnExit= findViewById(R.id.btnExit);

        btnExit.setOnClickListener(e->{

            //finishAffinity(); close all activity that are active

            showDialogBox();
        });
    }


    protected  void  showDialogBox(){
        AlertDialog.Builder builder =new  AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Exit App");
        builder.setMessage("Are you sure you want to exit?");
        builder.setCancelable(false);
        builder.setPositiveButton("Exit",(dialog,which)->{
            finishAffinity();
        });
        builder.setNegativeButton("Cancel",(dialog,which)->{
            dialog.dismiss();
        });
        builder.show();
    }
}
