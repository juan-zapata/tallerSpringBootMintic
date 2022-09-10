package com.taller.taller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductoDto {


    private Integer id;
    private String nombre;
    private Double precio;
    private Integer stock;
    private CategoriaDto categoria;
}
