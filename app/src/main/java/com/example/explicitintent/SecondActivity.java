package com.example.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView dataShow;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        setTitle("second Activity");

        dataShow = findViewById(R.id.inputShow);
        back = findViewById(R.id.back);

        Intent intent = getIntent();

        String data = intent.getStringExtra("input");

        dataShow.setText(data);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });




    }
}
