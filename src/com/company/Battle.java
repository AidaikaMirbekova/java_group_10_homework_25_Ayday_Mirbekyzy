package com.company;

public class Battle {
    private User user;
    private Computer computer;
    private int userScore;
    private int computerScore;
    private int numberOfGames;

    public Battle() {
        user = new User();
        computer = new Computer();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }

    public void startGame() {
        System.out.println("КАМЕНЬ, НОЖНИЦЫ, БУМАГА!");

        GameOptions userMove = user.getMove();
        GameOptions computerMove = computer.getMove();
        System.out.println("\nВаш ход:  " + userMove+"\n");
        System.out.println("Ход компьютера: " + computerMove + "\n");

        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0:
                System.out.println("Ничья!");
                break;
            case 1:
                System.out.println(userMove + " бъет " + computerMove + ". Вы победили!");
                userScore++;
                break;
            case -1:
                System.out.println(computerMove + " бъет " + userMove + ". Вы проиграли.");
                computerScore++;
                break;
        }
        numberOfGames++;
        if (user.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }
    }

    private void printGameStats() {
        int wins = userScore;
        int losses = computerScore;
        int ties = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;

        System.out.print("+");
        printDashes(68);
        System.out.println("+");
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  | %11s |\n","Победа", "Поражение", "Ничья", "Всего игр", "Процент побед");
        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(13);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(15);
        System.out.println("|");
        System.out.printf("|  %6d  |  %9d  |  %6d  |  %12d  |  %11.2f%% |\n", wins, losses, ties, numberOfGames, percentageWon * 100);
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }

    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }
}
