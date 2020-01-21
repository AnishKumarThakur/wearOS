package com.example.wearos;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends WearableActivity {
    private  TextView tvOutput;
    private Button btnShow;
    private EditText editText;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutput= findViewById(R.id.tvOutput);
        btnShow = findViewById(R.id.btnShow);
        editText = findViewById(R.id.etText);


        mTextView = (TextView) findViewById(R.id.text);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText(editText.getText().toString());
            }
        });

        // Enables Always-on
        setAmbientEnabled();
    }
}
