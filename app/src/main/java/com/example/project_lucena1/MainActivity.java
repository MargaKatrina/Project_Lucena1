package com.example.project_lucena1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import android.widget.Toast;
import android.widget.EditText;
import android.net.Uri;


public class MainActivity extends AppCompatActivity {

    TextView txtEmail;
    EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.etName);
        txtEmail = findViewById(R.id.etEmail);
    }

    public void showScreen2(View v){
        String name = txtName.getText().toString();
        Intent i3 = new Intent(this, Activity2.class);
        i3.putExtra("person", name);
        startActivity(i3);
    }

}