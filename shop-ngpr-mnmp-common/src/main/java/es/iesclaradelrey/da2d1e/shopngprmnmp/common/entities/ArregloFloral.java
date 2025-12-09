package es.iesclaradelrey.da2d1e.shopngprmnmp.common.entities;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class ArregloFloral {
    private Long id;
    private double precio;
    private String descripcion;
    private String nombreArreglo;
    private String especieFlores;
    private char tamanio;

}
