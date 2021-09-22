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
        int sum;

        EditText firstNumText = (EditText) findViewById(R.id.firstNum);
        EditText secondNumText = (EditText) findViewById(R.id.secondNum);

        sum = Integer.parseInt(firstNumText.getText().toString()) + Integer.parseInt(secondNumText.getText().toString());

        goToActivity2(sum);
    }

    public void goToActivity2(int answer) {
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",String.valueOf(answer));
        startActivity(intent);
    }
}