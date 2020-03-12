package com.example.lab4;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FarenheitToCelsius extends Fragment implements OnClickListener {

    TextView txtOutput;
    TextView fahrenheitText;
    public FarenheitToCelsius() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_f_to_c, container, false);

        txtOutput = (TextView)view.findViewById(R.id.celsiusAnswer);
        fahrenheitText = (TextView)view.findViewById(R.id.editFarenheitText);


        Button b = (Button)view.findViewById(R.id.celsiusButton);
        b.setOnClickListener( this );

        return view;

    }
    @Override
    public void onClick(View v) {
        double fahrenheit = Double.valueOf(fahrenheitText.getText().toString());
        Double celsius = (fahrenheit - 32) * 5 / 9;

        txtOutput.setText(celsius.toString());


    }

}
