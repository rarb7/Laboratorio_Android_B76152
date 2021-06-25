package com.example.laboratorio2_b76152.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class characteristic {


    private List<Abilityc> abilities = null;

    private Integer baseExperience;

    private List<Form2> forms = null;

    private Integer height;

    private Integer id;

    private Integer weight;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Abilityc> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Abilityc> abilities) {
        this.abilities = abilities;
    }


    public Integer getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    public List<Form2> getForms() {
        return forms;
    }


    public void setForms(List<Form2> forms) {
        this.forms = forms;
    }


    public Integer getHeight() {
        return height;
    }


    public void setHeight(Integer height) {
        this.height = height;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}//characteristic
