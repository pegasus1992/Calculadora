package com.edu.eci.cosw.calculadora.controllers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.edu.eci.cosw.calculadora.R;
import com.edu.eci.cosw.calculadora.model.Calculator;

import java.util.ArrayDeque;
import java.util.Queue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Calculator calc = new Calculator();
        final Queue<String> items = new ArrayDeque<>();

        findViewById(R.id.buttonNum1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                text.setText(text.getText() + "1");
            }
        });

        findViewById(R.id.buttonNum2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                text.setText(text.getText() + "2");
            }
        });

        findViewById(R.id.buttonNum3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                text.setText(text.getText() + "3");
            }
        });

        findViewById(R.id.buttonNum4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                text.setText(text.getText() + "4");
            }
        });

        findViewById(R.id.buttonNum5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                text.setText(text.getText() + "5");
            }
        });

        findViewById(R.id.buttonNum6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                text.setText(text.getText() + "6");
            }
        });

        findViewById(R.id.buttonNum7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                text.setText(text.getText() + "7");
            }
        });

        findViewById(R.id.buttonNum8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                text.setText(text.getText() + "8");
            }
        });

        findViewById(R.id.buttonNum9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                text.setText(text.getText() + "9");
            }
        });

        findViewById(R.id.buttonNum0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                text.setText(text.getText() + "0");
            }
        });

        findViewById(R.id.buttonDot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                if (!text.getText().toString().contains(".")) {
                    text.setText(text.getText() + ".");
                }
            }
        });

        findViewById(R.id.buttonPlus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                if (!text.getText().toString().isEmpty()) {
                    items.add(text.getText().toString());
                    items.add("+");
                    text.setText("");
                }
            }
        });

        findViewById(R.id.buttonLess).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                if (!text.getText().toString().isEmpty()) {
                    items.add(text.getText().toString());
                    items.add("-");
                    text.setText("");
                }
            }
        });

        findViewById(R.id.buttonMultiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                if (!text.getText().toString().isEmpty()) {
                    items.add(text.getText().toString());
                    items.add("*");
                    text.setText("");
                }
            }
        });

        findViewById(R.id.buttonDivide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                if (!text.getText().toString().isEmpty()) {
                    items.add(text.getText().toString());
                    items.add("/");
                    text.setText("");
                }
            }
        });

        findViewById(R.id.buttonEquals).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                if (!text.getText().toString().isEmpty()) {
                    items.add(text.getText().toString());
                    double resp = 0.0;
                    while (!items.isEmpty()) {
                        String item = items.poll();
                        if (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")) {
                            String item2 = items.poll();
                            double num = Double.parseDouble(item2);
                            if (item.equals("+")) {
                                resp = calc.addition(resp, num);
                            } else if (item.equals("-")) {
                                resp = calc.substraction(resp, num);
                            } else if (item.equals("*")) {
                                resp = calc.multiplication(resp, num);
                            } else if (item.equals("/")) {
                                resp = calc.division(resp, num);
                            }
                        } else {
                            resp = Double.parseDouble(item);
                        }
                    }
                    String response = "" + resp;
                    text.setText(response);
                }
            }
        });

        findViewById(R.id.buttonAC).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                text.setText("");
                items.clear();
            }
        });

        findViewById(R.id.buttonSign).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                if (!text.getText().toString().isEmpty()) {
                    String num = text.getText().toString();
                    text.setText("" + (Double.parseDouble(num) * -1));
                }
            }
        });

        findViewById(R.id.buttonSin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                if (!text.getText().toString().isEmpty()) {
                    String num = text.getText().toString();
                    text.setText("" + (calc.sin(Double.parseDouble(num))));
                }
            }
        });

        findViewById(R.id.buttonCos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                if (!text.getText().toString().isEmpty()) {
                    String num = text.getText().toString();
                    text.setText("" + (calc.cos(Double.parseDouble(num))));
                }
            }
        });

        findViewById(R.id.buttonTan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textViewNum);
                if (!text.getText().toString().isEmpty()) {
                    String num = text.getText().toString();
                    text.setText("" + (calc.tan(Double.parseDouble(num))));
                }
            }
        });
    }
}
