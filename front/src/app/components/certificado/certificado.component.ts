import { Component, OnInit } from '@angular/core';
import { Aluno } from 'src/app/models/alunos';
import { CertificadoService } from './provider/certificado.service';


@Component({
  selector: 'app-certificado',
  templateUrl: './certificado.component.html',
  styleUrls: ['./certificado.component.scss']
})
export class CertificadoComponent implements OnInit {

  constructor(private _certificadoService:CertificadoService,
    ) { }

    public certificados:Aluno[] = []


abrirLink(s:string){
alert(s)
}

  ngOnInit(): void {

    this._certificadoService.obterCertificados().subscribe(p=>{


     this.certificados = p

    })


  }

}
