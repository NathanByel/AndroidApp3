package ru.nbdev.androidapp3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class SnackBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);

        Button button = findViewById(R.id.button_show_snack_bar);
        button.setOnClickListener(v -> {
            Snackbar snackbar = Snackbar.make(v, "Message", Snackbar.LENGTH_LONG);
            snackbar.setAction("action", new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            snackbar.show();
        });
    }
}
