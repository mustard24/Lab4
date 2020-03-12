package com.example.lab4;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class MilesToKilo extends Fragment implements View.OnClickListener {

    TextView txtOutput;
    TextView miles;
    public MilesToKilo() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_miles_to_kilo, container, false);

        txtOutput = (TextView)view.findViewById(R.id.kiloAnswer);
        miles = (TextView)view.findViewById(R.id.mileFill);

        Button b = (Button) view.findViewById(R.id.kilobutton);
        b.setOnClickListener( this );

        return view;

    }
    @Override
    public void onClick(View v) {

        try{
            Double answer =Double.valueOf(miles.getText().toString()) * 1.609;
            txtOutput.setText(answer.toString());
        }
        catch(Exception e){
            txtOutput.setText("ERROR");
        }

    }

}
