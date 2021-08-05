package com.example.mirch_masala;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class Grains extends AppCompatActivity {
    ElegantNumberButton r,w,t,u,m,ra;
    Button add_to_cart4;
    String rice_qty,wheat_qty,toor_qty,urad_qty,moong_qty,rajma_qty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_grains );
        r = (ElegantNumberButton)findViewById(R.id.amt1);
        w = (ElegantNumberButton)findViewById(R.id.amt2);
        t = (ElegantNumberButton)findViewById(R.id.amt3);
        u = (ElegantNumberButton)findViewById(R.id.amt4);
        m = (ElegantNumberButton)findViewById(R.id.amt5);
        ra = (ElegantNumberButton)findViewById(R.id.amt6);
        add_to_cart4 = (Button)findViewById(R.id.add_to_cart1);
        r.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                rice_qty = r.getNumber();
            }
        });
        w.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                wheat_qty = w.getNumber();
            }
        });
        t.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                toor_qty = t.getNumber();
            }
        });
        u.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                urad_qty = u.getNumber();
            }
        });
        m.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                moong_qty = m.getNumber();
            }
        });
        ra.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                rajma_qty = ra.getNumber();
            }
        });

    }
}
