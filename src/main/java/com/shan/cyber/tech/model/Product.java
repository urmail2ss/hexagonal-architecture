package com.shan.cyber.tech.model;

import java.io.Serial;
import java.io.Serializable;

// Consider this as a value object
// around which the domain logic revolves.
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID
            = 100000000L;
    private String name;

    // Getters and setters for the name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "product [name=" + name + "]";
    }
}
