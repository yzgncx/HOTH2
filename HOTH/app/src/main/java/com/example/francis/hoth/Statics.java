package com.example.francis.hoth;

/**
 * Created by Tyler on 11-Feb-17.
 */

public class Statics extends GraphObject {
    boolean penetrable;
    public boolean isPenetrable() {
        return  penetrable;
    }
}

class Wall extends Statics {
    Wall(int x, int y){
        penetrable = false;
        s_x = x;
        s_y = y;
    }
}

class Floor extends Statics {
    Floor (int x, int y) {
        penetrable = true;
        s_x = x;
        s_y = y;
    }
}

class EndGate extends Statics {
    EndGate(int x, int y, int a) {
        accepting_value = a;
        s_x = x;
        s_y = y;
    }
    int accepting_value;
}