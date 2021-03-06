package com.mycompany.battleship2;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TileView extends LinearLayout {

    TextView text;

    public TileView(Context context) {
        super(context);

        this.setOrientation(VERTICAL);


        text = new TextView(context);

        LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        text.setLayoutParams(layoutParams);
        text.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        text.setGravity(Gravity.CENTER_VERTICAL);
        text.setTextSize(50);
        text.setTextColor(Color.BLACK);

        setBackgroundColor(Color.LTGRAY);

        addView(text);

    }
}
