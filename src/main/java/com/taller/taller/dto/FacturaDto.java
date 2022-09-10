package com.taller.taller.dto;

import com.taller.taller.model.Cliente;
import com.taller.taller.model.ModoPago;
import com.taller.taller.model.Producto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FacturaDto {


    private Integer id;
    private LocalDateTime fecha;
    private ClienteDto cliente;
    private ProductoDto producto;
    private ModoPagoDto modoPago;
}
