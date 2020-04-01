package com.example.self_made_healthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button setMealsButton;
    private Button analysePhotoButton;
    private Button editProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onProfileButtonClick();
        onMealButtonClick();
        onCameraButtonClick();
    }

    public void onProfileButtonClick(){
        editProfileButton = (Button) findViewById(R.id.profile_button);
        editProfileButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openProfileEditingActivity();
                    }
                }
        );
    }

    public void openProfileEditingActivity()
    {
        Intent intent = new Intent(this, EditProfile.class);
        startActivity(intent);

        overridePendingTransition(0,0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION); // no animations between activity change
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

        overridePendingTransition(0,0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
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

        overridePendingTransition(0,0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
    }


}
