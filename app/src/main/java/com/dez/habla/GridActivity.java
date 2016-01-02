package com.dez.habla;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        GridLayout gridLayout = (GridLayout)findViewById(R.id.gridLayout);
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int itemWidth = size.x/13;
        int itemHeight = size.y/8;
        for(int i =0, c = 0, r = 0; i < 77; i++, c++) {
            if (c == 12) {
                c = 0;
                r++;
            }

            TextView view = new TextView(this);
            //TextView view = (TextView)LayoutInflater.from(this).inflate(R.layout.grid_item, gridLayout, false);
            view.setText( String.valueOf(i));
            //oImageView.setImageResource(R.drawable.ic_launcher);
            GridLayout.LayoutParams param = new GridLayout.LayoutParams();
            param.height = itemHeight;
            param.width = itemWidth;
            //param.height = GridLayout.LayoutParams.WRAP_CONTENT;
            //param.width = GridLayout.LayoutParams.WRAP_CONTENT;
            param.rightMargin = 5;
            param.topMargin = 5;
            param.setGravity(Gravity.CENTER);
            param.columnSpec = GridLayout.spec(c);
            param.rowSpec = GridLayout.spec(r);
            view.setLayoutParams(param);
            gridLayout.addView(view);
        }
        /*for( int i=0 ; i< 14; i++ ){
            TextView view = (TextView)LayoutInflater.from(this).inflate(R.layout.grid_item, gridView, false);
            view.setText("Item # " + String.valueOf(i));
            gridView.addView(view);
        }*/

    }
}
