package br.com.projectthayane.avaliacao.usecase.port.out;

import java.util.List;

import br.com.projectthayane.avaliacao.entity.AlunoDto;

public interface DBPort {
	List<AlunoDto> findAlunos();

}
