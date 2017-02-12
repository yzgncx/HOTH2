package com.example.francis.hoth;

/**
 * Created by Tyler on 11-Feb-17.
 */

public class Game {
    Statics[][] gameDisplay = new Statics[8][8];
    Player player;

    public boolean canMoveTo(int x, int y) {
        return gameDisplay[x][y].penetrable;
    }
}

