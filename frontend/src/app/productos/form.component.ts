import { Component, OnInit } from '@angular/core';
import { Producto } from './producto';
import {ProductoService} from './producto.service';
import {Router} from '@angular/router';
@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  public producto: Producto = new Producto()
  public titulo: string = "Crear producto"


  constructor(private productoService:ProductoService,
  private router:Router) { }

  ngOnInit(): void {
  }

  public create():void{
    this.productoService.create(this.producto).subscribe(
      response => this.router.navigate(['/productos'])
    )
  }

}
