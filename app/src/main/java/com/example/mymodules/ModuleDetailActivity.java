package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvOutput;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvOutput = findViewById(R.id.textView);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String ModCode = intentReceived.getStringExtra("ModuleCode");
        String ModName = intentReceived.getStringExtra("ModuleName");
        int Year = intentReceived.getIntExtra("AcademicYear", 0);
        int Sem = intentReceived.getIntExtra("Semester", 0);
        int Cred = intentReceived.getIntExtra("ModuleCredit", 0);
        String Venue = intentReceived.getStringExtra("Venue");

        tvOutput.setText("Module Code : " + ModCode + "\nModule Name: " + ModName + "\nAcademic Year: "
                + Year + "\nSemester: " + Sem + "\nModule Credit: " + Cred + "\nVenue: " + Venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}