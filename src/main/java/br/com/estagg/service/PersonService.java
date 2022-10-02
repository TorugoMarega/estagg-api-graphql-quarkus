package br.com.estagg.service;

import br.com.estagg.model.Course;
import br.com.estagg.model.Person;
import br.com.estagg.model.University;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PersonService {

    public List<Person> listAll(){
        return Person.listAll();
    }

    @Transactional
    public Person createPerson(Person person){
        person.persist();
        if(person.getCourse() != null){
            person.setCourse(Course.findById(person.getCourse().id));
        }
        return person;
    }
}
