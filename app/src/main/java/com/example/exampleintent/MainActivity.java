package com.example.exampleintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1,editText2,editText3,editText4;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText1=findViewById(R.id.e1);
        editText2=findViewById(R.id.e2);
        editText3=findViewById(R.id.e3);
        editText4=findViewById(R.id.e4);
    }


    public void Data(View view) {

//        int a=Integer.parseInt(editText1.getText().toString());
//        String s=editText2.getText().toString();
        //Float b=Float.parseFloat(editText3.getText().toString());

        Intent intent= new Intent(this,Resul_Activity.class);
        intent.putExtra("int",Integer.parseInt(editText1.getText().toString()));
        intent.putExtra("string",editText2.getText().toString());
        intent.putExtra("float",Float.parseFloat(editText3.getText().toString()));
        intent.putExtra("long", Long.parseLong(editText4.getText().toString()));
        startActivityForResult(intent, 1);


    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if(resultCode == RESULT_OK) {
               editText1.setText(String.valueOf(data.getIntExtra("int",1)));
                editText2.setText(data.getStringExtra("string"));
                editText3.setText(String.valueOf(data.getFloatExtra("float",3.0f)));
                editText4.setText(String.valueOf(data.getLongExtra("long",4)));

            }


        }
    }



}
