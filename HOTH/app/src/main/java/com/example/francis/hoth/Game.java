package com.example.francis.hoth;

/**
 * Created by Tyler on 11-Feb-17.
 */

public class Game {

    Game(){}

    Statics[][] gameDisplay = new Statics[8][8];
    Player player;
    EndGate end_gate;

    public boolean move(char c) {
        int x = 0;
        int y = 0;
        switch (c) {
            case 'r':
                x = 1;
                break;
            case 'l':
                x = -1;
                break;
            case 'u':
                y = -1;
                break;
            case 'd':
                y = 1;
                break;
            default:
                return false;
        }
        if (canMoveTo(player.s_x + x, player.s_y + y)) {
            player.s_x += x;
            player.s_y += y;
            return true;
        }
        else return false;
    }

    public boolean canMoveTo(int x, int y) {
        boolean end_gate_val = true;
        if (x == end_gate.s_x && y == end_gate.s_y){
            end_gate_val = end_gate.accepting_value == player.player_value;
        }
        return gameDisplay[x][y].isPenetrable() && end_gate_val;
    }

}

