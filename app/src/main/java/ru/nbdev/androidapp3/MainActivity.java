package ru.nbdev.androidapp3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonTextActivityRun = findViewById(R.id.button_text_activity_run);
        buttonTextActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TextActivity.class);
            startActivity(intent);
        });

        Button buttonSnackBarActivityRun = findViewById(R.id.button_snack_bar_activity_run);
        buttonSnackBarActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SnackBarActivity.class);
            startActivity(intent);
        });

        Button buttonBottomSheetActivityRun = findViewById(R.id.button_bottom_sheet_activity_run);
        buttonBottomSheetActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BottomSheetActivity.class);
            startActivity(intent);
        });

        Button buttonButtonsActivityRun = findViewById(R.id.button_buttons_activity_run);
        buttonButtonsActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ButtonsActivity.class);
            startActivity(intent);
        });

        Button buttonToolbarActivityRun = findViewById(R.id.button_toolbar_activity_run);
        buttonToolbarActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ToolbarActivity.class);
            startActivity(intent);
        });

        Button buttonDrawerActivityRun = findViewById(R.id.button_drawer_activity_run);
        buttonDrawerActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DrawerActivity.class);
            startActivity(intent);
        });
    }
}
