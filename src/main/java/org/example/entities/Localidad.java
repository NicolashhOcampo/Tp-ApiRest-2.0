package org.example.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Table(name= "localidad")
public class Localidad extends Base {

    @Column(name = "denominacion")
    private String denominacion;

    //@OneToMany(mappedBy = "localidad")
    //@JsonBackReference
    /*
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();
     */
}
