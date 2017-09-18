package com.example.chandrassekhar.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.id.text1;
import static android.widget.Toast.makeText;
import static com.example.chandrassekhar.menu.R.id.text2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CheckBox burg,mom,sha,cok;
    EditText edit1,edit2,edit3,edit4;
    Button ord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {

        burg=(CheckBox)findViewById(R.id.bg);
        mom=(CheckBox)findViewById(R.id.mo);
        sha=(CheckBox)findViewById(R.id.sh);
        cok=(CheckBox)findViewById(R.id.co);
        edit1=(EditText)findViewById(R.id.et1);
        edit2=(EditText)findViewById(R.id.et2);
        edit3=(EditText)findViewById(R.id.et3);
        edit4=(EditText)findViewById(R.id.et4);
        ord=(Button)findViewById(R.id.ord);
        ord.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {




String disp = " ";

        int total=0;
        if(burg.isChecked()){
            int text1=Integer.parseInt(edit1.getText().toString());
            int tot=text1*40;
            total+=tot;
            disp+=" BURGER "+"  "+text1+" "+tot+"\n";

        }
        if(mom.isChecked()) {
            int text2=(Integer.parseInt(edit2.getText().toString()));
            int tot2=text2*40;
            total+=tot2;
            disp+= " MOMOS "+" "+text2+" "+tot2+"\n";

        }
        if(sha.isChecked()) {
            int text3=(Integer.parseInt(edit3.getText().toString()));
            int tot3=text3*45;
            total+=tot3;
            disp+= " SHAKE "+" "+text3+" "+tot3+"\n";

        }
        if(cok.isChecked()){
            int text4=(Integer.parseInt(edit4.getText().toString()));

            int tot4=text4*40;
            total+=tot4;
            disp+=" COKE "+" "+text4+" "+tot4+"\n";

            }

            disp+="Total="+total;
        Toast toast=makeText(getApplicationContext(),disp,Toast.LENGTH_LONG);
        toast.show();








    }
}
