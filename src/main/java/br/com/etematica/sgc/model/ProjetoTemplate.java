package br.com.etematica.sgc.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "projeto_template")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ProjetoTemplate implements Serializable {

    @Id
    @Column(name = "projeto_template_id")
    Long id;

    @ManyToOne
    @JoinColumn(name = "projeto_id")
    Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "template_id")
    PTemplate pTemplate;

}
