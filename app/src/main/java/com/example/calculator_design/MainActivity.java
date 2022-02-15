package com.example.calculator_design;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textone;
    TextView texttwo;
    Button bc, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdot, beq, bpi, bx, bd, bp, bm, b0, bln, brut;

    Double ValueOne, ValueTwo;
    double result, plusresult;
    Double result2, result3, Value;
    boolean Addition, Substruction, Multiplication, Division, Lon, Root;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        bc = findViewById(R.id.bc);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bdot = findViewById(R.id.bdot);
        beq = findViewById(R.id.beq);
        bpi = findViewById(R.id.bpi);
        bx = findViewById(R.id.bx);
        bd = findViewById(R.id.bd);
        bp = findViewById(R.id.bp);
        bm = findViewById(R.id.bm);
        b0 = findViewById(R.id.b0);
        textone = findViewById(R.id.textone);
        texttwo = findViewById(R.id.texttwo);
        bln = findViewById(R.id.bln);
        brut = findViewById(R.id.brut);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo.setText(texttwo.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo.setText(texttwo.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo.setText(texttwo.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo.setText(texttwo.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo.setText(texttwo.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo.setText(texttwo.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo.setText(texttwo.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo.setText(texttwo.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo.setText(texttwo.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo.setText(texttwo.getText() + "0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo.setText(texttwo.getText() + ".");
            }
        });



        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo.setText("");
                textone.setText("");
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(texttwo.getText().toString());
                Addition = true;
                texttwo.setText("");

            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(texttwo.getText().toString());
                Substruction = true;
                texttwo.setText("");
            }
        });
        bx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(texttwo.getText().toString());
                Multiplication = true;
                texttwo.setText("");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(texttwo.getText().toString());
                Division = true;
                texttwo.setText("");
            }
        });




        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value = Double.parseDouble(texttwo.getText().toString());
                Lon = true;
            }
        });
        brut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(texttwo.getText().toString());
                Root = true;
                texttwo.setText(null);
            }
        });

        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueTwo = Double.parseDouble(texttwo.getText().toString());
                if (Addition == true)
                {
                    plusresult = ValueOne + ValueTwo;
                    textone.setText(String.valueOf(plusresult));
                    Addition = false;

                }
                if (Substruction == true)
                {
                    result = ValueOne - ValueTwo;
                    textone.setText(String.valueOf(result));
                    Substruction = false;

                }
                if (Multiplication == true)
                {
                    result = ValueOne * ValueTwo;
                    textone.setText(String.valueOf(result));
                    Multiplication = false;
                }
                if ( Division == true)
                {
                    result = ValueOne * ValueTwo;
                    textone.setText(String.valueOf(result));
                    Division = false;
                }

                if (Lon == true)
                {

                    result2 = Math.log10(Value);

                    textone.setText(String.format("%.2f", result2));
                    Lon = false;

                }





            }
        });





















    }
}