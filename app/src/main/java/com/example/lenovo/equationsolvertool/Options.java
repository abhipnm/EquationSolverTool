package com.example.lenovo.equationsolvertool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lenovo on 22-01-2018.
 */

public class Options extends AppCompatActivity {

    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_layout);

        b1=(Button)findViewById(R.id.es);
        b2=(Button)findViewById(R.id.hd);
        b3=(Button)findViewById(R.id.md);
        b4=(Button)findViewById(R.id.cf);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Options.this,RectToPolar.class);
                startActivity(intent);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Options.this,PolarToRect.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
