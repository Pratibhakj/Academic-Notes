package com.devdroid.eduapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login_activity extends AppCompatActivity {
    TextView textview;
    public static String PREFS_NAME ="myprefs";
    EditText inputEmail, inputPassword;
    Button button;
    String emailpattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    ProgressDialog progressDialog;
    FirebaseAuth mAuth;
    FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textview = findViewById(R.id.newaccount);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        inputEmail = findViewById(R.id.inputemail);
        inputPassword = findViewById(R.id.inputpassword);
        button = findViewById(R.id.button);
        progressDialog = new ProgressDialog(this);
        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();

        textview = findViewById(R.id.newaccount);
        checkUserAuthentication();
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login_activity.this, Register_activity.class));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PerforAuth();
            }
        });
    }
    private void checkUserAuthentication() {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            // User is already logged in, skip login activity and send them to the main activity.
            sendUserToMainActivity();

            // Finish the current login activity so that the user cannot go back to it after login.
            finish();
        }
        else {
            // User is not logged in, proceed to the login activity.
            setContentView(R.layout.activity_splash);

            // You may add a delay here using a Handler or any other method before starting the login activity.
            // For simplicity, I'm directly starting the login activity without any delay.
            sendUserToLoginActivity();
        }
    }

    private void sendUserToLoginActivity() {
        Intent loginIntent = new Intent(this, login_activity.class);
        startActivity(loginIntent);
        finish();
    }

    private void sendUserToMainActivity() {

        Intent mainIntent = new Intent(this, MainActivity.class);
        startActivity(mainIntent);
        finish();

    }

    private void PerforAuth() {

            String email = inputEmail.getText().toString();
            String password = inputPassword.getText().toString();


            if (!email.matches(emailpattern)) {
                inputEmail.setError("Enter correct email");
            } else if (password.isEmpty() || password.length() < 6) {
                inputPassword.setError("Enter correct password");

            } else {
                progressDialog.setMessage("Please wait while Login");
                progressDialog.setTitle("Login");
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.show();

                mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            progressDialog.dismiss();
                            sendUserToNextActivity();
                            Toast.makeText(login_activity.this, "Login Sucessful", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(login_activity.this, ""+task.getException(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        }

        private void sendUserToNextActivity() {
            Intent intent = new Intent(login_activity.this,MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }




}