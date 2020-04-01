package com.example.self_made_healthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditProfile extends AppCompatActivity {

    private Button setMealsButton, analysePhotoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        onMealButtonClick();
        onCameraButtonClick();
    }

    public void onMealButtonClick()
    {
        setMealsButton = (Button) findViewById(R.id.meals_button);
        setMealsButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openMealHoursSettingActiviy();
                    }
                }
        );
    }

    public void openMealHoursSettingActiviy(){
        Intent intent = new Intent(this, SetMealHours.class);
        startActivity(intent);
    }

    public void onCameraButtonClick(){
        analysePhotoButton = (Button) findViewById(R.id.photo_button);
        analysePhotoButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openPhotoAnalsisActivity();
                    }
                }
        );
    }

    public void openPhotoAnalsisActivity()
    {
        Intent intent = new Intent(this, AnalyzePhoto.class);
        startActivity(intent);
    }
}
