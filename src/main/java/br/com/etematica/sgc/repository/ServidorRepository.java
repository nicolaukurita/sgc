package br.com.etematica.sgc.repository;

import br.com.etematica.sgc.model.Servidor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServidorRepository extends JpaRepository<Servidor, Long> {
}
