package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
private Button btn1, btn2, btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1_click);
        btn2 = findViewById (R.id.btn2_click);
        btnnext = findViewById (R.id.next);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btnnext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1_click:
                Toast.makeText(getApplicationContext(), "Tombol 1 diklik", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn2_click:
                Toast.makeText(getApplicationContext(), "Tombol 2 diklik", Toast.LENGTH_SHORT).show();
                break;

            case R.id.next:
                startActivity(new Intent(this, SecondActivity.class));
                break;
        }
    }
}
