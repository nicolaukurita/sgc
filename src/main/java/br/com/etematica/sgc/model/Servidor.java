package br.com.etematica.sgc.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Servidor implements Serializable {

    @Id
    @Column(name = "servidor_id")
    Long id;
    String nome;
    String hostname;
    Integer porta;
    String usuario;
    String senha;
    String dialeto;

}
