package com.example.mirch_masala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home2Activity extends AppCompatActivity {

    private Button shop_now;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_home2 );

        shop_now = (Button)findViewById ( R.id.shop_now );
        shop_now.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent moveToMainPg = new Intent(Home2Activity.this, Home1Activity.class);
                startActivity(moveToMainPg);
            }
        } );
    }
}
