package com.example.lab4;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TipCalculator extends Fragment implements View.OnClickListener {

    TextView txtOutput;
    TextView total;
    TextView tipPercentage;
    TextView numPeople;
    public TipCalculator() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tip_calculator, container, false);

        txtOutput = (TextView)view.findViewById(R.id.tipCalculated);
        total = (TextView)view.findViewById(R.id.totalField);
        tipPercentage = (TextView) view.findViewById(R.id.tipField);
        numPeople = (TextView) view.findViewById(R.id.peopleField);


        Button b = (Button)view.findViewById(R.id.tipButton);
        b.setOnClickListener( this );

        return view;

    }
    @Override
    public void onClick(View v) {
        try{
            Double billTotal = Double.valueOf(total.getText().toString());
            Double percentage = Double.valueOf(tipPercentage.getText().toString())/100;
            Integer people = Integer.parseInt(numPeople.getText().toString());
            Double finalAnswer = ((billTotal * percentage) + billTotal) / people;
            if(people == 0){
                txtOutput.setText("Cannot divide by 0 people");
            }
            txtOutput.setText("$" + finalAnswer);
        }
        catch(Exception e){
            txtOutput.setText("ERROR");
        }




    }

}
