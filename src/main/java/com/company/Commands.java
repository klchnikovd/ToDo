package com.company;

import jdk.nashorn.internal.runtime.ArgumentSetter;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner; // импорт сканера
public class Commands {
    public void getHelp() throws JAXBException, IOException {
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
            else if ("list -s new".equalsIgnoreCase(commands))
                System.out.println("Тут будет Вывод новых задач");  //Еще не сделал
            else if ("list -s done".equalsIgnoreCase(commands))
                System.out.println("Тут будет Вывод выполненных задач"); //Еще не сделал
            else if ("list".equalsIgnoreCase(commands)) {
                JaxbTest file = com.company.JaxbTest.unmarshall();
//                System.out.println(file.getTask());
                System.out.println("Номер задач: " +file.getId());
                System.out.println("наименование: " +file.getCaption());
                System.out.println("Коментарии: " +file.getDescription());
                System.out.println("Приоритет: " +file.getPriority());
                System.out.println("Крайний срок исполнения: " +file.getDeadline());
                System.out.println("Статус задачи: " +file.getStatus());
                System.out.println("Дата исполнения: " + file.getComplete());
            }
//               com.company.TaskList.main(null);
            else if ("complete".equalsIgnoreCase(commands))
                System.out.println("Тут будет функция Пометить задачу как выполненную"); //Еще не сделал
            else if ("new".equalsIgnoreCase(commands))
                System.out.println("Тут будет функция Добавить новую задачу"); //Еще не сделал
            else if ("edit".equalsIgnoreCase(commands))
                System.out.println("Тут будет функция Редактировать задачу"); //Еще не сделал
            else if ("remove".equalsIgnoreCase(commands))
                System.out.println("Тут будет функция Удалить задачу"); //Еще не сделал
            else {
                System.out.println("Неизвестная команда !");
            }
        }
    }
}
