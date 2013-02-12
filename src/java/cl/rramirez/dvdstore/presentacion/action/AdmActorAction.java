/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.rramirez.dvdstore.presentacion.action;

import cl.rramirez.dvdstore.business.bo.ActorBO;
import cl.rramirez.dvdstore.business.bo.impl.ActorBOImpl;
import cl.rramirez.dvdstore.datos.dao.ActorDAO;
import cl.rramirez.dvdstore.datos.hibernate.dao.ActorDAOHibernateImpl;
import cl.rramirez.dvdstore.datos.hibernate.maps.Actor;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author ricardo
 */
public class AdmActorAction extends DispatchAction {

    /* forward name="success" path="" */
    private final static String SUCCESS = "success";

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction1, where "method" is the value
     * specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward init(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        ActorBO actor = new ActorBOImpl();
        
        request.getSession().setAttribute("actores",actor.getActores());
        return mapping.findForward("lista_actores");
    }
}
