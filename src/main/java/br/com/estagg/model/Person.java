package br.com.estagg.model;

import io.quarkus.hibernate.orm.panache.Panache;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.Setter;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.transaction.Transactional;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Person extends PanacheEntity {
    private String name;
    @Column(length = 11)
    private String cpf;
    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDate birthdate;
    private Role role = Role.STUDENT;

}
