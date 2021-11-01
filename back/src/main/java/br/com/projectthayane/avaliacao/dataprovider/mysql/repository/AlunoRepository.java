package br.com.projectthayane.avaliacao.dataprovider.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projectthayane.avaliacao.dataprovider.mysql.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
