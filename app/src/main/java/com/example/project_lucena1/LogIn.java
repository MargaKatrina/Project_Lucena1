package com.example.project_lucena1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void displayAbout(View v){
        Intent i = new Intent(this, About.class);
        startActivity(i);
    }

    public void displayBook(View v){
        Intent i = new Intent(this, Book.class);
        startActivity(i);
    }

    public void showEmailActivity(View v)
    {
        Intent i2 = new Intent(Intent.ACTION_SEND, Uri.parse("mailto: prestigeapp@gmail.com"));
        i2.setType("text/plain");
        startActivity(i2);
    }

    public void showFB(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Prestige-App-2401225440093058/"));
        startActivity(i);
    }

    public void showContact(View v) {
        Intent i = new Intent(this, Contact.class);
        startActivity(i);
    }

}
