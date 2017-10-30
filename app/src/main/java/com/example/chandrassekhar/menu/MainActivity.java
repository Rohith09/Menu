package com.example.chandrassekhar.menu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CheckBox burg,mom,sha,cok;
    EditText edit1,edit2,edit3,edit4,edit5;
    String email;
    Button ord;
    Intent i;
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
        edit5=(EditText)findViewById(R.id.editM);
        ord=(Button)findViewById(R.id.ord);
        ord.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        email=edit5.getText().toString();
        String subject="Order Confirmation Mail.";


        String disp = " ";

        int total=0;
        if(burg.isChecked()){
            int text1=Integer.parseInt(edit1.getText().toString());
            int tot=text1*15;
            total+=tot;
            disp+=" BURGER "+"  "+text1+" "+tot+"\n";

        }
        if(mom.isChecked()) {
            int text2=(Integer.parseInt(edit2.getText().toString()));
            int tot2=text2*25;
            total+=tot2;
            disp+= " MOMOS "+" "+text2+" "+tot2+"\n";

        }
        if(sha.isChecked()) {
            int text3=(Integer.parseInt(edit3.getText().toString()));
            int tot3=text3*20;
            total+=tot3;
            disp+= " SHAKE "+" "+text3+" "+tot3+"\n";

        }
        if(cok.isChecked()){
            int text4=(Integer.parseInt(edit4.getText().toString()));

            int tot4=text4*30;
            total+=tot4;
            disp+=" COKE "+" "+text4+" "+tot4+"\n";

            }

            disp+="Total="+total;

        i=new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"+email));
        i.putExtra(Intent.EXTRA_SUBJECT,subject);
        i.putExtra(Intent.EXTRA_TEXT,disp);
        startActivity(i);
        finish();









    }
}
