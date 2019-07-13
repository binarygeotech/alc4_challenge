package me.okdavis.apps.alc4challenge;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startAboutAlc(View view) {
        Intent intent = new Intent( MainActivity.this, AboutAlcActivity.class);
        startActivity(intent);
    }

    public void startMyProfile(View view) {
        Intent intent = new Intent(MainActivity.this, MyProfile.class);
        startActivity(intent);
    }
}
