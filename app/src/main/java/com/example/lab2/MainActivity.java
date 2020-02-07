package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitText(View view) {
        EditText userInput = (EditText) findViewById(R.id.usernameInput);
        String username = userInput.getText().toString();
        // Toast.makeText(MainActivity.this, username, Toast.LENGTH_LONG).show();
        goToActivity2(username);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("username", s);
        startActivity(intent);
    }
}
