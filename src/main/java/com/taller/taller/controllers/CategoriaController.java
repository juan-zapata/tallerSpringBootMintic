package com.taller.taller.controllers;


import com.taller.taller.dto.CategoriaDto;
import com.taller.taller.model.Categoria;
import com.taller.taller.service.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriaController {


    private final CategoriaService categoriaService;


    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }


    @PostMapping("/categoria/crear")
    public ResponseEntity<Categoria> crearCategoria(@RequestBody CategoriaDto categoria){
        Categoria response = categoriaService.save(categoria);
        if(response == null){
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok().body(response);
    }


    @GetMapping("/categoria/listar")
    public ResponseEntity<List<Categoria>> listarCategorias(){
        return ResponseEntity.ok().body(this.categoriaService.listarCategorias());
    }

    @PutMapping("/categoria/update")
    public ResponseEntity<Categoria> updateCategorria(@RequestBody CategoriaDto categoria){
        return ResponseEntity.ok().body(this.categoriaService.updateCategoria(categoria));
    }




}
