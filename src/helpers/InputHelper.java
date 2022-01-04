package helpers;

import models.Record;

import java.util.Scanner;

public class InputHelper {

    public static String info;

    public static String scanFromUserImput() {
        Scanner s = new Scanner(System.in);
        info = s.nextLine();
        return info;
    }

    public static void showArray(Record[] records) {
        for (Record r : records) {
            if (r != null) {
                System.out.println(r);
            } else {
                System.out.println("{Пустая ячейка} ");
            }
        }
    }

    public static void exitProgramm(String e) {
        if (e.equals("exit")) {
            System.exit(0);
        }
    }

}
