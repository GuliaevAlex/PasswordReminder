package storage.impl;

import models.RecordData;
import models.RecordKey;
import storage.ReceivingData;

import java.util.Collection;
import java.util.Map;

public class DBStorage implements ReceivingData {
    @Override
    public Collection<Map.Entry<RecordKey, RecordData>> getRecords() {
        return null;
    }

    @Override
    public void add(RecordKey recordKey, RecordData recordData) {

    }

    @Override
    public RecordData getBySource(RecordKey recordKey) {
        return null;
    }

    @Override
    public boolean remove(RecordKey recordKey) {
        return false;
    }

    @Override
    public void update(RecordKey recordKey, RecordData newData) {

    }

    @Override
    public boolean checkResource(String resource) {
        return false;
    }
}
