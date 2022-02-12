package helpers;

import models.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class InputHelper {

    public static String infoFromUser;

    public static String scanFromUserImput() {
        Scanner s = new Scanner(System.in);
        infoFromUser = s.nextLine();
        return infoFromUser;
    }


    public static void showArray(Map<RecordKey, RecordData> map) {
        Iterator<Map.Entry<RecordKey, RecordData>> itr1 = map.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry<RecordKey, RecordData> entry = itr1.next();
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

    }

    public static void exitProgramm(String e) {
        if (e.equals("exit")) {
            System.exit(0);
        }
    }

}
