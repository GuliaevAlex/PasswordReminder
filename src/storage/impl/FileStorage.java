package storage.impl;

import dao.FileManagement;
import models.RecordData;
import models.RecordKey;
import storage.ReceivingData;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FileStorage implements ReceivingData {


    private static Map<RecordKey, RecordData> records = new HashMap<>();


    private FileManagement fileManagement = new FileManagement();


    @Override
    public Collection<Map.Entry<RecordKey, RecordData>> getRecords() {
        try {
            records = (Map)fileManagement.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return records.entrySet();
    }

    @Override
    public void add(RecordKey recordKey, RecordData recordData) {
        try {
            records = (Map)fileManagement.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        records.put(recordKey, recordData);
        try {
            fileManagement.write(records);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public RecordData getBySource(RecordKey recordKey) {
        try {
            records = (Map)fileManagement.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return records.get(recordKey);
    }

    @Override
    public boolean remove(RecordKey recordKey) {
        try {
            records = (Map)fileManagement.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return records.remove(recordKey) != null;
    }

    @Override
    public void update(RecordKey recordKey, RecordData newData) {
        try {
            records = (Map)fileManagement.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        records.replace(recordKey, newData);
        try {
            fileManagement.write(records);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean checkResource(String resource) {
        try {
            records = (Map)fileManagement.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return records.containsKey(new RecordKey(resource));
    }
}
