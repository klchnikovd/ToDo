package com.company;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        {
            System.out.println(" _______    _____          _      _     _    __      __           _               __   ___  \n"  +
                    "|__   __|  |  __ \\        | |    (_)   | |   \\ \\    / /          (_)             /_ | / _ \\ \n" +
                    "   | | ___ | |  | | ___   | |     _ ___| |_   \\ \\  / /__ _ __ ___ _  ___  _ __    | || | | |\n" +
                    "   | |/ _ \\| |  | |/ _ \\  | |    | / __| __|   \\ \\/ / _ \\ '__/ __| |/ _ \\| '_ \\   | || | | |\n" +
                    "   | | (_) | |__| | (_) | | |____| \\__ \\ |_     \\  /  __/ |  \\__ \\ | (_) | | | |  | || |_| |\n" +
                    "   |_|\\___/|_____/ \\___/  |______|_|___/\\__|     \\/ \\___|_|  |___/_|\\___/|_| |_|  |_(_)___/ \n" +
                    "                                                                                                  \n" +
                    "                                                                                                   \n" +
                    "Для получения списка команд введите Help: \n"
            );
            com.company.Commands first = new Commands();
            first.getHelp();
        }

    }
}