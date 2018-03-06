package com.demo_collapsing_toolbar.pulkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.demo_collapsing_toolbar.pulkit.activities.DemoCollapsingToolbarActivity;
import com.demo_collapsing_toolbar.pulkit.activities.SimpleCollapsingToolbarActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnSimpleCollapsingToolbar, btnCollapsingToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findIds();
        init();

    }

    private void findIds() {

        btnSimpleCollapsingToolbar = findViewById(R.id.btn_simple_collapsing_toolbar);
        btnCollapsingToolbar = findViewById(R.id.btn_collapsing_toolbar);

    }

    private void init() {

        btnSimpleCollapsingToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SimpleCollapsingToolbarActivity.class);
                startActivity(intent);
            }
        });

        btnCollapsingToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DemoCollapsingToolbarActivity.class);
                startActivity(intent);
            }
        });

    }

}

