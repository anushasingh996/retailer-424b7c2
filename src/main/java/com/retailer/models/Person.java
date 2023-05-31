package com.retailer.models;

import java.util.UUID;

import lombok.Getter;


public class Person {
    
    private UUID uuid;
    private String name;

    public Person(UUID uuid,
                  String name){
        
        this.uuid = uuid;
        this.name = name;
        
    }

    public UUID getUuid(){
        return uuid;
    }

    public String getName(){
        return name;
    }

}
