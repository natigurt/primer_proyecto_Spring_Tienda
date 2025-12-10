package es.iesclaradelrey.da2d1e.shopngprmnmp.common.repositories;

import es.iesclaradelrey.da2d1e.shopngprmnmp.common.entities.Categoria;

import javax.swing.text.html.Option;
import java.util.*;

public abstract class MapRepository<T> implements Repository<T, Long> {
    protected Map<Long, T> contenedor = new HashMap<>();
    private long idActual = 1;

    protected abstract void setEntityId(T entity, Long id);

    protected abstract void setEntidadId(Categoria entity, Long id);

    protected abstract Long getEntityId(T entity);

    @Override
    public T save(T entity) {
        if (getEntityId(entity) == null) {
            setEntityId(entity, idActual++);
        }
        contenedor.put(getEntityId(entity), entity);
        return entity;
    }

    @Override
    public Optional<T> findById (Long id) {
        return Optional.ofNullable(contenedor.get(id));
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(contenedor.values());
    }

    @Override
    public void delete(Long id) {
        contenedor.remove(id);
    }


}
