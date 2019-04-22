package com.example.exampleintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Resul_Activity extends AppCompatActivity {

    int first;
    String second;
    Float third;
    Long fourth;

    //private EditText editText1,editText2,editText3,editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_resul_);

        first=getIntent().getIntExtra("int",1);
        second=getIntent().getStringExtra("string");
        third=getIntent().getFloatExtra("float",3.0f);
        fourth=getIntent().getLongExtra("long",4);


        // editText1=(EditText)findViewById(R.id.e1);
        //  editText2=(EditText)findViewById(R.id.e2);
        // editText3=(EditText)findViewById(R.id.e3);
        //editText4=(EditText)findViewById(R.id.e4);
    }


    public void Data(View view) {

        Intent i1=new Intent();


        i1.putExtra("int",first+1);
        i1.putExtra("string",second+"a");
        i1.putExtra("float",third+1);
        i1.putExtra("long",fourth+1);
        setResult(RESULT_OK,i1);
        finish();


    }
}
