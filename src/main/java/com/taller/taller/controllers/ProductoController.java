package com.taller.taller.controllers;


import com.taller.taller.dto.CategoriaDto;
import com.taller.taller.dto.ProductoDto;
import com.taller.taller.model.Categoria;
import com.taller.taller.model.Producto;
import com.taller.taller.service.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {


    private final ProductoService productoService;


    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }


    @PostMapping("/pructor/crear")
    public ResponseEntity<Producto> crearCategoria(@RequestBody ProductoDto producto){
        Producto response = productoService.crearProducto(producto);
        if(response == null){
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok().body(response);
    }
}
