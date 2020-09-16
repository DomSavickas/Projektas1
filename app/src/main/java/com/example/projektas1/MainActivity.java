package com.example.projektas1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity
{
    Button mspalva;
    Button mtekstas;
    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvView = (TextView)findViewById(R.id.tvView);
        mtekstas = (Button)findViewById(R.id.mtekstas);
        tvView = (TextView)findViewById(R.id.tvView);
        mspalva = (Button)findViewById(R.id.mspalva);
        mspalva.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tvView.setTextColor(Color.GREEN);
            }
        });
        mtekstas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tvView.setText("Au Revoir");
            }
        });
    }

}