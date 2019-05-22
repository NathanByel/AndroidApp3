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

        Button buttonCollapsingActivityRun = findViewById(R.id.button_collapsing_activity_run);
        buttonCollapsingActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CollapsingActivity.class);
            startActivity(intent);
        });

        Button buttonFabActivityRun = findViewById(R.id.button_fab_activity_run);
        buttonFabActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FabActivity.class);
            startActivity(intent);
        });

        Button buttonRecyclerActivityRun = findViewById(R.id.button_recycler_activity_run);
        buttonRecyclerActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
            startActivity(intent);
        });

        Button buttonTabActivityRun = findViewById(R.id.button_tab_activity_run);
        buttonTabActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TabActivity.class);
            startActivity(intent);
        });

        Button buttonBottomActivityRun = findViewById(R.id.button_bottom_activity_run);
        buttonBottomActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BottomActivity.class);
            startActivity(intent);
        });

        Button buttonStyleActivityRun = findViewById(R.id.button_style_activity_run);
        buttonStyleActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, StyleActivity.class);
            startActivity(intent);
        });

        Button buttonThemeActivityRun = findViewById(R.id.button_theme_activity_run);
        buttonThemeActivityRun.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ThemeActivity.class);
            startActivity(intent);
        });
    }
}
