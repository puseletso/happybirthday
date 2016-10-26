package com.example.android.happybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final  EditText editTextFrom=(EditText)findViewById(R.id.fromname_edittext);
        editTextFrom.setText("From :"+ editTextFrom.getText());
        editTextFrom.setSelection(6);

      final  EditText editTextTo=(EditText)findViewById(R.id.toname_edittext);
        editTextTo.setText("To :"+ editTextTo.getText());
        editTextTo.setSelection(4);






        editTextTo.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId==EditorInfo.IME_ACTION_DONE){
                    //Clear focus here from edittext
                    editTextTo.clearFocus();
                }
                return false;
            }

        });


        editTextFrom.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId==EditorInfo.IME_ACTION_DONE){
                    //Clear focus here from edittext
                    editTextFrom.clearFocus();
                    editTextFrom.setCursorVisible(false);
                }
                return false;
            }

        });









    }
}
