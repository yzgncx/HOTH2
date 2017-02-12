package com.example.francis.hoth;

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

        //checks Drawable object name to assign the right object at each position in game.gameDisplay
        for (int i = 0; i<8 ; i++)
            for (int j=0; j<8; j++)
            {
                String gridID = "grid."+i+"."+j;
                int resID = getResources().getIdentifier(gridID, "id", getPackageName());
                Drawable d = getDrawable(resID);
                String name = getResources().getResourceEntryName(resID);
                if (name == "wall")
                    game.gameDisplay[i][j] = new Wall(i,j);
                else if (name == "end_gate")
                    game.gameDisplay[i][j] = new EndGate(i,j,10); //value arbtrarily set
                else if (name == "floor")
                    game.gameDisplay[i][j] = new Floor(i,j);
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

