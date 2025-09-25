package org.example;

public abstract class Base {
    int id;
    boolean active = true;

    void deactivate(){
        active = false;
    }

    int getId(){
        return id;
    }
}
