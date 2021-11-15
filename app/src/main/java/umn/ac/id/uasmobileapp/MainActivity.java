package umn.ac.id.uasmobileapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button loginPageBtn, btnRegisterPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); //no dark mode

        // TEST PURPOSE: Habis run langsung masuk ke User Main Menu
        startActivity(new Intent(MainActivity.this, UserMainMenu.class));

//        //Find ID
//        loginPageBtn = findViewById(R.id.btnLoginPage);
//        btnRegisterPage = findViewById(R.id.btnRegisterPage);
//
//        //Handling OnClick
//        loginPageBtn.setOnClickListener(view -> {
//            Intent intent = new Intent(MainActivity.this, Login.class);
//            startActivity(intent);
//        });
//
//        btnRegisterPage.setOnClickListener(view -> {
//            Intent intent = new Intent(MainActivity.this, Register.class);
//            startActivity(intent);
//        });
    }
}