package br.com.projectthayane.avaliacao.usecase;

import java.util.List;

import br.com.projectthayane.avaliacao.entity.AlunoDto;

public interface AlunosService {
	
	List<AlunoDto> findAllAlunos();

}
