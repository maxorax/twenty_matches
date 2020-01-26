package com.company;

public class ConsoleOutput {

    public static void computerOutput(int count){
        System.out.println("- Количество выбранных компьютером спичек = "+count+".");
    }

    public static void userOutput(){
        System.out.print("- Ход игрока. Введите количество спичек: ");
    }

    public static void output(int count){
        System.out.println("На столе осталось "+count+" спичек");
    }
}
