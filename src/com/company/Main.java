package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int countMatches=17;
        ComputerLogic computer= new ComputerLogic();
        System.out.println("Игра началась.На столе осталось 20 спичек");
        ConsoleOutput.computerOutput(3);
        while (countMatches>1) {
            ConsoleOutput.output(countMatches);
            ConsoleOutput.userOutput();
            int user=new Scanner(System.in).nextInt();
            while(user<1 || user>3) {
                System.out.println("Некорректное количество спичек!");
                ConsoleOutput.output(countMatches);
                ConsoleOutput.userOutput();
                user=new Scanner(System.in).nextInt();
            }
            countMatches-=user;
            ConsoleOutput.output(countMatches);
            countMatches-=computer.computerMove(countMatches);
        }
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }
}
