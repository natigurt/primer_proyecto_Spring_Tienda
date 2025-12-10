package es.iesclaradelrey.da2d1e.shopngprmnmp.web.CommandLineRunners;

import es.iesclaradelrey.da2d1e.shopngprmnmp.common.entities.Categoria;
import es.iesclaradelrey.da2d1e.shopngprmnmp.common.services.CategoriaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CategoriaRepositoryInitializer implements CommandLineRunner {


    private final CategoriaService categoriaService;

    public CategoriaRepositoryInitializer(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }


    @Override
    public void run(String... args) throws Exception {
        Categoria c1 = new Categoria(null, "Flores Naturales", "Flores frescas de temporada", "flores-naturales.jpg");
        Categoria c2 = new Categoria(null, "Flores Temporada", "Flores de temporada", "flores-temporada.jpg");

        categoriaService.save(c1);
        categoriaService.save(c2);
    }


}
