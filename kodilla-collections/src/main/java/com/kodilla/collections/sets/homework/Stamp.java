package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampDimensions;
    private boolean isStamped;

    public Stamp(String name, String dimensions, boolean isStamped) {
        this.stampName = name;
        this.stampDimensions = dimensions;
        this.isStamped = isStamped;
    }

    public String getName() {
        return stampName;
    }

    public String getDimensions() {
        return stampDimensions;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public String toString() {
        return "Stamp{" + "name='" + stampName + '\'' + ", dimensions='" + stampDimensions + '\'' + ", isStamped=" + isStamped + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stamp stamp = (Stamp) o;
        return isStamped == stamp.isStamped
                && Objects.equals(stampName, stamp.stampName)
                && Objects.equals(stampDimensions, stamp.stampDimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimensions, isStamped);
    }
}
