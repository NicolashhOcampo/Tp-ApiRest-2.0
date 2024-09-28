package org.example.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;


import java.io.Serializable;

@Entity

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Table(name= "domicilio")
public class Domicilio extends Base {


    @Column (name = "nombre_calle")
    private String calle;

    @Column (name = "numero")
    private int numero;

    /*
    @JsonBackReference
    @OneToOne(mappedBy = "domicilio")
    private Persona persona;
     */

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    //@JsonManagedReference
    private Localidad localidad;

}
