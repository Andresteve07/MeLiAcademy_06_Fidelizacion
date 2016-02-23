package com.mercadolibre.academy.fidelizacion.modelo.generic;

import java.io.Serializable;
import java.util.List;

public interface GenericHibernateDao<T extends Serializable, E>  {
    public E save(T instance) throws Exception;
    public void saveOrUpdate(T instance) throws Exception;
    public void update(T instance) throws Exception;
    public void delete(T instance) throws Exception;
    public T findById(E id) throws Exception;
    public List<T> findAll() throws Exception;
}
