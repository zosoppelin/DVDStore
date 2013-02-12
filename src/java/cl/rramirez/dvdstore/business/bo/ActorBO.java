/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.rramirez.dvdstore.business.bo;

import cl.rramirez.dvdstore.datos.hibernate.maps.Actor;
import java.util.LinkedHashMap;

/**
 *
 * @author ricardo
 */
public interface ActorBO {
    public LinkedHashMap<Integer, String> getActorsMap();
    public Actor[] getActores();
}