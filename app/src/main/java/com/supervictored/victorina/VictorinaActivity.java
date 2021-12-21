package com.supervictored.victorina;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class VictorinaActivity extends AppCompatActivity {
    long min;
    TextView timerGame, textVopros, textOtvet1, textOtvet2, textOtvet3, textball, textResult;
    List<ModelVopr> questions = new ArrayList<>();

    ImageView heart1, heart2, heart3;

    RelativeLayout relativeLayout;
    LinearLayout linerRelat;
    TextView textResult2, textResult3, county;
    int heart = 3, pravOtvet = 0, position = 0, positionEnd, otvet=0;
    CountDownTimer timer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victorina);
        questions = Const.questions;
        init();
    }
    public void init(){
        timerGame = findViewById(R.id.timerGame);
        textVopros = findViewById(R.id.textVopros);
        textOtvet1 = findViewById(R.id.textOtvet1);
        textOtvet2 = findViewById(R.id.textOtvet2);
        textOtvet3 = findViewById(R.id.textOtvet3);
        textball = findViewById(R.id.textball);
        textResult = findViewById(R.id.textResult);

        heart1 = findViewById(R.id.heart1);
        heart2 = findViewById(R.id.heart2);
        heart3 = findViewById(R.id.heart3);

        relativeLayout = findViewById(R.id.relative);
        linerRelat = findViewById(R.id.linerRelat);
        textResult3 = findViewById(R.id.textResult3);
        textResult2 = findViewById(R.id.textResult2);
        county = findViewById(R.id.county);


       // questions = getIntent().getParcelableExtra("list");
       //prepareQuestions();
        positionEnd = questions.size()-1;
        textball.setText(Integer.toString(pravOtvet));
        voprosPos();
        min = 31*1000;
        counter(min);
    }

    private void startActivity(){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("shet", Integer.toString(pravOtvet));
        startActivity(intent);finish();
    }
    private void counter(long min) {
        timer = new CountDownTimer(min, 1000) {
            public void onTick(long millisUntilFinished) {
                int seconds = (int) (millisUntilFinished / 1000) % 60;
                timerGame.setText(String.format("%d", seconds));
            }
            public void onFinish() {
                falseTimeOut();
            }
        };
        timer.start();
    }
    void cancelTimer() {
        if(timer!=null)
            timer.cancel();
    }

    public void voprosPos(){
        if(position<=positionEnd) {
            textVopros.setText(questions.get(position).vopros);
            textOtvet1.setText(questions.get(position).otv1);
            textOtvet2.setText(questions.get(position).otv2);
            textOtvet3.setText(questions.get(position).otv3);

        }
    }



    public void textOtvetOnClick1(View view){
        textOtvet1.setBackgroundResource(R.drawable.btnvibrotv);
        textOtvet2.setBackgroundResource(R.drawable.btnotv);
        textOtvet3.setBackgroundResource(R.drawable.btnotv);
        otvet=1;

    }
    public void textOtvetOnClick2(View view){
        textOtvet1.setBackgroundResource(R.drawable.btnotv);
        textOtvet2.setBackgroundResource(R.drawable.btnvibrotv);
        textOtvet3.setBackgroundResource(R.drawable.btnotv);
        otvet=2;
    }
    public void textOtvetOnClick3(View view){
        textOtvet1.setBackgroundResource(R.drawable.btnotv);
        textOtvet2.setBackgroundResource(R.drawable.btnotv);
        textOtvet3.setBackgroundResource(R.drawable.btnvibrotv);
        otvet=3;
    }

    public void textResultOnClick1(View view){
        if(questions.get(position).pravOtv == otvet) trueOtvet();
        else falseOtvet();
    }

    public void falseOtvet() {
        cancelTimer();
        relativeLayout.setVisibility(View.VISIBLE);
        relativeLayout.setBackgroundResource(R.color.background_false);
        linerRelat.setBackgroundResource(R.color.background_false);
        textResult3.setBackgroundResource(R.color.background_false);
        textResult3.setText("Не правильно!");
        textResult2.setBackgroundResource(R.color.background_false);
        textResult2.setText("+0");

        textOtvet1.setBackgroundResource(R.drawable.btnotv);
        textOtvet2.setBackgroundResource(R.drawable.btnotv);
        textOtvet3.setBackgroundResource(R.drawable.btnotv);

        heart--;
        if (heart == 2){
            heart3.setVisibility(View.INVISIBLE);
        } else if (heart == 1){
            heart2.setVisibility(View.INVISIBLE);
        }else if (heart == 0){
            heart1.setVisibility(View.INVISIBLE);

        }


    }
    public void falseTimeOut() {
        cancelTimer();
        relativeLayout.setVisibility(View.VISIBLE);
        relativeLayout.setBackgroundResource(R.color.background_false);
        linerRelat.setBackgroundResource(R.color.background_false);
        textResult3.setBackgroundResource(R.color.background_false);
        textResult3.setText("Время вышло!");
        textResult2.setBackgroundResource(R.color.background_false);
        textResult2.setText("+0");

        textOtvet1.setBackgroundResource(R.drawable.btnotv);
        textOtvet2.setBackgroundResource(R.drawable.btnotv);
        textOtvet3.setBackgroundResource(R.drawable.btnotv);

        heart--;
        if (heart == 2){
            heart3.setVisibility(View.INVISIBLE);
        } else if (heart == 1){
            heart2.setVisibility(View.INVISIBLE);
        }else if (heart == 0){
            heart1.setVisibility(View.INVISIBLE);

        }

    }
    public void trueOtvet() {
        cancelTimer();
        relativeLayout.setVisibility(View.VISIBLE);
        relativeLayout.setBackgroundResource(R.color.background_true);
        linerRelat.setBackgroundResource(R.color.background_true);
        textResult3.setBackgroundResource(R.color.background_true);
        textResult3.setText("Правильно!");
        textResult2.setBackgroundResource(R.color.background_true);
        textResult2.setText("+1");

        textOtvet1.setBackgroundResource(R.drawable.btnotv);
        textOtvet2.setBackgroundResource(R.drawable.btnotv);
        textOtvet3.setBackgroundResource(R.drawable.btnotv);

        pravOtvet++;
        textball.setText(Integer.toString(pravOtvet));

    }

    public void textCountyOnClick(View view){
        if(position<positionEnd && heart>0) {
            position++;
            otvet=0;
            voprosPos();
            relativeLayout.setVisibility(View.GONE);
            counter(min);
        }else startActivity();
    }
    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        Intent backintent = new Intent(this, MainActivity.class);
        startActivity(backintent);finish();
    }
}