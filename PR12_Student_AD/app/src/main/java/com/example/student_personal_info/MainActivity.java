package com.example.student_personal_info;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editTextName, editTextAge, editTextAddress,editTextMobileNo;
    Button buttonSubmit;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        editTextMobileNo = findViewById(R.id.editTextMobileNo);
        editTextAddress = findViewById(R.id.editTextAddress);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        textViewResult = findViewById(R.id.textViewResult);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();
                String age = editTextAge.getText().toString().trim();
                String mobileno = editTextMobileNo.getText().toString().trim();
                String address = editTextAddress.getText().toString().trim();

                String result = "Name: " + name + "\nAge: " + age + "\n Mobile Number: " + mobileno + "\nAddress: " + address;

                textViewResult.setText(result);
            }
        });
    }
}