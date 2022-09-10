package com.taller.taller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClienteDto {


    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String documento;
    private List<FacturaDto> facturas;
}
