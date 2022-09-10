package com.taller.taller.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "modo_pago")
public class ModoPago {

    @Id
    @Column(name = "nombre", length = 30)
    private String nombre;
    private String descripcion;
}
