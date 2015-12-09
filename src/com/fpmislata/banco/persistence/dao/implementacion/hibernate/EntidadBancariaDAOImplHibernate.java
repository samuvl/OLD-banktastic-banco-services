package com.fpmislata.banco.persistence.dao.implementacion.hibernate;

import com.fpmislata.banco.business.domain.EntidadBancaria;
import com.fpmislata.banco.core.BusinessException;
import com.fpmislata.banco.persistence.dao.EntidadBancariaDAO;
import java.util.List;
import org.hibernate.Session;

public class EntidadBancariaDAOImplHibernate implements EntidadBancariaDAO {

    @Override
    public List<EntidadBancaria> findByNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EntidadBancaria get(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        EntidadBancaria entidadBancaria = (EntidadBancaria) session.get(EntidadBancaria.class, id);

        session.getTransaction().commit();
        session.close();
        return entidadBancaria;
    }

    @Override
    public EntidadBancaria insert(EntidadBancaria t) throws BusinessException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        EntidadBancaria entidadBancaria = (EntidadBancaria) session.save(t);

        session.getTransaction().commit();
        session.close();
        return entidadBancaria;
    }

    @Override
    public EntidadBancaria update(EntidadBancaria t) throws BusinessException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.update(t);

        session.getTransaction().commit();
        session.close();
        return t;
    }

    @Override
    public boolean delete(int id) {
        boolean devolver;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        EntidadBancaria entidadBancaria = this.get(id);

        if (entidadBancaria != null) {
            devolver = true;
            session.delete(entidadBancaria);
        } else {
            devolver = false;
        }

        session.getTransaction().commit();
        session.close();
        return devolver;
    }

    @Override
    public List<EntidadBancaria> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
