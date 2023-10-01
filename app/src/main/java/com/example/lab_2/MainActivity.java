package com.example.lab_2;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //button
        EditText sub;
        Button btn;
        TextView change;
        change=(TextView)  findViewById(R.id.newtext);
        sub=(EditText)  findViewById(R.id.editTextText1);
        btn= (Button) findViewById(R.id.pbutton);
        //check box
        CheckBox find;

        find =(CheckBox)  findViewById(R.id.rbcheckBox);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                change.setText(sub.getText());
                Toast.makeText(getApplicationContext(),"Label has been changed ",Toast.LENGTH_LONG).show();


            }



        });




        }


}