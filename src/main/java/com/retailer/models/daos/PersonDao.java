package com.retailer.models.daos;

import java.util.UUID;

import lombok.Data;

public class PersonDao {
    private UUID uuid;
    private String name;

    public UUID getUuid(){
        return uuid;
    }

    public void setUuid(UUID uuid){
        this.uuid = uuid;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
