package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText text;
        Button btn;
        TextView change;
        change=(TextView)  findViewById(R.id.newtext);
        text=(EditText)  findViewById(R.id.editTextText1);
        btn= (Button) findViewById(R.id.pbutton);

        text.setVisibility(View.INVISIBLE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText("I love android");
                text.setVisibility(View.VISIBLE);
            }
        });


        }


}