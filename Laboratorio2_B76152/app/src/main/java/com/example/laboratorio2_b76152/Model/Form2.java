package com.example.laboratorio2_b76152.Model;

import java.util.HashMap;
import java.util.Map;

public class Form2 {

    private String name;

    private String url;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}//fprm class
