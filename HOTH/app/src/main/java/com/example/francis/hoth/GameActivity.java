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

        Button right = (Button) findViewById(R.id.right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                g.move('r');
            }
           }
        );

//        player = (TextView) findViewById(R.id.player)

    }

}

