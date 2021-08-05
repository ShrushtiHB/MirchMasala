package com.example.mirch_masala;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

import java.util.ArrayList;

public class Dairy extends AppCompatActivity {
    LinearLayout milk,cheese,lassi,dahi,paneer,butter;
    ElegantNumberButton m,c,l,d,p,b;
    Button add_to_cart1;
    TextView mil,che,las,dah,pan,but;
    String milk_qty,paneer_qty,cheese_qty,dahi_qty,butter_qty,lassi_qty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_dairy );
        mil = (TextView)findViewById(R.id.pdt_name1);
        milk = (LinearLayout) findViewById ( R.id.item1 );
        cheese = (LinearLayout) findViewById ( R.id.item3 );
        paneer = (LinearLayout) findViewById ( R.id.item2 );
        butter = (LinearLayout) findViewById ( R.id.item5 );
        dahi = (LinearLayout) findViewById ( R.id.item4 );
        lassi = (LinearLayout) findViewById ( R.id.item6 );
        m = (ElegantNumberButton)findViewById(R.id.amt1);
        p = (ElegantNumberButton)findViewById(R.id.amt2);
        c = (ElegantNumberButton)findViewById(R.id.amt3);
        d = (ElegantNumberButton)findViewById(R.id.amt4);
        b = (ElegantNumberButton)findViewById(R.id.amt5);
        l = (ElegantNumberButton)findViewById(R.id.amt6);
        add_to_cart1 = (Button)findViewById(R.id.add_to_cart1);


        m.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                 milk_qty = m.getNumber();
            }
        });
        p.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                 paneer_qty = p.getNumber();
            }
        });
        c.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                 cheese_qty = c.getNumber();
            }
        });
        d.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                 dahi_qty = d.getNumber();
            }
        });
        b.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                 butter_qty = b.getNumber();
            }
        });
        l.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {
                 lassi_qty = l.getNumber();
            }
        });
        add_to_cart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String milk = mil.getText().toString();
 //               String paneer = pan.getText().toString();
   //             String cheese = che.getText().toString();
     //           String dahi = dah.getText().toString();
       //         String butter = but.getText().toString();
         //       String lassi = las.getText().toString();
                ArrayList<String> item_name = new ArrayList<>();
                item_name.add(milk);
               // item_name.add(paneer);
//                item_name.add(cheese);
  //              item_name.add(dahi);
    //            item_name.add(butter);
      //          item_name.add(lassi);
                ArrayList<String> item_qty = new ArrayList<>();
                item_qty.add(milk_qty);
//                item_qty.add(paneer_qty);
  //              item_qty.add(cheese_qty);
    //            item_qty.add(dahi_qty);
      //          item_qty.add(butter_qty);
        //        item_qty.add(lassi_qty);
                Bundle b = new Bundle();
                b.putStringArrayList("item_name",item_name);
                b.putStringArrayList("item_qty",item_qty);

                Intent intent1 = new Intent(Dairy.this, BillActivity.class);
                intent1.putExtras(b);
                startActivity(intent1);
            }
        });



    }



}
