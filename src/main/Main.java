package main;

import models.Record;
import java.util.Arrays;
import static helpers.InputHelper.*;

public class Main {

    private static final int LOAD_FACTOR = 5;
    private static Record[] records = new Record[5];

    public static void main(String[] args) {

        while (true) {
            System.out.println("Welcome to Password Reminder");
            System.out.println("Для добавления записи пропишите add" + '\n'
                    + "Для просмотра записей пропишите show" + '\n'
                    + "Для выхода из программы пропишите exit");
            scanFromUserImput();

            switch (info) {
                case "add":
                    int newIndex = 0;
                        newIndex = getEmptySlot();
                        records[newIndex] = scanRecord();

                    break;
                case "show":
                    showArray(records);

                    break;
                case "exit":
                    exitProgramm(info);

            }
        }
    }

    private static int getEmptySlot() {
        int i = 0;
        for (; i < records.length; i++) {
            if (records[i] == null) {
                return i;
            }
        }
        records = Arrays.copyOf(records, records.length + LOAD_FACTOR);
        return i;
    }

    private static Record scanRecord() {
        String resourceName;
        String login;
        String password;

        System.out.println("Введите название ресурса: ");
        scanFromUserImput();
        exitProgramm(info);
        resourceName = info;


        System.out.println("Введите Login: ");
        scanFromUserImput();
        exitProgramm(info);
        login = info;

        System.out.println("Введите Password: ");
        scanFromUserImput();
        exitProgramm(info);
        password = info;

        return new Record(resourceName, login, password);
    }
}
