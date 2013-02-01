/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.rramirez.dvdstore.datos.hibernate.dao;

import cl.rramirez.dvdstore.datos.dao.ActorDAO;
import cl.rramirez.dvdstore.datos.hibernate.maps.Actor;
import cl.rramirez.dvdstore.datos.hibernate.util.HibernateUtil;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author ricardo
 */
public class ActorDAOHibernateImpl extends HibernateGenericDAOImpl<Actor, BigDecimal> implements ActorDAO{
    
    @Override
    public List<Actor> findByName(String firstName, String lastName) {
        List<Actor> actor = null;
        String sql = "SELECT a FROM Actor a WHERE a.firstName like %:firstName% AND a.lastName like %:lastName%";
        Query query = HibernateUtil.getSession().createQuery(sql).setParameter("firstName", firstName).setParameter("lastName", lastName);
        actor = findMany(sql);
        
        return actor;
        
    }
    
}