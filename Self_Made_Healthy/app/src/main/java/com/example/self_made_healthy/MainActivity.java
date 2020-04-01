package com.example.self_made_healthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button setMealsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onMealButtonClick();
    }

    public void onMealButtonClick(){
        setMealsButton = (Button) findViewById(R.id.meals_button);
        setMealsButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openSetMealHoursActiviy();
                    }
                }
        );
    }

    public void openSetMealHoursActiviy(){
        Intent intent = new Intent(this, SetMealHours.class);
        startActivity(intent);
    }
}
