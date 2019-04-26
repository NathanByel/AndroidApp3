package ru.nbdev.androidapp3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class TextActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        TextInputLayout textInputLayout1 = findViewById(R.id.text_input_layout1);
        TextInputEditText textInputEditText1 = findViewById(R.id.text_input_edit_text1);

        textInputEditText1.setOnEditorActionListener((v, actionId, event) -> {
            textInputLayout1.setError(getString(R.string.error_text));
            return false;
        });

        textInputEditText1.setOnKeyListener((v, keyCode, event) -> {
            textInputLayout1.setError(getString(R.string.empty_text));
            return false;
        });
    }
}
