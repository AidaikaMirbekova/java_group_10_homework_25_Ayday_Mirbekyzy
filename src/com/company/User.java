package com.company;

import java.util.Scanner;

public class User {
    Scanner sc =new Scanner(System.in);

    public User() {
    }
    public GameOptions getMove() {
        System.out.print("Камень, ножницы или бумага? ");
        String userInput = sc.nextLine();
        userInput = userInput.toUpperCase();
        char firstLetter = userInput.charAt(0);
        if (firstLetter == 'К' || firstLetter == 'Н' || firstLetter == 'Б') {
            switch (firstLetter) {
                case 'К':
                    return GameOptions.ROCK;
                case 'Н':
                    return GameOptions.PAPER;
                case 'Б':
                    return GameOptions.SCISSORS;
            }
        }
        return getMove();
    }

    public boolean playAgain() {
        System.out.print("Хотите сыграть еще раз? Y-да");
        String userInput = sc.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Y';
    }
}
