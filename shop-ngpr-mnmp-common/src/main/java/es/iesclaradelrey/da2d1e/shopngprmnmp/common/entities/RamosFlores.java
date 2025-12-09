package es.iesclaradelrey.da2d1e.shopngprmnmp.common.entities;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class RamosFlores {
    private Long id;
    private double precio;
    private String descripcion;
    private String nombreRamo;
    private String especieFlores;
    private char tamanio;

}
