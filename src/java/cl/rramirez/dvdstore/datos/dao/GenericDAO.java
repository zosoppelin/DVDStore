/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.rramirez.dvdstore.datos.dao;

/**
 *
 * @author ricardo
 */
import java.io.*;
import java.math.BigDecimal;
import java.util.*;
 
public interface GenericDAO<T, ID extends Serializable> {
 
    public void save(T entity);
 
    public void merge(T entity);
 
    public void delete(T entity);
 
    public List<T> findMany(String query);
 
    public T findOne(String query);
 
    public List findAll(Class clazz);
 
    public T findByID(Class clazz, BigDecimal id);
}
