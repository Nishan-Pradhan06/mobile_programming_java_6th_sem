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

public class RectangleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.rectangle_layout,container,false);
        Button btnCal = v.findViewById(R.id.calculateRect);

        EditText editLength, editBreadth;

        editLength =v.findViewById(R.id.editLength);
        editBreadth=v.findViewById(R.id.editBreadth);

        btnCal.setOnClickListener(e->{
            float length = Float.parseFloat(editLength.getText().toString());
            float breadth =Float.parseFloat(editBreadth.getText().toString());

            float area = length*breadth;

            Toast.makeText(getContext(),"Area of Reactangle is: " +(area),Toast.LENGTH_LONG).show();
        });

        return  v;
    }
}
