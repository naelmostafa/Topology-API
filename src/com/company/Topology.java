package com.company;


public class Topology {
    private int id;
    private Component[] components;

    public Topology(int id, Component[] components) {
        this.id = id;
        this.components = components;
    }

    public int getId() {
        return id;
    }

    public Component[] getComponents() {
        return components;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setComponents(Component[] components) {
        this.components = components;
    }

}
