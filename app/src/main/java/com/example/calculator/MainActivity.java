package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private enum Operator {none, add, minus, multiply, divide}
    double data1 = 0;
    double data2 = 0;
    private Operator operator = Operator.none;


    public void btnResultClick(View view) {
        if (operator.equals(Operator.none)) {
            return;
        }

        double result = 0;

        TextView text = (TextView) findViewById(R.id.text1);
        data2 = Double.valueOf(text.getText().toString());

        if (operator.equals(Operator.add)) {
            result = data1 + data2;
        } else if (operator.equals(Operator.minus)) {
            result = data1 - data2;
        } else if (operator.equals(Operator.multiply)) {
            result = data1 * data2;
        } else if (operator.equals(Operator.divide)) {
            result = data1 / data2;
        }

        text.setText(String.valueOf(result));
    }

    public void btnDotClick(View view) {
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText(text.getText() + ".");
    }

    public void btnAddClick(View view) {
        operator = Operator.add;
        TextView text = (TextView) findViewById(R.id.text1);
        data1 = Double.valueOf(text.getText().toString());
        text.setText("");
    }

    public void btnMinusClick(View view) {
        operator = Operator.minus;
        TextView text = (TextView) findViewById(R.id.text1);
        data1 = Double.valueOf(text.getText().toString());
        text.setText("");
    }

    public void btnMultiplyClick(View view) {
        operator = Operator.multiply;
        TextView text = (TextView) findViewById(R.id.text1);
        data1 = Double.valueOf(text.getText().toString());
        text.setText("");
    }

    public void btnDivideClick(View view) {
        operator = Operator.divide;
        TextView text = (TextView) findViewById(R.id.text1);
        data1 = Double.valueOf(text.getText().toString());
        text.setText("");
    }

    public void btnClearClick(View view) {
        data1 = 0;
        data2 = 0;
        operator = Operator.none;
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText("");
    }

    public void btn0Click(View view) {
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText(text.getText() + "0");
    }

    public void btn1Click(View view) {
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText(text.getText() + "1");
    }

    public void btn2Click(View view) {
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText(text.getText() + "2");
    }

    public void btn3Click(View view) {
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText(text.getText() + "3");
    }

    public void btn4Click(View view) {
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText(text.getText() + "4");
    }

    public void btn5Click(View view) {
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText(text.getText() + "5");
    }

    public void btn6Click(View view) {
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText(text.getText() + "6");
    }

    public void btn7Click(View view) {
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText(text.getText() + "7");
    }

    public void btn8Click(View view) {
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText(text.getText() + "8");
    }

    public void btn9Click(View view) {
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText(text.getText() + "9");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}