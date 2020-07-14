package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

    protected static int id;
    protected static int nextId = 1;
    protected static String value;

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
