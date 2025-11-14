package com.nishantech.new_app_fragmentations;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CircleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.circle_layout,container,false);
        Button btnCal = v.findViewById(R.id.calRadius);

        EditText editRadius;

        editRadius =v.findViewById(R.id.editRadius);

        btnCal.setOnClickListener(e->{
            float radius = Float.parseFloat(editRadius.getText().toString());

            double area = Math.PI *radius*radius;

            Toast.makeText(getContext(),"Area of Circle is: " +(area),Toast.LENGTH_LONG).show();
        });

        return  v;
    }
}
