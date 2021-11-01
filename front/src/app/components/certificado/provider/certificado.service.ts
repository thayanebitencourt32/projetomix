import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Aluno } from 'src/app/models/alunos';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CertificadoService {

  constructor(private _httpService: HttpClient) { }



obterCertificados():Observable<Aluno[]>{

 return this._httpService.get<Aluno[]>('http://localhost:8080/certificados')
  
}

}
