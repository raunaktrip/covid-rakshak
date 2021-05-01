package com.example.covidrakshak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class user_details extends AppCompatActivity {

    EditText name,gender,age,aadar,postalAddress,height,weight;
    Button submit;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        name = findViewById(R.id.fullName);
        gender = findViewById(R.id.userGender);
        age = findViewById(R.id.userAge);
        aadar = findViewById(R.id.userAadhar);
        postalAddress = findViewById(R.id.userPostalCode);
        height = findViewById(R.id.userHeight);
        weight = findViewById(R.id.userWeight);
        submit =findViewById(R.id.btn_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");
                reference.setValue("Priyank");
            }
        });

    }
}