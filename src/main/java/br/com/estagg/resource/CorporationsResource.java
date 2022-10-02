package br.com.estagg.resource;

import br.com.estagg.model.Corporation;
import br.com.estagg.service.CorporationsService;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class CorporationsResource {
    @Inject
    CorporationsService service;

    @Mutation
    public Corporation createCorporation(Corporation corporation){
        return service.createCorporation(corporation) ;
    }

    @Query
    public List<Corporation> listAllCorporations(){
        return service.listAll();
    }

}
