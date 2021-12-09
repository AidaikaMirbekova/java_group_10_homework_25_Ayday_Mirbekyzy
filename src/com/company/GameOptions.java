package com.company;

public enum GameOptions {
    ROCK, PAPER, SCISSORS,LIZARD,SPOCK;
    public int compareMoves(GameOptions otherMove) {
        if (this == otherMove)
            return 0;

        switch (this) {
            case ROCK:
                return (otherMove == SCISSORS ? 1 : -1);
            case PAPER:
                return (otherMove == ROCK ? 1 : -1);
            case SCISSORS:
                return (otherMove == PAPER ? 1 : -1);

        }
        return 0;
    }
}
