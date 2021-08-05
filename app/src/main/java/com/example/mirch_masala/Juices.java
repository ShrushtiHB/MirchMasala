package com.example.mirch_masala;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class Juices extends AppCompatActivity {
    ElegantNumberButton a,l,m,mo,g,o;
    Button add_to_cart5;
    String apple_qty,litchi_qty,mango_qty,mosambi_qty,guava_qty,orange_qty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_juices );
        a = (ElegantNumberButton)findViewById(R.id.amt1);
        l = (ElegantNumberButton)findViewById(R.id.amt2);
        m = (ElegantNumberButton)findViewById(R.id.amt3);
        mo = (ElegantNumberButton)findViewById(R.id.amt4);
        g = (ElegantNumberButton)findViewById(R.id.amt5);
        o = (ElegantNumberButton)findViewById(R.id.amt6);
        add_to_cart5 = (Button)findViewById(R.id.add_to_cart1);
        a.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                apple_qty = a.getNumber();
            }
        });
        l.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                litchi_qty = l.getNumber();
            }
        });
        m.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                mango_qty = m.getNumber();
            }
        });
        mo.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                mosambi_qty = mo.getNumber();
            }
        });
        g.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                guava_qty = g.getNumber();
            }
        });
        o.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                orange_qty = o.getNumber();
            }
        });
    }
}
