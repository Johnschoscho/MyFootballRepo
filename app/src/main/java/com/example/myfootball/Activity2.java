package com.example.myfootball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button = (Button) findViewById(R.id.buttonToChelsea);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityChelsea();
            }

        });

        button = (Button) findViewById(R.id.buttonToArsenal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityArsenal();
            }

        });


        button = (Button) findViewById(R.id.buttonToTottenham);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openActivityTottenham();
        }

        });

        button = (Button) findViewById(R.id.buttonToLuton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLuton();
            }

        });

        button = (Button) findViewById(R.id.buttonToAston);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAston();
            }

        });

        button = (Button) findViewById(R.id.buttonToManU);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityManU();
            }

        });

        button = (Button) findViewById(R.id.buttonToManCity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityManCity();
            }

        });

        button = (Button) findViewById(R.id.buttonToEverton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityEverton();
            }

        });

        button = (Button) findViewById(R.id.buttonToLiverpool);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLiverpool();
            }

        });

        button = (Button) findViewById(R.id.buttonToFulham);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityFulham();
            }

        });

        button = (Button) findViewById(R.id.buttonToSheffield);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySheffield();
            }

        });

        button = (Button) findViewById(R.id.buttonToBrighton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBrighton();
            }

        });

        button = (Button) findViewById(R.id.buttonToWestHam);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityWestHam();
            }

        });
}

    public void openActivityChelsea(){
        Intent intent = new Intent(this, ActivityChelsea.class);
        startActivity(intent);
    }

    public void openActivityArsenal(){
        Intent intent = new Intent(this, ActivityArsenal.class);
        startActivity(intent);
    }

    public void openActivityTottenham(){
        Intent intent = new Intent(this, ActivityTottenham.class);
        startActivity(intent);
    }

    public void openActivityLuton(){
        Intent intent = new Intent(this, ActivityLuton.class);
        startActivity(intent);
    }

    public void openActivityAston(){
        Intent intent = new Intent(this, ActivityAston.class);
        startActivity(intent);
    }

    public void openActivityManU(){
        Intent intent = new Intent(this, ActivityManU.class);
        startActivity(intent);
    }

    public void openActivityManCity(){
        Intent intent = new Intent(this, ActivityManCity.class);
        startActivity(intent);
    }

    public void openActivityEverton(){
        Intent intent = new Intent(this, Activity_Everton.class);
        startActivity(intent);
    }

    public void openActivityLiverpool(){
        Intent intent = new Intent(this, Activity_Liverpool.class);
        startActivity(intent);
    }

    public void openActivityFulham(){
        Intent intent = new Intent(this, Activity_Fulham.class);
        startActivity(intent);
    }

    public void openActivitySheffield(){
        Intent intent = new Intent(this, ActivitySheffield.class);
        startActivity(intent);
    }

    public void openActivityBrighton(){
        Intent intent = new Intent(this, ActivityBrighton.class);
        startActivity(intent);
    }

    public void openActivityWestHam(){
        Intent intent = new Intent(this, ActivityWestHam.class);
        startActivity(intent);
    }
}