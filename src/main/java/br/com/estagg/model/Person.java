package br.com.estagg.model;

import io.quarkus.hibernate.orm.panache.Panache;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.graphql.api.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person extends PanacheEntity {
    private String name;
    @Column(length = 11)
    private String cpf;
    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDate birthdate;
    private Role role = Role.STUDENT;
    @JsonbDateFormat("dd/MM/yyyy-hh:mm:ss")
    private LocalDateTime creation_date = LocalDateTime.now();
    @ManyToOne
    @JoinColumn(name = "course_id")
    @Nullable
    private Course course;
}
