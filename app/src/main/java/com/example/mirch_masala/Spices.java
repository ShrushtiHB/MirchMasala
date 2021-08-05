package com.example.mirch_masala;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class Spices extends AppCompatActivity {
    ElegantNumberButton j,h,l,d,b,e;
    Button add_to_cart6;
    String jeera_qty,haldi_qty,lal_qty,dalchini_qty,black_qty,elaichi_qty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_spices );
        j = (ElegantNumberButton)findViewById(R.id.amt1);
        h = (ElegantNumberButton)findViewById(R.id.amt2);
        l = (ElegantNumberButton)findViewById(R.id.amt3);
        d = (ElegantNumberButton)findViewById(R.id.amt4);
        b = (ElegantNumberButton)findViewById(R.id.amt5);
        e = (ElegantNumberButton)findViewById(R.id.amt6);
        add_to_cart6 = (Button)findViewById(R.id.add_to_cart1);
        j.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                jeera_qty = j.getNumber();
            }
        });
        h.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                haldi_qty = h.getNumber();
            }
        });
        l.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                lal_qty = l.getNumber();
            }
        });
        d.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                dalchini_qty = d.getNumber();
            }
        });
        b.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                black_qty = b.getNumber();
            }
        });
        e.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                elaichi_qty = e.getNumber();
            }
        });

    }
}
