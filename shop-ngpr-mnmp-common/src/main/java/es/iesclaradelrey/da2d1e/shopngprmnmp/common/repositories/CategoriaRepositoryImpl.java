package es.iesclaradelrey.da2d1e.shopngprmnmp.common.repositories;


import es.iesclaradelrey.da2d1e.shopngprmnmp.common.entities.Categoria;
import org.springframework.stereotype.Repository;

@Repository
public class CategoriaRepositoryImpl
        extends MapRepository<Categoria>
        implements CategoriaRepository {

    @Override
    protected void setEntityId(Categoria entity, Long id) {

    }

    @Override
    protected void setEntidadId(Categoria entity, Long id) {
        entity.setId(id);
    }

    @Override
    protected Long getEntityId(Categoria entity) {
        return entity.getId();
    }

}
