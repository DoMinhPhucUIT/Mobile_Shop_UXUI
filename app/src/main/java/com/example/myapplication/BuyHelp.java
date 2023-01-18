package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class BuyHelp extends AppCompatActivity {

    TextView btOpenLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_help);

        Button btBuy = (Button) findViewById(R.id.btBuy);
        btBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialog = new MyDialogFragment();
                dialog.show(getSupportFragmentManager(), "MyDialogFragmentTag");
            }
        });


        LinearLayout btHome = (LinearLayout) findViewById(R.id.btHome);
        btHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),Home.class);
                startActivityForResult(myIntent, 0);
            }
        });
        LinearLayout btBuyHelp = (LinearLayout) findViewById(R.id.btBuyHelp);
        btBuyHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),Home.class);
                startActivityForResult(myIntent, 0);
            }
        });
        LinearLayout btMe = (LinearLayout) findViewById(R.id.btMe);
        btMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), BuyHelp.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageView imageView = (ImageView) findViewById(R.id.imgBuyHelp);
        imageView.setImageResource(R.drawable.buy_help_enable);
    }
}