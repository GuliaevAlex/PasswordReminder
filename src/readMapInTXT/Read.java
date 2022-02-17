package readMapInTXT;

import models.RecordData;
import models.RecordKey;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Read {
    public Map<RecordKey, RecordData> readObject() {
        FileInputStream reader;

        try {
            reader = new FileInputStream("file.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(reader);

            return (Map<RecordKey, RecordData>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }
}
