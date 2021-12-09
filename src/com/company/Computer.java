package com.company;

import java.util.Random;

public class Computer {
    public GameOptions getMove() {
        GameOptions[] moves = GameOptions.values();
        Random rnd = new Random();
        int index = rnd.nextInt(moves.length);
        return moves[index];
    }
}
