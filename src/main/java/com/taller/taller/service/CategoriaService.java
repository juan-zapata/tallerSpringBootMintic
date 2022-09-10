package com.taller.taller.service;


import com.taller.taller.dto.CategoriaDto;
import com.taller.taller.model.Categoria;
import com.taller.taller.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {


    private final CategoriaRepository categoriaRepository;


    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }


    public Categoria save(CategoriaDto categoria){
        try{
            Categoria nuevaCategoria = new Categoria();
            if(categoria.getNombre().isEmpty()){
                return null;
            }
            nuevaCategoria.setNombre(categoria.getNombre());
            nuevaCategoria.setFechaCreacion(LocalDateTime.now());
            nuevaCategoria.setDescripcion(categoria.getDescripcion());
            this.categoriaRepository.save(nuevaCategoria);
            return nuevaCategoria;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public List<Categoria> listarCategorias(){
        return this.categoriaRepository.findAll();
    }

    public Categoria updateCategoria(CategoriaDto categoria){
        Optional<Categoria> categoriaUpdate = this.categoriaRepository.findById(categoria.getId());
        if(categoriaUpdate.isPresent()){
            categoriaUpdate.get().setNombre(categoria.getNombre());
            categoriaUpdate.get().setFechaActualizacion(LocalDateTime.now());
            categoriaUpdate.get().setDescripcion(categoria.getDescripcion());
            this.categoriaRepository.save(categoriaUpdate.get());
            return categoriaUpdate.get();
        }
        return new Categoria();

    }


}
