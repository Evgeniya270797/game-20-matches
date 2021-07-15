package com.company;

import java.util.Scanner;

public class Game {

    private int countOfMatches = 20;
    private final Scanner scanner = new Scanner(System.in);
    private final ConsoleUtils consoleUtils = new ConsoleUtils();
    private final Computer computer = new Computer();


    // True - ходит игрок, false - ходит компьютер
    private boolean playerMoves = false;

    private int getPlayerInput() {
        int number;
        while (true) {
            consoleUtils.printPlayerInput();
            number = scanner.nextInt();

            if (number >= 1 && number <= 3) {
                break;
            }else if(number>countOfMatches){
                consoleUtils.printInputMoreThanRestMessage(countOfMatches);
            } else {
                consoleUtils.printIncorrectRange();
            }
        }
        return number;
    }

    private boolean isGameFinished() {
        return countOfMatches <= 1;
    }

    private boolean isPlayerWon(){
        return switch (countOfMatches) {
            case 0 -> playerMoves;
            case 1 -> !playerMoves;
            default -> false;
        };
    }

    public void run() {

        while (true) {
            consoleUtils.printRest(countOfMatches);
            int moveResult;
            if (playerMoves) {
                moveResult = getPlayerInput();
            } else {
                moveResult = computer.getComputerInput(countOfMatches);
                consoleUtils.printComputerInput(moveResult);
            }

            countOfMatches -= moveResult;
            if (isGameFinished()) {
                consoleUtils.printGameFinishMessage(isPlayerWon());
                break;
            }

            playerMoves = !playerMoves;
        }

    }

}
