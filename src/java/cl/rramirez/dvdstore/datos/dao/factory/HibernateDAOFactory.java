/*
 * Clase factory del DAO
 * and open the template in the editor.
 */
package cl.rramirez.dvdstore.datos.dao.factory;

import cl.rramirez.dvdstore.datos.dao.ActorDAO;
import cl.rramirez.dvdstore.datos.hibernate.dao.ActorDAOHibernateImpl;

/**
 *
 * @author ricardo
 */
public class HibernateDAOFactory extends DAOFactory {

    @Override
    public ActorDAO getActorDAO() {
        return new ActorDAOHibernateImpl();
    }
}
