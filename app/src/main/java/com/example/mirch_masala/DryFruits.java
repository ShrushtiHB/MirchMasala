package com.example.mirch_masala;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class DryFruits extends AppCompatActivity {
    ElegantNumberButton k,K,p,b,w,a;
    Button add_to_cart3;
    String kaju_qty,kishmish_qty,pista_qty,badam_qty,walnuts_qty,anjeer_qty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_dry_fruits );
        k = (ElegantNumberButton)findViewById(R.id.amt1);
        K = (ElegantNumberButton)findViewById(R.id.amt2);
        p = (ElegantNumberButton)findViewById(R.id.amt3);
        b = (ElegantNumberButton)findViewById(R.id.amt4);
        w = (ElegantNumberButton)findViewById(R.id.amt5);
        a = (ElegantNumberButton)findViewById(R.id.amt6);
        add_to_cart3 = (Button)findViewById(R.id.add_to_cart1);
        k.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                kaju_qty = k.getNumber();
            }
        });
        K.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                kishmish_qty = K.getNumber();
            }
        });
        p.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                pista_qty = p.getNumber();
            }
        });
        b.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                badam_qty = b.getNumber();
            }
        });
        w.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                walnuts_qty = w.getNumber();
            }
        });
        a.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                anjeer_qty = a.getNumber();
            }
        });
    }
}
