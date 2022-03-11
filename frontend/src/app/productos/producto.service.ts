import { Injectable } from '@angular/core';
import { Producto } from './producto';
import { of, Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable()
export class ProductoService {
  private urlEndPoint:string = 'http://localhost:8080/api/productos';

  constructor(private http: HttpClient) { }

  getProductos(): Observable<Producto[]>{
    //return this.http.get<Producto[]>(this.urlEndPoint);
    return this.http.get(this.urlEndPoint).pipe(
      map( response => response as Producto[]))
  }
}
