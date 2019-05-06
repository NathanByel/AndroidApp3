package ru.nbdev.androidapp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ProgressBar progressBar = findViewById(R.id.progress_bar);

        Button buttonShow = findViewById(R.id.button_show);
        buttonShow.setOnClickListener(v -> progressBar.setVisibility(View.VISIBLE));

        Button buttonHide = findViewById(R.id.button_hide);
        buttonHide.setOnClickListener(v -> progressBar.setVisibility(View.INVISIBLE));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                System.out.println("Back pressed");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
