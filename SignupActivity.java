package com.example.tution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignupActivity extends AppCompatActivity {
    EditText signupName, signupEmail, signupPhone, signupSchool, signupUsername, signupPassword;
     TextView loginRedirectText;
     Button signupButton;
     FirebaseDatabase database;
     DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signupName=findViewById(R.id.signup_name);
        signupEmail=findViewById(R.id.signup_email);
        signupPhone=findViewById(R.id.signup_phone);
        signupSchool=findViewById(R.id.signup_school);
        signupUsername=findViewById(R.id.signup_username);
        signupPassword=findViewById(R.id.signup_password);
        loginRedirectText=findViewById(R.id.loginRedirectText);
        signupButton=findViewById(R.id.signup_button);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                database=FirebaseDatabase.getInstance();
                reference= database.getReference("user");
                String name =signupName.getText().toString();
                String email =signupEmail.getText().toString();
                String phone=signupPhone.getText().toString();
                String school =signupSchool.getText().toString();
                String username =signupUsername.getText().toString();
                String password =signupPassword.getText().toString();


                HelperClass helperClass= new HelperClass(name,email,phone,school,username,password);
                reference.child(name).setValue(helperClass);
                Toast.makeText(SignupActivity.this, "You have signup successfully", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });


        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}