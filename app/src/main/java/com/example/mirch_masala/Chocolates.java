package com.example.mirch_masala;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class Chocolates extends AppCompatActivity {
    LinearLayout DairyMilk,Kitkat,FiveStar,Ferrero,Temptations,Galaxy;
    ElegantNumberButton d,k,F,f,t,g;
    Button add_to_cart2;
    TextView dai,kit,fiv,fer,tem,gal;
    String dairy_qty,kitkat_qty,five_qty,ferrero_qty,tempt_qty,galaxy_qty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_chocolates );
        d = (ElegantNumberButton)findViewById(R.id.amt1);
        k = (ElegantNumberButton)findViewById(R.id.amt2);
        F = (ElegantNumberButton)findViewById(R.id.amt3);
        f = (ElegantNumberButton)findViewById(R.id.amt4);
        t = (ElegantNumberButton)findViewById(R.id.amt5);
        g = (ElegantNumberButton)findViewById(R.id.amt6);
        add_to_cart2 = (Button)findViewById(R.id.add_to_cart1);
        d.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                dairy_qty = d.getNumber();
            }
        });
        k.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                kitkat_qty = k.getNumber();
            }
        });
        F.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                five_qty = F.getNumber();
            }
        });
        f.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                ferrero_qty = f.getNumber();
            }
        });
        t.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                tempt_qty = t.getNumber();
            }
        });
        g.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                galaxy_qty = g.getNumber();
            }
        });


    }
}
