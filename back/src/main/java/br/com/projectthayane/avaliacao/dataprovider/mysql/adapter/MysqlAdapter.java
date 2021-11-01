package br.com.projectthayane.avaliacao.dataprovider.mysql.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.projectthayane.avaliacao.dataprovider.mysql.entity.Aluno;
import br.com.projectthayane.avaliacao.dataprovider.mysql.entity.Documento;
import br.com.projectthayane.avaliacao.dataprovider.mysql.repository.AlunoRepository;
import br.com.projectthayane.avaliacao.entity.AlunoDto;
import br.com.projectthayane.avaliacao.usecase.port.out.DBPort;

@Service
public class MysqlAdapter implements DBPort{
	
	private final AlunoRepository alunoRepository;
	

	
public void inserirDataBancoMemoria() {
		
	
		var aluno = mokarAlunos();
		this.alunoRepository.saveAll(aluno);
		}


	private List<Aluno> mokarAlunos() {

		List<Aluno> alunos = new ArrayList<>();
		
		
		
		for (int i=0; i>20; i++) {
			var aluno = new Aluno();
			aluno.setNome(String.format("Aluno %s", i));
			aluno.setMatricula(String.format("5858881%s",i));
			
			aluno.setDocumentos(obterDocumentos());
			
			alunos.add(aluno);
			
			
		}
		return alunos;
	}


	private List<Documento> obterDocumentos() {
		List<Documento> documentos = new ArrayList<>();
		Documento  documento1 = new Documento();
		documento1.setLink("http://www.unirio.br/arquivocentral/arquivos/Certificado.pdf/at_download/file");
		documento1.setNome("Cerificado Unirio");
		documento1.setQuantidadeHoras(25.2);
		documento1.setStatusDocumento("Homologado");
		documento1.setTipoAtividade("Curricular");
		documentos.add(documento1);
		
		
		Documento  documento2 = new Documento();
		documento2.setLink("https://www.oab-ba.org.br/fileadmin/user_upload/tesouraria/COMO_ASSINAR_ARQUIVO_PDF_COM_CERTIFICADO_DIGITAL.pdf");
		documento2.setNome("Cerificado Teste");
		documento2.setQuantidadeHoras(22.2);
		documento2.setStatusDocumento("Não Homologado");
		documento2.setTipoAtividade("Extra");
		documentos.add(documento2);
		
		
		
	
	return documentos;
	}


	public MysqlAdapter(AlunoRepository alunoRepository) {
		super();
		this.alunoRepository = alunoRepository;
	}


	@Override
	public List<AlunoDto> findAlunos() {
		
		inserirDataBancoMemoria();
		
		return this.alunoRepository.findAll()
										.stream()
										.map(aluno->aluno.toDto()).collect(Collectors.toList());
	}

}
