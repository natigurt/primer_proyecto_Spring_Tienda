package es.iesclaradelrey.da2d1e.shopngprmnmp.common.services;

import es.iesclaradelrey.da2d1e.shopngprmnmp.common.entities.Categoria;

import java.util.List;
import java.util.Optional;


public interface CategoriaService {

    Categoria save(Categoria categoria);

    Optional<Categoria> findById(Long id);

    List<Categoria> findAll();

    void delete(Long id);
}

