package com.mycompany.battleship2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class gameActivity extends AppCompatActivity implements Finals{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent intent = getIntent();
        Bundle b = intent.getBundleExtra(RADIO_BUNDEL);
        if(b!=null){
            int radio = b.getInt(DIFFICULT_INT);
            /*switch (radio){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
            }*/
            TextView text = (TextView) findViewById(R.id.Size_Board);
            text.setText("" + radio);
        }

    }
}
