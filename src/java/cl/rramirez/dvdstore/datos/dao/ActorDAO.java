/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.rramirez.dvdstore.datos.dao;

import cl.rramirez.dvdstore.datos.dao.GenericDAO;
import cl.rramirez.dvdstore.datos.hibernate.maps.Actor;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author ricardo
 */
public interface ActorDAO extends GenericDAO<Actor, BigDecimal> {
    
    public List<Actor> findByName(String firstName, String lastName);
}
