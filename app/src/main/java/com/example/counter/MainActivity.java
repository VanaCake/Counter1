package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CounterClass counter;
    private TextView counterTV;
    private TextView multiTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterTV = (TextView) findViewById(R.id.value_tv);
        multiTV = (TextView) findViewById(R.id.multiplierValue);
        counter = new CounterClass();
    }

    public void incrementCounterClass(View v){
        counter.increment();
        String newValue = String.valueOf(counter.getValue());
        counterTV.setText(newValue);
    }

    public void resetCounterClass(View v){
        counter.reset();
        String newValue = String.valueOf(counter.getValue());
        counterTV.setText(newValue);
        multiTV.setText("Multiplier: x1");
    }

    public void changeIncrementCounterClass(View v){
        if(counter.getValue() >= counter.getCost()){
            counter.changeIncrement();
            counter.setValue(counter.getValue() - counter.getCost());
            String newValue = String.valueOf(counter.getValue());
            counterTV.setText(newValue);
        }
    }
}