package com.retailer.controllers.responsedtos.mappers;

import com.retailer.controllers.responsedtos.PersonResponseBody;
import com.retailer.models.Person;

public class PersonResponseBodyMapper {
    private PersonResponseBodyMapper(){}
    
    public static PersonResponseBody fromPerson(Person person) {
        return new PersonResponseBody(
                person.getUuid().toString(),
                person.getName()
        );
    }
}
