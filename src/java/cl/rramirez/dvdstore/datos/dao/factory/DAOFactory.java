/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.rramirez.dvdstore.datos.dao.factory;

import cl.rramirez.dvdstore.datos.dao.ActorDAO;

/**
 *
 * @author ricardo
 */
public abstract class DAOFactory {
 
  // Lista de los tipos de daos soportados por la fabrica
  public static final int HIBERNATE = 1;
 
  public abstract ActorDAO getActorDAO();
   
  public static DAOFactory getDAOFactory(
      int whichFactory) {
 
    switch (whichFactory) {
      // como estoy usando un orm me da lo mismo la bd que sea asi que me centro en el orm que a futuro podria cambiar
      case HIBERNATE: 
          return new HibernateDAOFactory();
      default           : 
          return null;
    }
  }
}