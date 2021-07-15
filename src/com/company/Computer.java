package com.company;
;

public class Computer {

    int previousCountOfMatches = 20;


    public int getComputerInput(int countOfMatches) {

        return calculateInput(countOfMatches);
    }

    private int calculateInput(int countOfMatches) {
        int computerInput;

        if (countOfMatches == 20) {
            computerInput = 3;
        } else {
            computerInput = 4 - (previousCountOfMatches - countOfMatches);
        }
        previousCountOfMatches = countOfMatches - computerInput;
        return computerInput;
    }

}
