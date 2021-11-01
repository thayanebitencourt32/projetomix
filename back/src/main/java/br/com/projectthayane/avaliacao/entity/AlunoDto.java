package br.com.projectthayane.avaliacao.entity;

import java.util.List;

public class AlunoDto {
	
	private String matriculaAluno;
	private String nomeAluno;
	private List<DocumentoDto> documentos;
	
	
	public String getMatriculaAluno() {
		return matriculaAluno;
	}
	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public List<DocumentoDto> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<DocumentoDto> documentos) {
		this.documentos = documentos;
	}

	
}
