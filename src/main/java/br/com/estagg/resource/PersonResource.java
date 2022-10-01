package br.com.estagg.resource;

import br.com.estagg.model.Person;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

import javax.transaction.Transactional;
import java.util.List;

@GraphQLApi
public class PersonResource {

    @Query
    public String test(){
        return "CONEXÃO ESTABELECIDA";
    }

    @Query
    public List<Person> listAllPerson(){
        return Person.listAll();
    }


    @Mutation
    @Description("Adiciona novo usuário")
    @Transactional
    public Person addPerson(Person person){
        person.persist();
        return person;
    }
}
