package com.company;

public class ConsoleUtils {

    public void printRest(int rest){
        System.out.println("На столе осталось " + rest + " спичек.");
    }

    public void printComputerInput(int input){
        System.out.println(" - Колличество выбранных компьютером спичек = " + input );
    }

    public void printPlayerInput(){
        System.out.println(" - Ход игрока. Введите колличество спичек: ");
    }

    public void printGameFinishMessage(boolean isPlayerWon){
        String message = "Для $1$ осталась последняя спчика. $2$ проиграл!";
        if(isPlayerWon){
            message = message.replace("$1$","игрока");
            message = message.replace("$2$","Игрок");
        }else{
            message = message.replace("$1$","компьютера");
            message = message.replace("$2$","Компьютер");
        }
        System.out.println(message);
    }

    public void printIncorrectRange(){
        System.out.println("Введите число от  1 до 3 включительно");
    }

    public void printInputMoreThanRestMessage(int rest){
        System.out.println("Осталось  " + rest +" спичек");
    }
}
