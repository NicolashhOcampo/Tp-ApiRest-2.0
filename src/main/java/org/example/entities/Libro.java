package org.example.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "libro")
public class Libro extends Base {

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private int fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private int paginas;

    /*
    @ManyToOne
    //@JsonBackReference
    @JoinColumn(name = "fk_persona")
    private Persona persona;

     */


    /*
    @JoinTable(
            name="libro_autor",
            joinColumns = @JoinColumn(name = "fk_libro"),
            inverseJoinColumns = @JoinColumn(name = "fk_autor")
    )

     */
    //@JsonManagedReference
    @ManyToMany(cascade = CascadeType.REFRESH)
    @Builder.Default
    private Set<Autor> autores= new HashSet<Autor>();

}
