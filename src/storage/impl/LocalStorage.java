package storage.impl;

import models.RecordData;
import models.RecordKey;
import storage.ReceivingData;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LocalStorage implements ReceivingData {

    private static final Map<RecordKey, RecordData> records = new HashMap<>();


    @Override
    public Collection<Map.Entry<RecordKey, RecordData>> getRecords() {

        return records.entrySet();
    }

    @Override
    public void add(RecordKey recordKey, RecordData recordData) {
        records.put(recordKey, recordData);

    }

    @Override
    public RecordData getBySource(RecordKey recordKey) {

        return records.get(recordKey);
    }

    @Override
    public boolean remove(RecordKey recordKey) {

        return records.remove(recordKey) != null;
    }

    @Override
    public void update(RecordKey recordKey, RecordData newData) {

        records.replace(recordKey, newData);
    }

    @Override
    public boolean checkResource(String resource) {

        return records.containsKey(new RecordKey(resource));
    }
}
