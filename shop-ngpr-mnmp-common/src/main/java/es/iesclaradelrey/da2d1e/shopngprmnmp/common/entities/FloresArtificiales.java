package es.iesclaradelrey.da2d1e.shopngprmnmp.common.entities;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class FloresArtificiales {
    private Long id;
    private double precio;
    private String descripcion;
    private String nombreFlor;
    private String materialesFlor;
    private char tamanio;
}
