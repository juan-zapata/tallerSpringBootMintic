package com.taller.taller.service;


import com.taller.taller.dto.ProductoDto;
import com.taller.taller.model.Categoria;
import com.taller.taller.model.Producto;
import com.taller.taller.repositories.ProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {


    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto crearProducto(ProductoDto nuevoPruducto){
        Categoria categoria = new Categoria();
        categoria.setId(nuevoPruducto.getCategoria().getId());
        categoria.setNombre(nuevoPruducto.getCategoria().getNombre());
        Producto producto = new Producto();
        producto.setNombre(nuevoPruducto.getNombre());
        producto.setStock(nuevoPruducto.getStock());
        producto.setPrecio(nuevoPruducto.getPrecio());
        producto.setCategoria(categoria);
        return this.productoRepository.save(producto);

    }
}
