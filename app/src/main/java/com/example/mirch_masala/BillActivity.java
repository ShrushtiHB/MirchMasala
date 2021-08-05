package com.example.mirch_masala;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BillActivity extends AppCompatActivity {
    LinearLayout item1,item2,item3,item4,item5;
    Button billbtn,back;
    TextView item_name1,item_qty1,item_price1;
    TextView item_name2,item_qty2,item_price2;
    TextView item_name3,item_qty3,item_price3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        item1 = (LinearLayout) findViewById ( R.id.item1 );
        item2 = (LinearLayout) findViewById ( R.id.item2 );
        item3 = (LinearLayout) findViewById ( R.id.item3 );
        item4 = (LinearLayout) findViewById ( R.id.item4 );
        item5 = (LinearLayout) findViewById ( R.id.item5 );
        billbtn = (Button)findViewById(R.id.billbtn);
        back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(BillActivity.this, Home1Activity.class);
                startActivity(back);
            }
        });
        TextView []fitem_name = new TextView[4];
        fitem_name[1] = (TextView)findViewById(R.id.item_name1);
        fitem_name[2] = (TextView)findViewById(R.id.item_name2);
        fitem_name[3] = (TextView)findViewById(R.id.item_name3);
        TextView []fitem_qty = new TextView[4];
        fitem_qty[1] = (TextView)findViewById(R.id.item_qty1);
        fitem_qty[2] = (TextView)findViewById(R.id.item_qty2);
        fitem_qty[3] = (TextView)findViewById(R.id.item_qty3);
        item_price1 = (TextView)findViewById(R.id.item_price1);
        item_price2 = (TextView)findViewById(R.id.item_price2);
        item_price3 = (TextView)findViewById(R.id.item_price3);
        Intent intent1 = getIntent();
        Bundle b = intent1.getExtras();
        ArrayList<String> item_name = b.getStringArrayList("item_name");
        ArrayList<String> item_qty = b.getStringArrayList("item_qty");
        ArrayList<TextView> tvprice = new ArrayList<>();
        tvprice.add(item_price1);
        tvprice.add(item_price2);
        tvprice.add(item_price3);
        int i;
        for(i=1;i<item_name.size();i++)
        {
            fitem_name[i].setText(item_name.get(i));
        }
        int j;
        for(j=1;j<item_qty.size();j++)
        {
            fitem_qty[j].setText(item_qty.get(j));
        }
        }
}
