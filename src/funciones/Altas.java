package funciones;

import static funciones.IniciarSesion.inicioSesionFactory;
import java.sql.SQLException;
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import pojos.Cita;
import pojos.Cliente;

public class Altas {
    
     public static void datosEjemplo() throws ClassNotFoundException, SQLException {
        Cliente Juan, Antonio, Laura, Pablo;
        
        Juan = new Cliente("11111111A", "Juan", "Hombre", 20, "Vigo");
        guardarCliente(Juan);
        Antonio = new Cliente("22222222T", "Antonio", "Hombre", 20, "Vigo");
        guardarCliente(Antonio);
        Laura = new Cliente("33333333R", "Laura", "Mujer", 25, "Madrid");
        guardarCliente(Laura);
        Pablo = new Cliente("39463457B","Pablo", "Hombre", 25, "Vigo");
        guardarCliente(Pablo);
        
        Cita cita1 = new Cita (Pablo,Laura, new Date(), "Vigo");
        guardarCita(cita1);
    }
     
    public static void guardarCliente(Cliente cliente) throws ClassNotFoundException, SQLException {
        Session sesion;
        String aficiones = "";
        
        for (int i = 0; i < cliente.getArrayAficiones().size(); i++) {
            aficiones += cliente.getArrayAficiones().get(i)+", ";
        }
        cliente.setAficiones(aficiones);
        
        try {
            sesion = inicioSesionFactory();
            sesion.beginTransaction();
            sesion.save(cliente);
            sesion.getTransaction().commit();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }
    
        public static void guardarCita(Cita cita) throws ClassNotFoundException, SQLException {
        Session sesion;
        try {
            sesion = inicioSesionFactory();
            sesion.beginTransaction();
            sesion.save(cita);
            sesion.getTransaction().commit();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }
    
}