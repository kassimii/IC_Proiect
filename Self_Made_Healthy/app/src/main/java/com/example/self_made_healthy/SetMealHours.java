package com.example.self_made_healthy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Time;
import android.widget.Toast;
public class SetMealHours extends AppCompatActivity {

    private EditText breakfast_hour, snack1_hour, lunch_hour, snack2_hour, dinner_hour;
    private Button save_plan_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_meal_hours);
       // onSavePlanButtonClick();
    }

//    public void onSavePlanButtonClick(){
//        breakfast_hour = (EditText)findViewById(R.id.breakfast_time);
//        snack1_hour = (EditText) findViewById(R.id.snack1_time);
//        lunch_hour = (EditText) findViewById(R.id.lunch_time);
//        snack2_hour = (EditText) findViewById(R.id.snack2_time);
//        dinner_hour = (EditText) findViewById(R.id.dinner_time);
//
//        save_plan_button = (Button)findViewById(R.id.save_plan_button);
//
//        final Time breakfast_time = (Time) breakfast_hour.getText();
//
//        save_plan_button.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(SetMealHours.this, breakfast_time.toString(),Toast.LENGTH_SHORT).show();
//                    }
//                }
//        );
//
//
//
//
//    }

}
