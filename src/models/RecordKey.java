package models;

import java.io.Serializable;
import java.util.Objects;

public class RecordKey implements Serializable {
    private String resource;


    public RecordKey(String resource) {
        this.resource = resource;

    }


    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return '\n' +"{" + "Resource=" + resource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordKey recordKey = (RecordKey) o;
        return Objects.equals(resource, recordKey.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource);
    }
}

