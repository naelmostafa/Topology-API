package com.company;

import java.util.ArrayList;

public class API {
    private ArrayList<Topology> topologies;

    public API(ArrayList<Topology> topologies) {
        this.topologies = topologies;
    }

    public ArrayList<Topology> getTopologies() {
        return topologies;
    }

    public void setTopologies(ArrayList<Topology> topologies) {
        this.topologies = topologies;
    }

    public void readJson() {
        try {
            //TODO

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeJson() {
        //TODO
    }

}
