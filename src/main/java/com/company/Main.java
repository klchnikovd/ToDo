package com.company;

public class Main {

    public static void main(String[] args) {
        {
            System.out.println("\n" +
                    " _____     _                 _      _           _       _______        _   \n" +
                    "|_   _|   (_)               | |    | |         | |     |__   __|      | |  \n" +
                    "  | |  ___ _ _ __ ___  _ __ | | ___| |     __ _| |__      | | ___  ___| |_ \n" +
                    "  | | / __| | '_ ` _ \\| '_ \\| |/ _ \\ |    / _` | '_ \\     | |/ _ \\/ __| __|\n" +
                    " _| |_\\__ \\ | | | | | | |_) | |  __/ |___| (_| | |_) |    | |  __/\\__ \\ |_ \n" +
                    "|_____|___/_|_| |_| |_| .__/|_|\\___|______\\__,_|_.__/     |_|\\___||___/\\__|\n" +
                    "                      | |                                                  \n" +
                    "                      |_|                                                  \n"+
                    "Welcome to ToDo List "
            );
        }

        com.company.Commands ourcat = new Commands();
        ourcat.getHelp();
    }
}