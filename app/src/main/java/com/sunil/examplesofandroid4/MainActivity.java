package com.sunil.examplesofandroid4;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.sunil.examplesofandroid4.R.id.button_red;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button red,blue,yellow,green,magenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red=(Button)findViewById(button_red);
        blue=(Button)findViewById(R.id.button_blue);
        yellow=(Button)findViewById(R.id.button_yellow);
        green=(Button)findViewById(R.id.button_green);
        magenta=(Button)findViewById(R.id.button_magenta);

        red.setOnClickListener(this);
        blue.setOnClickListener(this);
        yellow.setOnClickListener(this);
        green.setOnClickListener(this);
        magenta.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case button_red:
                red.setVisibility(View.GONE);
                blue.setBackgroundColor(Color.RED);
                yellow.setBackgroundColor(Color.RED);
                green.setBackgroundColor(Color.RED);
                magenta.setBackgroundColor(Color.RED);
                blue.setVisibility(v.VISIBLE);
                yellow.setVisibility(v.VISIBLE);
                green.setVisibility(v.VISIBLE);
                magenta.setVisibility(v.VISIBLE);
                break;
            case R.id.button_blue:
                blue.setVisibility(View.GONE);
                red.setBackgroundColor(Color.BLUE);
                yellow.setBackgroundColor(Color.BLUE);
                green.setBackgroundColor(Color.BLUE);
                magenta.setBackgroundColor(Color.BLUE);
                red.setVisibility(v.VISIBLE);
                yellow.setVisibility(v.VISIBLE);
                green.setVisibility(v.VISIBLE);
                magenta.setVisibility(v.VISIBLE);
                break;

            case R.id.button_yellow:
                yellow.setVisibility(View.GONE);
                red.setBackgroundColor(Color.YELLOW);
                blue.setBackgroundColor(Color.YELLOW);
                green.setBackgroundColor(Color.YELLOW);
                magenta.setBackgroundColor(Color.YELLOW);
                red.setVisibility(v.VISIBLE);
                blue.setVisibility(v.VISIBLE);
                green.setVisibility(v.VISIBLE);
                magenta.setVisibility(v.VISIBLE);

                break;
            case R.id.button_green:
                green.setVisibility(View.GONE);
                red.setBackgroundColor(Color.GREEN);
                blue.setBackgroundColor(Color.GREEN);
                yellow.setBackgroundColor(Color.GREEN);
                magenta.setBackgroundColor(Color.GREEN);
                yellow.setVisibility(v.VISIBLE);
                blue.setVisibility(v.VISIBLE);
                red.setVisibility(v.VISIBLE);
                magenta.setVisibility(v.VISIBLE);
                break;
            case R.id.button_magenta:
                magenta.setVisibility(View.GONE);
                red.setBackgroundColor(Color.MAGENTA);
                blue.setBackgroundColor(Color.MAGENTA);
                yellow.setBackgroundColor(Color.MAGENTA);
                green.setBackgroundColor(Color.MAGENTA);

                yellow.setVisibility(v.VISIBLE);
                blue.setVisibility(v.VISIBLE);
                green.setVisibility(v.VISIBLE);
                red.setVisibility(v.VISIBLE);

                break;
        }

    }
}
