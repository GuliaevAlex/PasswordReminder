package helpers;

import models.Record;

import java.util.Scanner;

public class InputHelper {

    public static String infoFromUser;

    public static String scanFromUserImput() {
        Scanner s = new Scanner(System.in);
        infoFromUser = s.nextLine();
        return infoFromUser;
    }

    public static void showArray(Record[] records) {
        for (Record r : records) {
            if (r != null) {
                System.out.println(r);
            }
        }
    }

    public static void exitProgramm(String e) {
        if (e.equals("exit")) {
            System.exit(0);
        }
    }

}
