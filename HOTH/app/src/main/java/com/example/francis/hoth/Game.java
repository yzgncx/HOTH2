package com.example.francis.hoth;

/**
 * Created by Tyler on 11-Feb-17.
 */

public class Game {

    Game(){
        game_state = 1;
    }
    int game_state;
    Statics[][] gameDisplay = new Statics[8][8];
    Player player;
    EndGate end_gate;

    int run() {
        while (game_state == 1){
            
        }
        return 0;
    }

    public boolean canMoveTo(int x, int y) {
        boolean end_gate_val = true;
        if (x == end_gate.s_x && y == end_gate.s_y){
            end_gate_val = end_gate.accepting_value == player.player_value;
        }
        return gameDisplay[x][y].isPenetrable() && end_gate_val;
    }

}

