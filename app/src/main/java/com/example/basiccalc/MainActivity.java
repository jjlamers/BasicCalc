package com.example.basiccalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        EditText firstNumText = (EditText) findViewById(R.id.firstNum);

        Log.i("entered",firstNumText.getText().toString());

        //Toast.makeText(MainActivity.this,, Toast.LENGTH_LONG).show();
    }

    public void additionClick(View view) {
        float sum;

        EditText firstNumText = (EditText) findViewById(R.id.firstNum);
        EditText secondNumText = (EditText) findViewById(R.id.secondNum);

        sum = Integer.parseInt(firstNumText.getText().toString()) + (float) Integer.parseInt(secondNumText.getText().toString());

        goToActivity2(sum);
    }

    public void subtractionClick(View view) {
        float diff;

        EditText firstNumText = (EditText) findViewById(R.id.firstNum);
        EditText secondNumText = (EditText) findViewById(R.id.secondNum);

        diff = Integer.parseInt(firstNumText.getText().toString()) - (float) Integer.parseInt(secondNumText.getText().toString());

        goToActivity2(diff);
    }

    public void multiplyClick(View view) {
        float product;

        EditText firstNumText = (EditText) findViewById(R.id.firstNum);
        EditText secondNumText = (EditText) findViewById(R.id.secondNum);

        product = Integer.parseInt(firstNumText.getText().toString()) * (float) Integer.parseInt(secondNumText.getText().toString());

        goToActivity2(product);
    }

    public void divideClick(View view) {
        float Quotient;

        EditText firstNumText = (EditText) findViewById(R.id.firstNum);
        EditText secondNumText = (EditText) findViewById(R.id.secondNum);

        Quotient = Integer.parseInt(firstNumText.getText().toString()) / (float) Integer.parseInt(secondNumText.getText().toString());

        goToActivity2(Quotient);
    }

    public void goToActivity2(float answer) {
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",String.valueOf(answer));
        startActivity(intent);
    }
}