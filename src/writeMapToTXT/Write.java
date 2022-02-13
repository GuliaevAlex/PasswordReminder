package writeMapToTXT;


import models.RecordData;
import models.RecordKey;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Write {

    public void writeObject(Map<RecordKey, RecordData> records) {
        try {
            String path = new File("").getAbsolutePath();
            File newFile = new File(path + "/file.txt");

            FileOutputStream outputStream = new FileOutputStream(newFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(records);
            outputStream.close();
            System.out.println("Successfull");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
