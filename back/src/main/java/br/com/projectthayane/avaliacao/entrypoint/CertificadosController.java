package br.com.projectthayane.avaliacao.entrypoint;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectthayane.avaliacao.entity.AlunoDto;
import br.com.projectthayane.avaliacao.usecase.AlunosService;

@RestController
@RequestMapping(value = "certificados")
public class CertificadosController {
	
	public final AlunosService alunoService;
	
	
		public CertificadosController(AlunosService alunoService) {
		super();
		this.alunoService = alunoService;
	}


	@GetMapping
	@CrossOrigin(value = "http://localhost:4200")
	public ResponseEntity<List<AlunoDto>> buscarAlunos(){
		
		return ResponseEntity.ok(alunoService.findAllAlunos());
		
		
		
	}

}
