package com.company;

import java.util.Scanner; // импорт сканера

public class Commands {
    public void getHelp(){
        System.out.print("Для получения списка командв введите Help: \n");
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        System.out.println ("\n" +
                "Вывод справки по командам: help\n" +
                "Вывод новых задач: list -s new\n" +
                "Вывод выполненных задач: list -s done\n" +
                "Вывод всех задач: list\n" +
                "Пометить задачу как выполненную: complete\n" +
                "Добавить новую задачу: new\n" +
                "Редактировать: edit\n" +
                "Удалить: remove\n");
    }
}