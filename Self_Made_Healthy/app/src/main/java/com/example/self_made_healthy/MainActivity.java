package com.example.self_made_healthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button setMealsButton;
    private Button accessProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onMealButtonClick();
        onProfileButtonClick();
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

    public void onProfileButtonClick(){
        accessProfileButton = (Button) findViewById(R.id.profile_button);
        accessProfileButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"Plm",Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
