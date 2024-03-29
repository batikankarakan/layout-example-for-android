package com.example.batikan.layoutsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinearLayoutActivity extends AppCompatActivity {

    public static final int HORIZANTAL_EXAMPLE = 0;
    public static final int VERTICAL_EXAMPLE = 1;
    public static final int WEIGHT_EXAMPLE = 2;
    public static final int GRAVITY_EXAMPLE = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        Button showHorizantalExample = (Button) findViewById(R.id.btn_show_horizantal_example);
        showHorizantalExample.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showExample(HORIZANTAL_EXAMPLE);
            }
        });

        Button showVerticalExample = (Button) findViewById(R.id.btn_show_vertical_example);
        showVerticalExample.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showExample(VERTICAL_EXAMPLE);
            }
        });

        Button showWeightExample = (Button) findViewById(R.id.btn_show_weight_example);
        showWeightExample.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showExample(WEIGHT_EXAMPLE);
            }
        });

        Button showGravityExample = (Button) findViewById(R.id.btn_show_gravity_example);
        showGravityExample.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showExample(GRAVITY_EXAMPLE);
            }
        });
    }

    private void showExample(int exampleId) {
        Intent intent = new Intent(LinearLayoutActivity.this, LinearLayoutExampleActivity.class);
        intent.putExtra("exampleId", exampleId);
        startActivity(intent);
    }
}
