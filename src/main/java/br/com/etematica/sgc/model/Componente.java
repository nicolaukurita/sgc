package br.com.etematica.sgc.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Componente implements Serializable {

    @Id
    @Column(name = "componente_id")
    Long id;
    String nome;
    String tipo;
    Double quantidade;

    @OneToMany(mappedBy = "componente")
    Set<ProjetoComponente> projetoComponentes;
}
