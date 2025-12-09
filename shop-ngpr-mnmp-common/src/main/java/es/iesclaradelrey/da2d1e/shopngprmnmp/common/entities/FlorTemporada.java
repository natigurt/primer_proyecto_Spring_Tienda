package es.iesclaradelrey.da2d1e.shopngprmnmp.common.entities;

import lombok.*;

@Getter
@Setter
@ToString
@Builder

public class FlorTemporada {
        private Long id;
        private double precio;
        private String descripcion;
        private String nombreFlor;
        private String especieFlor;
        private char tamanio;
}
