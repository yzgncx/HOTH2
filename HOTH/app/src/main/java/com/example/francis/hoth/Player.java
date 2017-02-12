package com.example.francis.hoth;

/**
 * Created by Tyler on 11-Feb-17.
 */

public class Player extends GraphObject {
    //player_value is the integer value contained by the player's box.
    int player_value;
    public void modPlayerValue(int n, char op) {
        switch (op) {
            case '+':
                player_value += n;
                break;
            case '-':
                player_value -= n;
                break;
            case '*':
                player_value -= n;
                break;
            case '/':
                player_value /= n;
                break;
            case '%':
                player_value %= n;
                break;
            default:
                System.err.println("invalid char op");
                break;
        }
    }
}
