/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.rramirez.dvdstore.business.bo.impl;

import cl.rramirez.dvdstore.business.bo.ActorBO;
import cl.rramirez.dvdstore.datos.dao.ActorDAO;
import cl.rramirez.dvdstore.datos.dao.factory.DAOFactory;
import cl.rramirez.dvdstore.datos.hibernate.maps.Actor;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author ricardo
 */
public class ActorBOImpl implements ActorBO{

    @Override
    public LinkedHashMap<Integer, String> getActorsMap() {
        
        // llamo al factory de daos y le pido un hibernate dao, lo idea aqui es obtener el factory de un archivo de configuracion, 
        // de esta manera queda transparente para el cliente BO y puedo conmutar de implementaciones solo editando el archivo config
        DAOFactory myDao = DAOFactory.getDAOFactory(DAOFactory.HIBERNATE);
        
        // obtengo un actor dao que me entrega hibernateDao
        ActorDAO actorDao = myDao.getActorDAO();
        
        // obtengo el listado de actores de la base de datos
        List<Actor> actoresList = actorDao.findAll(Actor.class);
        
        Actor[] actores = (Actor[])actoresList.toArray(new Actor[actoresList.size()]);
        
        LinkedHashMap mapaActores = new LinkedHashMap();
    	for ( int j = 0; j < actores.length; j++ ){
            mapaActores.put( actores[j].getActorId(), actores[j].getFirstName()+" "+actores[j].getLastName());
        }

        return mapaActores;
    }

}
