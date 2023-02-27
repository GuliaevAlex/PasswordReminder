package dao;

import java.io.*;

public class FileManagement {
    private  String path = "FileStorage";

    public void write(Object object) throws IOException {
        try (ObjectOutputStream input = new  ObjectOutputStream(new FileOutputStream(this.path))){
            input.writeObject(object);
            input.flush();
        }
    }

    public Object read() throws IOException {
        Object object =  null;
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(this.path))){
            object = input.readObject();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return object;
    }




}
