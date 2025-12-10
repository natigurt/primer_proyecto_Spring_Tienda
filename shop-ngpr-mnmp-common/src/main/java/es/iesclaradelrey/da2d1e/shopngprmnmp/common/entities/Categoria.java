package es.iesclaradelrey.da2d1e.shopngprmnmp.common.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Categoria {

    private Long id;
    private String name;
    private String description;
    private String image;

}
