package main;

import models.RecordData;
import models.RecordKey;
import operations.RecordOperation;
import storage.ReceivingData;
import storage.impl.FileStorage;
import storage.impl.LocalStorage;


import java.io.IOException;


import static operations.RecordOperation.*;
import static util.UserQuery.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ReceivingData receivingData = new FileStorage();
        RecordOperation operations = new RecordOperation(receivingData);
        String resource;
        String login;
        String password;

        System.out.println('\n' + "Welcome to Password Reminder" + '\n');
        while (true) {
            System.out.println("add/upgrade/remove/print/get/exit");
            userQuery();

            switch (userMassage) {

                case "add":
                    resource = userQuery();
                    login = userQuery();
                    password = userQuery();
                    operations.add(new RecordKey(resource), new RecordData(login,password));
                    break;

                case "upgrade":
                    resource = userQuery();
                    login = userQuery();
                    password = userQuery();
                    operations.update(new RecordKey(resource), new RecordData(login,password));
                    break;

                case "remove":
                    operations.remove(userQuery());
                    break;

                case "print":
                   operations.print();
                    break;

                case "get":
                    System.out.println(operations.getByResource(userQuery()));
                    break;

                case "exit":
                    exitProgramm(userMassage);

            }
        }
    }


}
