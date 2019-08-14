package com.company;

import java.util.Scanner; // импорт сканера

public class Commands {
    public void getHelp() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            String commands = scan.nextLine();
            if ("Help".equalsIgnoreCase(commands))
                System.out.println("\n" +
                        "Вывод справки по командам: help\n" +
                        "Вывод новых задач: list -s new\n" +
                        "Вывод выполненных задач: list -s done\n" +
                        "Вывод всех задач: list\n" +
                        "Пометить задачу как выполненную: complete\n" +
                        "Добавить новую задачу: new\n" +
                        "Редактировать: edit\n" +
                        "Удалить: remove\n");
            else if ("list -s new".equals(commands))
                System.out.println("Тут будет Вывод новых задач");  //Еще не сделал
            else if ("list -s done".equals(commands))
                System.out.println("Тут будет Вывод выполненных задач"); //Еще не сделал
            else if ("list".equals(commands))
                System.out.println("Тут будет список задач"); //Еще не сделал
            else if ("complete".equals(commands))
                System.out.println("Тут будет функция Пометить задачу как выполненную"); //Еще не сделал
            else if ("new".equals(commands))
                System.out.println("Тут будет функция Добавить новую задачу"); //Еще не сделал
            else if ("edit".equals(commands))
                System.out.println("Тут будет функция Редактировать задачу"); //Еще не сделал
            else if ("remove".equals(commands))
                System.out.println("Тут будет функция Удалить задачу"); //Еще не сделал
            else {
                System.out.println("Неизвестная команда !");
            }
        }
    }
}


