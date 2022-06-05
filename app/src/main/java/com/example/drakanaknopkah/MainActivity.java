package com.example.drakanaknopkah;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    TextView textView, textView2, textView3;
    String krest[][] = {{"","",""},{"","",""},{"","",""}};
    String znak, znak1;
    int r1, r2;
    int x = 0;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        znak = "X";
        znak1 = "O";
        button10.getBackground().setAlpha(0);
        button10.setEnabled(false);
    }

    public void count(){
        ++x;
    }

    public void reset(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                krest[i][j] = "";
             }
        }
        x = 0;
        button.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button10.setEnabled(false);
        textView.setText("Крестики");
        textView2.setText("Нолики");
        textView3.setText("0");
        button10.setTextSize(TypedValue.COMPLEX_UNIT_PX, 0);
        button10.getBackground().setAlpha(0);
    }

    public void res(View v){
        reset();
    }


    //// Ходы человека
    public void k1(View v){
        count();
        if(x % 2 == 1){
            krest[0][0] = znak;
            button.setText(znak);}
        else{
            krest[0][0] = znak1;
            button.setText(znak1);
        }
        button.setEnabled(false);
        str = Integer.toString(x);
        textView3.setText(str);
        button10.setEnabled(false);
        button10.getBackground().setAlpha(0);
        proverka();
    }
    public void k2(View v){
        count();
        if(x % 2 == 1){
            krest[0][1] = znak;
            button2.setText(znak);}
        else{
            krest[0][1] = znak1;
            button2.setText(znak1);
        }
        button2.setEnabled(false);
        str = Integer.toString(x);
        textView3.setText(str);
        button10.setEnabled(false);
        button10.getBackground().setAlpha(0);
        proverka();
    }
    public void k3(View v){
        count();
        if(x % 2 == 1){
            krest[0][2] = znak;
            button3.setText(znak);}
        else{
            krest[0][2] = znak1;
            button3.setText(znak1);
        }
        button3.setEnabled(false);
        str = Integer.toString(x);
        textView3.setText(str);
        button10.setEnabled(false);
        button10.getBackground().setAlpha(0);
        proverka();
    }
    public void k4(View v){
        count();
        if(x % 2 == 1){
            krest[1][0] = znak;
            button4.setText(znak);}
        else{krest[1][0] = znak1;
            button4.setText(znak1);
        }
        button4.setEnabled(false);
        str = Integer.toString(x);
        textView3.setText(str);
        button10.setEnabled(false);
        button10.getBackground().setAlpha(0);
        proverka();
    }
    public void k5(View v){
        count();
        if(x % 2 == 1){
            krest[1][1] = znak;
            button5.setText(znak);}
        else{
            krest[1][1] = znak1;
            button5.setText(znak1);
        }
        button5.setEnabled(false);
        str = Integer.toString(x);
        textView3.setText(str);
        button10.setEnabled(false);
        button10.getBackground().setAlpha(0);
        proverka();
    }
    public void k6(View v){
        count();
        if(x % 2 == 1){
            krest[1][2] = znak;
            button6.setText(znak);
        }else{
            krest[1][2] = znak1;
            button6.setText(znak1);
        }
        button6.setEnabled(false);
        str = Integer.toString(x);
        textView3.setText(str);
        button10.setEnabled(false);
        button10.getBackground().setAlpha(0);
        proverka();
    }
    public void k7(View v){
        count();
        if(x % 2 == 1){
            krest[2][0] = znak;
            button7.setText(znak);
        }else{
            krest[2][0] = znak1;
            button7.setText(znak1);
        }
        button7.setEnabled(false);
        str = Integer.toString(x);
        textView3.setText(str);
        button10.setEnabled(false);
        button10.getBackground().setAlpha(0);
        proverka();
    }
    public void k8(View v){
        count();
        if(x % 2 == 1){
            krest[2][1] = znak;
            button8.setText(znak);}
        else{krest[2][1] = znak1;
            button8.setText(znak1);
        }
        button8.setEnabled(false);
        str = Integer.toString(x);
        textView3.setText(str);
        button10.setEnabled(false);
        button10.getBackground().setAlpha(0);
        proverka();
    }
    public void k9(View v){
        count();
        if(x % 2 == 1){
            krest[2][2] = znak;
            button9.setText(znak);}
        else{
            krest[2][2] = znak1;
            button9.setText(znak1);
        }
        button9.setEnabled(false);
        str = Integer.toString(x);
        textView3.setText(str);
        button10.setEnabled(false);
        button10.getBackground().setAlpha(0);
        proverka();
    }
    public void block(){
        button.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button10.setEnabled(true);
        button10.setTextSize(TypedValue.COMPLEX_UNIT_PX, 40);
        button10.setBackgroundColor(0xFF6200EE);
        button10.getBackground().setAlpha(120);

    }
    public void proverka(){
        if(x != 0){
            textView.setText("");
            textView2.setText("");

        }
        if(x == 9){
            textView.setText("Ничья");
            textView2.setText("Ничья");
            button10.setEnabled(true);
            button10.setTextSize(TypedValue.COMPLEX_UNIT_PX, 40);
            button10.getBackground().setAlpha(120);
            button10.setBackgroundColor(0xFF6200EE);
        }
        if((button.getText().equals("X"))&&(button2.getText().equals("X"))&&(button3.getText().equals("X"))){
            textView.setText("Крестик победил");
            textView2.setText("Крестик победил");// 1 2 3
            block();
        }
        if((button.getText().equals("X"))&&(button4.getText().equals("X"))&&(button7.getText().equals("X"))){
            textView.setText("Крестик победил");
            textView2.setText("Крестик победил");// 1 4 7
            block();
        }
        if((button.getText().equals("X"))&&(button5.getText().equals("X"))&&(button9.getText().equals("X"))){
            textView.setText("Крестик победил");
            textView2.setText("Крестик победил");// 1 5 9
            block();
        }
        if((button2.getText().equals("X"))&&(button5.getText().equals("X"))&&(button8.getText().equals("X"))){
            textView.setText("Крестик победил");
            textView2.setText("Крестик победил");// 2 5 8
            block();
        }
        if((button3.getText().equals("X"))&&(button6.getText().equals("X"))&&(button9.getText().equals("X"))){
            textView.setText("Крестик победил");
            textView2.setText("Крестик победил");// 3 6 9
            block();
        }
        if((button4.getText().equals("X"))&&(button5.getText().equals("X"))&&(button6.getText().equals("X"))){
            textView.setText("Крестик победил");
            textView2.setText("Крестик победил");// 4 5 6
            block();
        }
        if((button7.getText().equals("X"))&&(button8.getText().equals("X"))&&(button9.getText().equals("X"))){
            textView.setText("Крестик победил");
            textView2.setText("Крестик победил");// 7 8 9
            block();
        }
        if((button3.getText().equals("X"))&&(button5.getText().equals("X"))&&(button7.getText().equals("X"))){
            textView.setText("Крестик победил");
            textView2.setText("Крестик победил");// 3 5 7
            block();
        }



        if((button.getText().equals("O"))&&(button2.getText().equals("O"))&&(button3.getText().equals("O"))){
            textView.setText("Нолик победил");
            textView2.setText("Нолик победил");// 1 2 3
            block();
        }
        if((button.getText().equals("O"))&&(button4.getText().equals("O"))&&(button7.getText().equals("O"))){
            textView.setText("Нолик победил");
            textView2.setText("Нолик победил");// 1 4 7
            block();
        }
        if((button.getText().equals("O"))&&(button5.getText().equals("O"))&&(button9.getText().equals("O"))){
            textView.setText("Нолик победил");
            textView2.setText("Нолик победил");// 1 5 9
            block();
        }
        if((button2.getText().equals("O"))&&(button5.getText().equals("O"))&&(button8.getText().equals("O"))){
            textView.setText("Нолик победил");
            textView2.setText("Нолик победил");// 2 5 8
            block();
        }
        if((button3.getText().equals("O"))&&(button6.getText().equals("O"))&&(button9.getText().equals("O"))){
            textView.setText("Нолик победил");
            textView2.setText("Нолик победил"); // 3 6 9
            block();
        }
        if((button4.getText().equals("O"))&&(button5.getText().equals("O"))&&(button6.getText().equals("O"))){
            textView.setText("Нолик победил");
            textView2.setText("Нолик победил"); // 4 5 6
            block();
        }
        if((button7.getText().equals("O"))&&(button8.getText().equals("O"))&&(button9.getText().equals("O"))){
            textView.setText("Нолик победил");
            textView2.setText("Нолик победил"); // 7 8 9
            block();
        }
        if((button3.getText().equals("O"))&&(button5.getText().equals("O"))&&(button7.getText().equals("O"))){
            textView.setText("Нолик победил");
            textView2.setText("Нолик победил"); // 3 5 7
            block();
        }


    }
}