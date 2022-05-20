package com.company;

import java.util.Map;

public class Component {
    private String type;
    private String id;
    private Map<String, Integer> properties;
    private Map<String, String> netList;

    public Component(String type, String id, Map<String, Integer> properties, Map<String, String> netList) {
        this.type = type;
        this.id = id;
        this.properties = properties;
        this.netList = netList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Integer> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Integer> properties) {
        this.properties = properties;
    }

    public Map<String, String> getNetList() {
        return netList;
    }

    public void setNetList(Map<String, String> netList) {
        this.netList = netList;
    }
}


