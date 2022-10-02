package br.com.estagg.resource;

import br.com.estagg.model.Person;
import br.com.estagg.service.PersonService;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class PersonResource {
    @Inject
    PersonService service;
    @Query
    public String test(){
        return "CONEXÃO ESTABELECIDA";
    }

    @Query
    public List<Person> listAllPerson(){
        return service.listAll();
    }


    @Mutation
    @Description("Adiciona novo usuário")

    public Person createPerson(Person person){
        return service.createPerson(person);
    }
}
