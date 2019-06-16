package com.example.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private EditText input;
    private Button next;
    private String textInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textInput = input.getText().toString();
                if(textInput.equals("")){

                    Toast.makeText(MainActivity.this,"Input please",Toast.LENGTH_LONG).show();
                }else {



                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);

                    intent.putExtra("input",textInput);


                    startActivity(intent);


                }



            }
        });





    }
}
