package com.example.dell.logicalgates;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity{
    Button B1,B2,B3,B4,B5,B6,B7;
    Switch S1,S2;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1=(Button)findViewById(R.id.button);
        B2=(Button)findViewById(R.id.button2);
        B3=(Button)findViewById(R.id.button3);
        B4=(Button)findViewById(R.id.button4);
        B5=(Button)findViewById(R.id.button5);
        B6=(Button)findViewById(R.id.button6);
        B7=(Button)findViewById(R.id.button7);
        S1 = (Switch) findViewById(R.id.switch1);
        S2 = (Switch) findViewById(R.id.switch2);


        //checking before switch click
        if(S1.isChecked() && S2.isChecked()){

            B1.setBackgroundColor(getColor(R.color.gold));
        }
        else
        {
            B1.setBackgroundColor(getColor(R.color.white));
        }

        if(S1.isChecked() || S2.isChecked()){

            B2.setBackgroundColor(getColor(R.color.gold));
            //B3.setBackgroundColor(getColor(R.color.white));
        }
        else
        {
            B2.setBackgroundColor(getColor(R.color.white));
            //B3.setBackgroundColor(getColor(R.color.gold));
        }
        if(S1.isChecked()){
            B3.setBackgroundColor(getColor(R.color.white));
        }
        else{
            B3.setBackgroundColor(getColor(R.color.gold));
        }

        if(S1.isChecked() && S2.isChecked()){

            B4.setBackgroundColor(getColor(R.color.white));
        }
        else
        {
            B4.setBackgroundColor(getColor(R.color.gold));
        }
        if(!S1.isChecked() && !S2.isChecked()){

            B5.setBackgroundColor(getColor(R.color.gold));
        }
        else
        {
            B5.setBackgroundColor(getColor(R.color.white));
        }
        if((S1.isChecked() && S2.isChecked()) || (!S1.isChecked() && !S2.isChecked())){

            B6.setBackgroundColor(getColor(R.color.white));
        }
        else {
            B6.setBackgroundColor(getColor(R.color.gold));
        }
        if((S1.isChecked() && S2.isChecked()) || (!S1.isChecked() && !S2.isChecked())){

            B7.setBackgroundColor(getColor(R.color.gold));
        }
        else {
            B7.setBackgroundColor(getColor(R.color.white));
        }


        S1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(S1.isChecked() && S2.isChecked()){

                    B1.setBackgroundColor(getColor(R.color.gold));
                }
                else
                {
                    B1.setBackgroundColor(getColor(R.color.white));
                }

                if(S1.isChecked() || S2.isChecked()){

                    B2.setBackgroundColor(getColor(R.color.gold));
                    //B3.setBackgroundColor(getColor(R.color.white));
                }
                else
                {
                    B2.setBackgroundColor(getColor(R.color.white));
                    //B3.setBackgroundColor(getColor(R.color.gold));
                }
                if(S1.isChecked()){
                    B3.setBackgroundColor(getColor(R.color.white));
                }
                else{
                    B3.setBackgroundColor(getColor(R.color.gold));
                }

                if(S1.isChecked() && S2.isChecked()){

                    B4.setBackgroundColor(getColor(R.color.white));
                }
                else
                {
                    B4.setBackgroundColor(getColor(R.color.gold));
                }
                if(!S1.isChecked() && !S2.isChecked()){

                    B5.setBackgroundColor(getColor(R.color.gold));
                }
                else
                {
                    B5.setBackgroundColor(getColor(R.color.white));
                }
                if((S1.isChecked() && S2.isChecked()) || (!S1.isChecked() && !S2.isChecked())){

                    B6.setBackgroundColor(getColor(R.color.white));
                }
                else {
                    B6.setBackgroundColor(getColor(R.color.gold));
                }
                if((S1.isChecked() && S2.isChecked()) || (!S1.isChecked() && !S2.isChecked())){

                    B7.setBackgroundColor(getColor(R.color.gold));
                }
                else {
                    B7.setBackgroundColor(getColor(R.color.white));
                }
            }
        });

        S2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(S1.isChecked() && S2.isChecked()){

                    B1.setBackgroundColor(getColor(R.color.gold));
                }
                else
                {
                    B1.setBackgroundColor(getColor(R.color.white));
                }

                if(S1.isChecked() || S2.isChecked()){

                    B2.setBackgroundColor(getColor(R.color.gold));
                    //B3.setBackgroundColor(getColor(R.color.white));
                }
                else
                {
                    B2.setBackgroundColor(getColor(R.color.white));
                    //B3.setBackgroundColor(getColor(R.color.gold));
                }
                if(S1.isChecked()){
                    B3.setBackgroundColor(getColor(R.color.white));
                }
                else{
                    B3.setBackgroundColor(getColor(R.color.gold));
                }

                if(S1.isChecked() && S2.isChecked()){

                    B4.setBackgroundColor(getColor(R.color.white));
                }
                else
                {
                    B4.setBackgroundColor(getColor(R.color.gold));
                }
                if(!S1.isChecked() && !S2.isChecked()){

                    B5.setBackgroundColor(getColor(R.color.gold));
                }
                else
                {
                    B5.setBackgroundColor(getColor(R.color.white));
                }
                if((S1.isChecked() && S2.isChecked()) || (!S1.isChecked() && !S2.isChecked())){

                    B6.setBackgroundColor(getColor(R.color.white));
                }
                else {
                    B6.setBackgroundColor(getColor(R.color.gold));
                }
                if((S1.isChecked() && S2.isChecked()) || (!S1.isChecked() && !S2.isChecked())){

                    B7.setBackgroundColor(getColor(R.color.gold));
                }
                else {
                    B7.setBackgroundColor(getColor(R.color.white));
                }
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,AND.class);
                startActivity(intent1);
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,OR.class);
                startActivity(intent2);
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this,NOT.class);
                startActivity(intent3);
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this,NAND.class);
                startActivity(intent4);
            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this,NOR.class);
                startActivity(intent5);
            }
        });

        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(MainActivity.this,EOR.class);
                startActivity(intent6);
            }
        });

        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(MainActivity.this,ENOR.class);
                startActivity(intent7);
            }
        });
    }
}
