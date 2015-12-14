package com.fpmislata.banco.persistence.dao.implementacion.hibernate;

import com.fpmislata.banco.core.BusinessException;
import com.fpmislata.banco.persistence.dao.GenericDAO;
import java.util.List;

public class GenericDAOImplHibernate<T> implements GenericDAO<T>{

    @Override
    public T get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T insert(T t) throws BusinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T update(T t) throws BusinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
