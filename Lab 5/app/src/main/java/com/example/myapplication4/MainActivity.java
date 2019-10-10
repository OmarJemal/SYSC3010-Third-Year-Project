package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Submit(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        EditText editText = findViewById(R.id.editText2);
        TextView text = findViewById(R.id.textView);

      //  if(input.getText().toString() == null){
        //    Toast toast = new Toast(C)
        //}else {

        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
       // }
    }


}
