package com.retailer.models.mappers;

import com.retailer.models.Person;
import com.retailer.models.daos.PersonDao;

public class PersonMapper {
    private PersonMapper(){}

    public static Person toPerson(PersonDao eventDao) {
        return new Person(
                eventDao.getUuid(),
                eventDao.getName()
        );
    }
    
}
