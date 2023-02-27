package util;

import models.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class UserQuery {

    public static String userMassage;

    public static String userQuery() {

        Scanner s = new Scanner(System.in);
        userMassage = s.nextLine().toLowerCase();
        return userMassage;

    }

}


