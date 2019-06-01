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
public class PTemplate implements Serializable {

    @Id
    @Column(name = "template_id")
    Long id;
    String nome;
    String tipo;
    String caminho;

    @OneToMany(mappedBy = "pTemplate")
    Set<ProjetoTemplate> projetoTemplates;

}
