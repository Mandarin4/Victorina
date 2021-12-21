package com.supervictored.victorina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView shetBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        shetBTN= findViewById(R.id.shetBTN);
        String schet = getIntent().getStringExtra("shet");
        shetBTN.setText(schet);
    }
    public void mainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);finish();

    }

    public void restartActivity(View view){
        Intent intent = new Intent(this, VictorinaActivity.class);
        startActivity(intent);finish();
    }
    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        Intent backintent = new Intent(this, MainActivity.class);
        startActivity(backintent);finish();
    }
}