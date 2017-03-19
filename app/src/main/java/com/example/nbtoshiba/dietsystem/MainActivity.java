package com.example.nbtoshiba.dietsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Button b= (Button)findViewById(R.id.register);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(MainActivity.this, Userinfo.class);
                MainActivity.this.startActivity(in);}});


        Button button= (Button)findViewById(R.id.Login);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){Intent intent = new Intent(MainActivity.this, AboutLogin.class);
                MainActivity.this.startActivity(intent);}});


    }


}
