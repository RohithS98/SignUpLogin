package com.parse.starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HospitalScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_screen);
    }

    public void updateInfo(View view){
        Intent intent = new Intent(HospitalScreenActivity.this, SignUp2Activity.class);
        startActivity(intent);
    }
}
