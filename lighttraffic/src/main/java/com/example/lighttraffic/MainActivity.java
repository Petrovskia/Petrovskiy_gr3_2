package com.example.lighttraffic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;
    private Button mRedButton;
    private Button mYellowButton;
    private Button mGreenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstraintLayout = findViewById(R.id.constraintLayout);
        mInfoTextView = findViewById(R.id.textViewInfo);
        mRedButton = findViewById(R.id.red_button);
        mYellowButton = findViewById(R.id.yellow_button);
        mGreenButton = findViewById(R.id.green_button);

        mRedButton.setOnClickListener(this);
        mYellowButton.setOnClickListener(this);
        mGreenButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.red_button:
                mInfoTextView.setText(R.string.red);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
                break;
            case R.id.yellow_button:
                mInfoTextView.setText(R.string.yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
                break;
            case R.id.green_button:
                mInfoTextView.setText(R.string.green);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
                break;
        }
    }
}
