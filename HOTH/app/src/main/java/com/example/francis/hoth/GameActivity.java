package com.example.francis.hoth;

import android.graphics.drawable.Drawable;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class GameActivity extends AppCompatActivity {

    ImageView imageView;
    Game g = new Game();

    @Override
    public View findViewById(@IdRes int id) {
        return super.findViewById(id);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        /*
        String[][] map = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(i == 0 || i == 7 || j == 0 || j == 7)
                    map[i][j] = "wall";
                else
                    map[i][j] = "floor";
            }
        }
        */


        //initialize the grid with the proper object
        for (int i = 0; i<8 ; i++)
            for (int j=0; j<8; j++)
            {
                String gridID = "grid."+i+"."+j;
                int resID = getResources().getIdentifier(gridID, "id", getPackageName());
                Drawable d = getDrawable(resID);
                String name = getResources().getResourceEntryName(resID);
                if (name == "wall")
                    g.gameDisplay[i][j] = new Wall(i,j);
                else if (name == "gate")
                    g.gameDisplay[i][j] = new EndGate(i,j,10); //value arbtrarily set
                else if (name == "floor")
                    g.gameDisplay[i][j] = new Floor(i,j);
            }


        Button right = (Button) findViewById(R.id.right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                g.move('r');
            }
        });

        Button left = (Button) findViewById(R.id.left);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                g.move('l');
            }
        });

        Button up = (Button) findViewById(R.id.up);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
            g.move('u');
            }
        });

        Button down = (Button) findViewById(R.id.down);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
            g.move('d');
            }
        });

    }

}

