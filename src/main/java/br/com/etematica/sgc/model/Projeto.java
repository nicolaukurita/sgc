package br.com.etematica.sgc.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Projeto implements Serializable {

    @Id
    @Column(name = "projeto_id")
    Long id;
    String nome;
    String descricao;
    String dominio;
    String caminho;

    @OneToMany(mappedBy = "projeto")
    Set<ProjetoTemplate> projetoTemplates;

    @OneToMany(mappedBy = "projeto")
    Set<ProjetoComponente>projetoComponentes;

}
