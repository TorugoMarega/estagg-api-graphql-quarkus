package br.com.estagg.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Corporation extends PanacheEntity {
    private String name;
    private String insc_estadual;
    private String cnpj;
    private String phone;
    private String cep;
    private String street;
    private String district;
    private Integer number;
    @OneToOne
    private Person recruiter;
}
