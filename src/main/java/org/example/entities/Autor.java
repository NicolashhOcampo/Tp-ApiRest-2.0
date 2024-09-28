package org.example.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Audited
@Table(name = "autor")
public class Autor extends Base {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "biografia")
    private String biografia;

    /*
    @ManyToMany(mappedBy = "autores")
    @JsonBackReference
    @Builder.Default
    private Set<Libro> libros= new HashSet<>();

     */
}
