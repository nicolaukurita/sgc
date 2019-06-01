package br.com.etematica.sgc.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "projeto_componente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ProjetoComponente implements Serializable {

    @Id
    @Column(name = "projeto_componente_id")
    Long id;

    @ManyToOne
    @JoinColumn(name = "projeto_id")
    Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "componente_id")
    Componente componente;

}
