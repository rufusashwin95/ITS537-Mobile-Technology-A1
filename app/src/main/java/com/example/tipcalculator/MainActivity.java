package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                double tippercent = 0.15;
                double bill = GetBillAmount();
                double tip = CalculateTip(tippercent, bill);
                DisplayTotalBillWithTip(tip, bill);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                double tippercent = 0.18;
                double bill = GetBillAmount();
                double tip = CalculateTip(tippercent, bill);
                DisplayTotalBillWithTip(tip, bill);

            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                double tippercent = 0.20;
                double bill = GetBillAmount();
                double tip = CalculateTip(tippercent, bill);
                DisplayTotalBillWithTip(tip, bill);
            }
        });
    }

    private double GetBillAmount()
    {
        EditText billtext = findViewById(R.id.editTextNumberDecimal);
        return new Double(billtext.getText().toString());
    }

    private double CalculateTip(double tip, double total)
    {
        return tip * total;
    }

    public void DisplayTotalBillWithTip(double tipAmt, double billAmt)
    {
        TextView tipviewtext = findViewById(R.id.textView);
        tipviewtext.setText("Tip: " + tipAmt + ", Total Bill: "+(tipAmt+billAmt)+".");
    }
}