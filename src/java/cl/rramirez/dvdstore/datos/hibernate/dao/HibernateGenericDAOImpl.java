/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.rramirez.dvdstore.datos.hibernate.dao;
 
import cl.rramirez.dvdstore.datos.dao.GenericDAO;
import cl.rramirez.dvdstore.datos.hibernate.util.HibernateUtil;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ricardo
 */
public abstract class HibernateGenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {
  
    protected Session getSession() {
        return HibernateUtil.getSession();
    }

    @Override
    public void save(T entity) {
        Session hibernateSession = this.getSession();
        hibernateSession.saveOrUpdate(entity);
    }
 
    @Override
    public void merge(T entity) {
        Session hibernateSession = this.getSession();
        hibernateSession.merge(entity);
    }
 
    @Override
    public void delete(T entity) {
        Session hibernateSession = this.getSession();
        hibernateSession.delete(entity);
    }
 
    @Override
    public List<T> findMany(String hql) {
        Query query = this.getSession().createQuery(hql);
        List<T> t;
        t = (List<T>) query.list();
        return t;
    }
 
    @Override
    public T findOne(String hql) {
        Query query = this.getSession().createQuery(hql);
        T t;
        t = (T) query.uniqueResult();
        return t;
    }
 
    @Override
    public T findByID(Class clazz, BigDecimal id) {
        Session hibernateSession = this.getSession();
        T t = null;
        t = (T) hibernateSession.get(clazz, id);
        return t;
    }
 
    @Override
    public List findAll(Class clazz) {
        Session hibernateSession = this.getSession();
        List T = null;
        Query query = hibernateSession.createQuery("from " + clazz.getName());
        T = query.list();
        return T;
    }
}