package storage;

import models.RecordData;
import models.RecordKey;

import java.util.Collection;
import java.util.Map;

public interface ReceivingData {

    Collection <Map.Entry<RecordKey,RecordData>> getRecords();

    void add(RecordKey recordKey, RecordData recordData);

    RecordData getBySource(RecordKey recordKey);

    boolean remove(RecordKey recordKey);

    void update(RecordKey recordKey,RecordData newData);

    boolean checkResource(String resource);
}
