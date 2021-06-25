package com.example.laboratorio2_b76152.Model;

import java.util.HashMap;
import java.util.Map;

public class Abilityc {
    private Ability__1 ability;

    private Boolean isHidden;

    private Integer slot;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Ability__1 getAbility() {
        return ability;
    }


    public void setAbility(Ability__1 ability) {
        this.ability = ability;
    }


    public Boolean getIsHidden() {
        return isHidden;
    }


    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }


    public Integer getSlot() {
        return slot;
    }


    public void setSlot(Integer slot) {
        this.slot = slot;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}//class ability

