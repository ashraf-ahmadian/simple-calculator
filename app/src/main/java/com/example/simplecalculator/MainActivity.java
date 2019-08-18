package com.example.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView display;

    private Button clear;
    private Button multiplication;
    private Button division;
    private Button plus;
    private Button subtract;
    private Button equal;
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;

    private double firstNumber;
    private double secondNumber;


    private String displayNumber;

    private boolean clickOnPlus = false;
    private boolean clickOnSubtract = false;
    private boolean clickOnMultiplication = false;
    private boolean clickOnDivision = false;
    private boolean clickOnNumbers = false;
    private boolean clickOnEqual = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        generateNumber();
        mainOperations();
        setClear();
        setEqual();
    }

    private void findView() {
        display = findViewById(R.id.display);
        clear = findViewById(R.id.clear);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);
        plus = findViewById(R.id.plus);
        subtract = findViewById(R.id.subtract);
        equal = findViewById(R.id.equal);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
    }

    private void generateNumber(){
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNumber = display.getText().toString();
                if (!displayNumber.contains(".")){
                    display.setText(display.getText().toString() + "0");
                }
                else{
                    display.setText("0");
                }
                clickOnNumbers = true;
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNumber = display.getText().toString();
                if (!displayNumber.contains(".")){
                    display.setText(display.getText().toString() + "1");
                }
                else{
                    display.setText("1");
                }
                clickOnNumbers = true;
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNumber = display.getText().toString();
                if (!displayNumber.contains(".")){
                    display.setText(display.getText().toString() + "2");
                }
                else{
                    display.setText("2");
                }
                clickOnNumbers = true;
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNumber = display.getText().toString();
                if (!displayNumber.contains(".")){
                    display.setText(display.getText().toString() + "3");
                }
                else{
                    display.setText("3");
                }
                clickOnNumbers = true;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNumber = display.getText().toString();
                if (!displayNumber.contains(".")){
                    display.setText(display.getText().toString() + "4");
                }
                else{
                    display.setText("4");
                }
                clickOnNumbers = true;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNumber = display.getText().toString();
                if (!displayNumber.contains(".")){
                    display.setText(display.getText().toString() + "5");
                }
                else{
                    display.setText("5");
                }
                clickOnNumbers = true;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNumber = display.getText().toString();
                if (!displayNumber.contains(".")){
                    display.setText(display.getText().toString() + "6");
                }
                else{
                    display.setText("6");
                }
                clickOnNumbers = true;
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNumber = display.getText().toString();
                if (!displayNumber.contains(".")){
                    display.setText(display.getText().toString() + "7");
                }
                else{
                    display.setText("7");
                }
                clickOnNumbers = true;
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNumber = display.getText().toString();
                if (!displayNumber.contains(".")){
                    display.setText(display.getText().toString() + "8");
                }
                else{
                    display.setText("8");
                }
                clickOnNumbers = true;
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNumber = display.getText().toString();
                if (!displayNumber.contains(".")){
                    display.setText(display.getText().toString() + "9");
                }
                else{
                    display.setText("9");
                }
                clickOnNumbers = true;
            }
        });

    }

    private void mainOperations(){
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().length() != 0){
                    if (clickOnSubtract && clickOnNumbers && !clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber - secondNumber));
                        firstNumber = Double.parseDouble(display.getText().toString());
                        clickOnSubtract = false;
                        clickOnNumbers = false;
                        clickOnPlus = true;
                        generateNumber();
                    }
                    else if (clickOnMultiplication && clickOnNumbers && clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber * secondNumber));
                        firstNumber = Double.parseDouble(display.getText().toString());
                        clickOnMultiplication = false;
                        clickOnNumbers = false;
                        clickOnPlus = true;
                        generateNumber();
                    }
                    else if (clickOnDivision && clickOnNumbers && clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        if (secondNumber != 0){
                            display.setText(String.valueOf(firstNumber / secondNumber));
                            firstNumber = Double.parseDouble(display.getText().toString());
                            clickOnDivision = false;
                            clickOnNumbers = false;
                            clickOnPlus = true;
                            generateNumber();
                        }
                        else{
                            display.setText(getString(R.string.nullDivision));
                        }

                    }
                    else if (clickOnPlus && clickOnNumbers){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber + secondNumber));
                        firstNumber = Double.parseDouble(display.getText().toString());
                        clickOnNumbers = false;
                        generateNumber();
                    }
                    else if (!clickOnPlus && clickOnNumbers || clickOnEqual){
                        firstNumber = Double.parseDouble(display.getText().toString());
                        display.setText(null);
                        clickOnSubtract = false;
                        clickOnMultiplication = false;
                        clickOnDivision = false;
                        clickOnPlus = true;
                        clickOnNumbers = false;
                        generateNumber();
                    }
                    else if ((clickOnSubtract || clickOnMultiplication || clickOnDivision) && !clickOnNumbers ){
                        clickOnSubtract = false;
                        clickOnMultiplication = false;
                        clickOnDivision = false;
                        clickOnPlus = true;
                    }
                }
                else if (clickOnSubtract || clickOnMultiplication || clickOnDivision ){
                    clickOnDivision = false;
                    clickOnMultiplication = false;
                    clickOnSubtract = false;
                    clickOnNumbers = false;
                    clickOnPlus = true;
                    generateNumber();
                }
                else {
                    return;
                }
                clickOnEqual = false;
            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().length() != 0){
                    if (clickOnPlus && clickOnNumbers && !clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber + secondNumber));
                        firstNumber = Double.parseDouble(display.getText().toString());
                        clickOnPlus = false;
                        clickOnNumbers = false;
                        clickOnSubtract = true;
                        generateNumber();
                    }
                    else if (clickOnMultiplication && clickOnNumbers && !clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber * secondNumber));
                        firstNumber = Double.parseDouble(display.getText().toString());
                        clickOnMultiplication = false;
                        clickOnNumbers = false;
                        clickOnSubtract = true;
                        generateNumber();
                    }
                    else if (clickOnDivision && clickOnNumbers && !clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        if (secondNumber != 0){
                            display.setText(String.valueOf(firstNumber / secondNumber));
                            firstNumber = Double.parseDouble(display.getText().toString());
                            clickOnDivision = false;
                            clickOnNumbers = false;
                            clickOnSubtract = true;
                            generateNumber();
                        }
                        else{
                            display.setText(getString(R.string.nullDivision));
                        }

                    }
                    else if (clickOnSubtract && clickOnNumbers){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber - secondNumber));
                        firstNumber = Double.parseDouble(display.getText().toString());
                        clickOnNumbers = false;
                        generateNumber();
                    }
                    else if (!clickOnSubtract && clickOnNumbers || clickOnEqual){
                        firstNumber = Double.parseDouble(display.getText().toString());
                        display.setText(null);
                        clickOnSubtract = true;
                        clickOnPlus = false;
                        clickOnDivision = false;
                        clickOnMultiplication = false;
                        clickOnNumbers = false;
                        generateNumber();
                    }
                    else if ((clickOnPlus || clickOnMultiplication || clickOnDivision) && !clickOnNumbers){
                        clickOnPlus = false;
                        clickOnMultiplication = false;
                        clickOnDivision = false;
                        clickOnSubtract = true;
                    }
                }
                else if ((clickOnPlus || clickOnMultiplication || clickOnDivision) && !clickOnNumbers){
                    clickOnDivision = false;
                    clickOnMultiplication = false;
                    clickOnPlus = false;
                    clickOnNumbers = false;
                    clickOnSubtract = true;
                }
                else {
                    return;
                }
                clickOnEqual = false;
            }
        });




        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().length() != 0){
                    if (clickOnPlus && clickOnNumbers && !clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber + secondNumber));
                        firstNumber = Double.parseDouble(display.getText().toString());
                        clickOnPlus = false;
                        clickOnNumbers = false;
                        clickOnMultiplication = true;
                        generateNumber();
                    }
                    else if (clickOnSubtract && clickOnNumbers && !clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber - secondNumber));
                        firstNumber = Double.parseDouble(display.getText().toString());
                        clickOnSubtract = false;
                        clickOnNumbers = false;
                        clickOnMultiplication = true;
                        generateNumber();
                    }
                    else if (clickOnDivision && clickOnNumbers && !clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        if (secondNumber != 0){
                            display.setText(String.valueOf(firstNumber / secondNumber));
                            firstNumber = Double.parseDouble(display.getText().toString());
                            clickOnDivision = false;
                            clickOnNumbers = false;
                            clickOnMultiplication = true;
                            generateNumber();
                        }
                        else{
                            display.setText(getString(R.string.nullDivision));
                        }

                    }
                    else if (clickOnMultiplication && clickOnNumbers){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber * secondNumber));
                        firstNumber = Double.parseDouble(display.getText().toString());
                        clickOnNumbers = false;
                        generateNumber();
                    }
                    else if (!clickOnMultiplication && clickOnNumbers || clickOnEqual){
                        firstNumber = Double.parseDouble(display.getText().toString());
                        display.setText(null);
                        clickOnMultiplication = true;
                        clickOnNumbers = false;
                        clickOnSubtract = false;
                        clickOnPlus = false;
                        clickOnDivision = false;
                        generateNumber();
                    }
                    else if ((clickOnSubtract || clickOnPlus || clickOnDivision) && !clickOnNumbers){
                        clickOnSubtract = false;
                        clickOnPlus = false;
                        clickOnDivision = false;
                        clickOnMultiplication = true;
                    }
                }
                else if (clickOnPlus || clickOnSubtract || clickOnDivision){
                    clickOnDivision = false;
                    clickOnSubtract = false;
                    clickOnPlus = false;
                    clickOnNumbers = false;
                    clickOnMultiplication = true;
                }
                else {
                    return;
                }
                clickOnEqual = false;
            }
        });


        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().length() != 0){
                    if (clickOnPlus && clickOnNumbers && !clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber + secondNumber));
                        firstNumber = Double.parseDouble(display.getText().toString());
                        clickOnPlus = false;
                        clickOnNumbers = false;
                        clickOnDivision = true;
                        generateNumber();
                    }
                    else if (clickOnMultiplication && clickOnNumbers && !clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber * secondNumber));
                        firstNumber = Double.parseDouble(display.getText().toString());
                        clickOnMultiplication = false;
                        clickOnNumbers = false;
                        clickOnDivision = true;
                        generateNumber();
                    }
                    else if (clickOnSubtract && clickOnNumbers && !clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber - secondNumber));
                        firstNumber = Double.parseDouble(display.getText().toString());
                        clickOnSubtract = false;
                        clickOnNumbers = false;
                        clickOnDivision = true;
                        generateNumber();
                    }
                    else if (clickOnDivision && clickOnNumbers){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        if (secondNumber != 0){
                            display.setText(String.valueOf(firstNumber / secondNumber));
                            firstNumber = Double.parseDouble(display.getText().toString());
                            clickOnNumbers = false;
                            generateNumber();
                        }
                        else {
                            display.setText(getString(R.string.nullDivision));
                        }

                    }
                    else if (!clickOnDivision && clickOnNumbers || clickOnEqual){
                        firstNumber = Double.parseDouble(display.getText().toString());
                        display.setText(null);
                        clickOnDivision = true;
                        clickOnNumbers = false;
                        clickOnPlus = false;
                        clickOnMultiplication = false;
                        clickOnSubtract = false;
                        generateNumber();
                    }
                    else if ((clickOnSubtract || clickOnMultiplication || clickOnPlus) && !clickOnNumbers){
                        clickOnSubtract = false;
                        clickOnMultiplication = false;
                        clickOnPlus = false;
                        clickOnDivision = true;
                    }
                }
                else if (clickOnPlus || clickOnMultiplication || clickOnSubtract){
                    clickOnSubtract = false;
                    clickOnMultiplication = false;
                    clickOnPlus = false;
                    clickOnNumbers = false;
                    clickOnDivision = true;
                }
                else {
                    return;
                }
                clickOnEqual = false;
            }
        });
    }
    private void setClear(){
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                clickOnPlus = false;
                clickOnSubtract = false;
                clickOnDivision = false;
                clickOnMultiplication = false;
                firstNumber = 0;
                secondNumber = 0;
            }
        });
    }
    private void setEqual(){
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickOnPlus && clickOnNumbers){
                    if (!clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber + secondNumber));
                        clickOnEqual = true;
                        clickOnDivision = false;
                        clickOnMultiplication = false;
                        clickOnSubtract = false;
                    }
                    else{
                        firstNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber + secondNumber));
                    }
                }

                else if (clickOnSubtract && clickOnNumbers){
                    if (!clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber - secondNumber));
                        clickOnEqual = true;
                        clickOnPlus = false;
                        clickOnMultiplication = false;
                        clickOnDivision = false;
                    }
                    else{
                        firstNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber - secondNumber));
                    }
                }

                else if (clickOnMultiplication && clickOnNumbers){
                    if (!clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber * secondNumber));
                        clickOnEqual = true;
                        clickOnDivision = false;
                        clickOnPlus = false;
                        clickOnSubtract = false;
                    }
                    else{
                        firstNumber = Double.parseDouble(display.getText().toString());
                        display.setText(String.valueOf(firstNumber * secondNumber));
                    }
                }

                else if (clickOnDivision && clickOnNumbers){
                    if (!clickOnEqual){
                        secondNumber = Double.parseDouble(display.getText().toString());
                        if (secondNumber != 0){
                            display.setText(String.valueOf(firstNumber / secondNumber));
                            clickOnEqual = true;
                            clickOnPlus = false;
                            clickOnMultiplication = false;
                            clickOnSubtract = false;
                        }
                        else {
                            display.setText(getString(R.string.nullDivision));
                        }

                    }
                    else{
                        firstNumber = Double.parseDouble(display.getText().toString());
                        if (firstNumber != 0){
                            display.setText(String.valueOf(firstNumber / secondNumber));
                        }
                        else {
                            display.setText(getString(R.string.nullDivision));
                        }

                    }
                }


            }
        });
    }
}
