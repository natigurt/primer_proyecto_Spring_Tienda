package es.iesclaradelrey.da2d1e.shopngprmnmp.common.repositories;

import java.util.List;
import java.util.Optional;

/*Repositorio generico*/
public interface Repository <T,ID>{
    T save (T entity);
    Optional<T> findById(ID id);
    List<T> findAll();
    void delete(ID id);
}
