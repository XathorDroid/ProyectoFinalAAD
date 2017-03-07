
package funciones;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import proyectocinco.NewHibernateUtil;



public class IniciarSesion {
    
    
      public static Session inicioSesionFactory() throws ClassNotFoundException, SQLException {
        SessionFactory sesionFactory = NewHibernateUtil.getSessionFactory();
        Session sesion = sesionFactory.openSession();
        if(sesion!=null){
            System.out.println("Sesión creada con éxito");
        }else{
            System.out.println("Fallo en el inicio de sesión");
        }
        return sesion;
    }
    
}
