package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements  View.OnClickListener {
    private Button kembali;
    private CheckBox box;
    private int quantity =1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        kembali = findViewById(R.id.btnback);
        box = findViewById(R.id.cek);
        kembali.setOnClickListener(this);
        box.setOnClickListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.btnback:
                finish();
                break;
            case R.id.cek:
                Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void decrement(View view) {
        if (quantity == 0) {
            return;
        }
        quantity = quantity - 1;
displayQuantity(quantity);

    }
    public void increment(View view) {
        if (quantity == 10) {

            return ;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
        }
    private void displayQuantity(int nilai) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.angka);
        quantityTextView.setText("" + nilai);
    }
}
