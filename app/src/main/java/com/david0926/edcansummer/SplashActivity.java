package com.david0926.edcansummer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SplashActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(() -> {

            //자동로그인 가능!
            if (firebaseAuth.getCurrentUser() != null && UserCache.getUser(this) != null)
                startActivity(new Intent(SplashActivity.this, MainActivity.class));

            //자동로그인 불가능
            else
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));

            finish();
        }, 1500);
    }
}