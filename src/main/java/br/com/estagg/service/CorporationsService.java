package br.com.estagg.service;

import br.com.estagg.model.Corporation;
import br.com.estagg.model.Person;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CorporationsService {

    public List<Corporation> listAll(){
        return Corporation.listAll();
    }

    @Transactional
    public Corporation createCorporation(Corporation corporation){
        corporation.persist();
        corporation.setRecruiter( Person.findById(corporation.getRecruiter().id));
        return corporation;
    }
}
