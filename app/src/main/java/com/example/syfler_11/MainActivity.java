package com.example.syfler_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView TextInput = findViewById(R.id.text_input); //Создаём TextView для TextInput. Находим по ID
        TextView TextOutput = findViewById(R.id.text_output); //Создаём TextView для TextOutput. Находим по ID

        Button button_start = findViewById(R.id.button_start); //Создаю кнопку. Находим кнопку по ID

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (view.getId()==R.id.button_start){
                TextOutput.setText(TextInput.getText().toString());

            }
            }
        });


    }

}

