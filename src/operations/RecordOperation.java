package operations;

import models.RecordData;
import models.RecordKey;
import storage.ReceivingData;

public class RecordOperation {
        private ReceivingData receivingData;

    public RecordOperation(ReceivingData receivingData) {

        this.receivingData = receivingData;
    }

    public void add(RecordKey recordKey, RecordData recordData){

        receivingData.add(recordKey, recordData);
    }

    public void print (){
        System.out.println( receivingData.getRecords());
    }

    public boolean remove(String resource){
        return receivingData.remove(new RecordKey(resource));
    }

    public RecordData getByResource (String resource){
        return receivingData.getBySource(new RecordKey(resource));
    }

    public void update (RecordKey recordKey,RecordData recordData){
        receivingData.update(recordKey, recordData);
    }


    public static void exitProgramm(String e) {
        if (e.equals("exit")) {
            System.exit(0);
        }
    }
}
