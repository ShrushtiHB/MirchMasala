package com.example.mirch_masala;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Home1Activity extends AppCompatActivity {
    CardView dairy,grains,chocolates,dryfruits,spices,juices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);
        dairy = (CardView)findViewById ( R.id.Dairy );
        grains = (CardView)findViewById ( R.id.Grains );
        chocolates = (CardView)findViewById ( R.id.Chocolates );
        dryfruits = (CardView)findViewById ( R.id.Dryfruits );
        spices = (CardView)findViewById ( R.id.Spices );
        juices= (CardView)findViewById ( R.id.Juices );

        dairy.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home1Activity.this,Dairy.class);
                startActivity(intent);
            }
        } );
        grains.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home1Activity.this,Grains.class);
                startActivity(intent);
            }
        } );
        chocolates.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home1Activity.this,Chocolates.class);
                startActivity(intent);
            }
        } );
        dryfruits.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home1Activity.this,DryFruits.class);
                startActivity(intent);
            }
        } );
        spices.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home1Activity.this,Spices.class);
                startActivity(intent);
            }
        } );
        juices.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home1Activity.this,Juices.class);
                startActivity(intent);
            }
        } );
    }
}
