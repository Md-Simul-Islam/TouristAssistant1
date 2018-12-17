package com.example.user.touristassistant;

//package com.example.user.multiplebutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {


    private Button comillaButton, lalmoyButton, moynamotiButton, bardButton;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        comillaButton = (Button) findViewById(R.id.comillaButtonId);
        bardButton = (Button) findViewById(R.id.bardButtonId);
        moynamotiButton = (Button) findViewById(R.id.moynamotiButtonId);

        lalmoyButton = (Button) findViewById(R.id.lalmoyButtonId);
        comillaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SecondActivity.this, thirdActivity.class);
                intent.putExtra("name", "comilla");
                startActivity(intent);

            }
        });
        bardButton.setOnClickListener(this);
        moynamotiButton.setOnClickListener(this);
        lalmoyButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.bardButtonId) {
            intent = new Intent(SecondActivity.this, thirdActivity.class);
            intent.putExtra("name", "bard");
            startActivity(intent);

        }
        if (v.getId() == R.id.moynamotiButtonId) {
            intent = new Intent(SecondActivity.this, thirdActivity.class);
            intent.putExtra("name", "moynamoti");
            startActivity(intent);

        }
        if (v.getId() == R.id.lalmoyButtonId) {
            intent = new Intent(SecondActivity.this, thirdActivity.class);
            intent.putExtra("name", "lalmoy");
            startActivity(intent);

        }

    }
}

