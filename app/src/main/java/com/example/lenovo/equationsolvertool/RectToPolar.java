package com.example.lenovo.equationsolvertool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Lenovo on 22-01-2018.
 */

public class RectToPolar extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    Button b1;
    TextView t1,t2;
    String rl,plr;
    double rld,plrd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recttopolar);

        b1=(Button)findViewById(R.id.calc);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText4);
        e4=(EditText)findViewById(R.id.editText3);


        //rl=e1.getText().toString();
       // rld=Double.parseDouble(e1.getText().toString());

        //plr=e2.getText().toString();
       // plrd=Double.parseDouble(plr);


        /*b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //double rs1,rs2;

                //rs1=Math.sqrt((rld*rld)+(plrd*plrd));
                //rs2=Math.atan2(plrd,rld);


                //String str=Double.toString(rs1);
                //String str2=Double.toString(rs2);
                e3.setText(rl);
                e4.setText(plr);


            }
        });*/

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast

             //  t1.setText(" "+e1.getText().toString());
               // t2.setText(" "+e2.getText().toString());
            }
        });

            }

}
