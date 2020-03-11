package com.example.lab4;

import com.example.lab4.MainActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FarenheitToCelsius extends Fragment {

    TextView farenheitText;
    public FarenheitToCelsius() {
        // Required empty public constructor
    }
    public FarenheitToCelsius(View view){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f_to_c, container, false);
    }

}
