package com.fpmislata.banco.persistence.dao.implementacion.hibernate;

import com.fpmislata.banco.business.domain.EntidadBancaria;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lliurex
 */
public class EntidadBancariaDAOImplHibernateTest {
    
    public EntidadBancariaDAOImplHibernateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        HibernateUtil.buildSessionFactory();
    }
    
    @AfterClass
    public static void tearDownClass() {
        HibernateUtil.closeSessionFactory();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findByNombre method, of class EntidadBancariaDAOImplHibernate.
     */
//    @Test
//    public void testFindByNombre() {
//        System.out.println("findByNombre");
//        String nombre = "";
//        EntidadBancariaDAOImplHibernate instance = new EntidadBancariaDAOImplHibernate();
//        List<EntidadBancaria> expResult = null;
//        List<EntidadBancaria> result = instance.findByNombre(nombre);
//        assertEquals(expResult, result);
//    }

    /**
     * Test of get method, of class EntidadBancariaDAOImplHibernate.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        EntidadBancariaDAOImplHibernate instance = new EntidadBancariaDAOImplHibernate();
        EntidadBancaria expResult = null;
        EntidadBancaria result = instance.get(27);
        assertEquals("eqs", result.getNombre());
    }

    /**
     * Test of insert method, of class EntidadBancariaDAOImplHibernate.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        EntidadBancaria t = new EntidadBancaria("nueva", "1277u36654");
        EntidadBancariaDAOImplHibernate instance = new EntidadBancariaDAOImplHibernate();
        
        EntidadBancaria result = instance.insert(t);
        assertNotEquals(0, result.getIdEntidadBancaria());
        String nombreExp=t.getNombre();
        
        EntidadBancaria resultGet=instance.get(result.getIdEntidadBancaria());
        String nombreResult=resultGet.getNombre();
        
        assertEquals(nombreExp, nombreResult);
    }

    /**
     * Test of update method, of class EntidadBancariaDAOImplHibernate.
     */
//    @Test
//    public void testUpdate() throws Exception {
//        System.out.println("update");
//        EntidadBancaria t = null;
//        EntidadBancariaDAOImplHibernate instance = new EntidadBancariaDAOImplHibernate();
//        EntidadBancaria expResult = null;
//        EntidadBancaria result = instance.update(t);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of delete method, of class EntidadBancariaDAOImplHibernate.
//     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        int id = 0;
//        EntidadBancariaDAOImplHibernate instance = new EntidadBancariaDAOImplHibernate();
//        boolean expResult = false;
//        boolean result = instance.delete(id);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of findAll method, of class EntidadBancariaDAOImplHibernate.
//     */
//    @Test
//    public void testFindAll() {
//        System.out.println("findAll");
//        EntidadBancariaDAOImplHibernate instance = new EntidadBancariaDAOImplHibernate();
//        List<EntidadBancaria> expResult = null;
//        List<EntidadBancaria> result = instance.findAll();
//        assertEquals(expResult, result);
//    }
    
}
