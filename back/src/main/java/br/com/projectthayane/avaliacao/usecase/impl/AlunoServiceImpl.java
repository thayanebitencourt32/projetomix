package br.com.projectthayane.avaliacao.usecase.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projectthayane.avaliacao.entity.AlunoDto;
import br.com.projectthayane.avaliacao.usecase.AlunosService;
import br.com.projectthayane.avaliacao.usecase.port.out.DBPort;

@Service
public class AlunoServiceImpl implements AlunosService {
	
	private final DBPort dbPort;
	
	public AlunoServiceImpl(DBPort dbPort) {
	
		this.dbPort = dbPort;
	}
	


	@Override
	public List<AlunoDto> findAllAlunos() {
		return dbPort.findAlunos();
	}

}
