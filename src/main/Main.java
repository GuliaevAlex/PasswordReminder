package main;

import models.RecordData;
import models.RecordKey;
import readMapInTXT.Read;
import writeMapToTXT.Write;


import java.util.HashMap;
import java.util.Map;

import static helpers.InputHelper.*;

public class Main {


    private static Map<RecordKey, RecordData> records = new HashMap<>();

    public static void main(String[] args) {
        System.out.println('\n' + "Welcome to Password Reminder" + '\n');
        while (true) {
            System.out.println("Для добавления записи пропишите add" + '\n'
                    + "Для изменения записи пропишите upgrade" + '\n'
                    + "Для удаления записи пропишите remove" +'\n'
                    + "Для просмотра конкретной записи пропишите get"+ '\n'
                    + "Для просмотра записей пропишите show" + '\n'
                    + "Для удаления всехзаписей пропишите clear" + '\n'
                    + "Для выхода из программы пропишите exit");
            scanFromUserImput();

            switch (infoFromUser) {
                case "add":
                    records.put(scanResource(), scanRecord());
                    break;

                case "upgrade":
                    records.replace(scanResource(), scanRecord());
                    break;

                case "remove":
                    System.out.println("Введите название русурса который хотите удалить");
                    records.remove(scanResource());
                    break;

                case "show":
                    System.out.println('\n' + "Start load from file:");
                    Read read = new Read();
                    records = read.readObject();
                    if(records.isEmpty()){
                        System.out.println("File is empty" + '\n');
                    }else{
                    showArray(records);}
                    break;

                case "save":
                    Write write = new Write();
                    write.writeObject(records);
                    break;

                case "clear":
                    clear(records);
                    break;

                case "get":
                    System.out.println(getRecord(records,scanResource() ));
                    break;

                case "exit":
                    exitProgramm(infoFromUser);

            }
        }
    }


    private static RecordKey scanResource() {
        String resourceName;

        System.out.println("Введите название ресурса: ");
        scanFromUserImput();
        exitProgramm(infoFromUser);
        resourceName = infoFromUser;

        return new RecordKey(resourceName);
    }

    private static RecordData scanRecord() {
        String login;
        String password;

        System.out.println("Введите Login: ");
        scanFromUserImput();
        exitProgramm(infoFromUser);
        login = infoFromUser;

        System.out.println("Введите Password: ");
        scanFromUserImput();
        exitProgramm(infoFromUser);
        password = infoFromUser;
        return new RecordData(login, password);
    }


}
