package com.retailer.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.retailer.models.Person;
import com.retailer.repositories.PersonRepository;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository eventRepository) {
        this.personRepository = eventRepository;
    }
    
    public Person createPerson(String name) {
        UUID generatedUuid = UUID.randomUUID();
        return personRepository
                .createPerson(generatedUuid, name);
    }

    public void deletePerson(UUID personId) {
        personRepository.deletePerson(personId);
     }

    public List<Person> getAllPersons() {
        return personRepository.getAllPersons();
    }

}
