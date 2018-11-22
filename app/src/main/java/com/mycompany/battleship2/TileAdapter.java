package com.mycompany.battleship2;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.mycompany.battleship2.Logic.Board;

public class TileAdapter {//extends BaseAdapter {


    private Context mContext;
    private Board mBoard;

    public TileAdapter(Context context,Board board) {
        mBoard = board;
        mContext = context;
    }

/*
    @Override
    public int getCount() {
        return mBoard.getBoardSize();
    }

    @Override
    public Object getItem(int position) {
        return mBoard.getTile(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TileView tileView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            Log.e("Tile Adapter", "Not RECYCLED");
            tileView = new TileView(mContext);
            tileView.setLayoutParams(new GridView.LayoutParams(300, 300));
            tileView.setPadding(8, 8, 8, 8);
        } else {
            tileView = (TileView) convertView;
            Log.e("Tile Adapter", "RECYCLED-- YAY!!!!!");

        }

        //imageView.setImageResource(mThumbIds[position]);

        tileView.text.setText(mBoard.getTile(position).getStatus().toString());

        if(mBoard.getTile(position).getStatus() != Board.TileState.NONE) {
            tileView.setBackgroundColor(0x96353535);
        } else {
            tileView.setBackgroundColor(0xFF353535);
        }

        return tileView;
    }*/
}
