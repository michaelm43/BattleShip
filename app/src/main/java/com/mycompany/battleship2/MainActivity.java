package com.mycompany.battleship2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements Finals  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.start_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openGameActivity();
            }
        });
    }
    public void openGameActivity(){
        RadioGroup defaculty = (RadioGroup) findViewById(R.id.radio_group);
        int checked = defaculty.getCheckedRadioButtonId();
        Intent i = new Intent(this, gameActivity.class);
        Bundle radioInfo = new Bundle();
        radioInfo.putInt(DIFFICULT_INT , checked );
        i.putExtra(RADIO_BUNDEL, radioInfo);
        startActivity(i);
    }
}
