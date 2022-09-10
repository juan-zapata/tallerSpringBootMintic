package com.taller.taller.model;


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
@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime fecha;
    @ManyToOne
    @JoinColumn(name = "cliente_facturas")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "producto_facturas")
    private Producto producto;
    @ManyToOne
    @JoinColumn(name = "pago_facturas")
    private ModoPago modoPago;


}
