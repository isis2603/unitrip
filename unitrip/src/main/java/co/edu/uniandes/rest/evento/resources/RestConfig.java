/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.rest.evento.resources;

/**
 *
 * @author l.castro12
 */
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

/**
 * Clase que indica que este proyecto web ofrece servicios REST.
 * Adicionalmente, esta clase define el prefijo por defecto de las rutas a los recursos.
 *
 * (non-Javadoc)
 * @see javax.ws.rs.core.Application
 */
@ApplicationPath("/api")
public class RestConfig extends Application { }