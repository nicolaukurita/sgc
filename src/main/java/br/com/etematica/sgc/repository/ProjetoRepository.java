package br.com.etematica.sgc.repository;

import br.com.etematica.sgc.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
