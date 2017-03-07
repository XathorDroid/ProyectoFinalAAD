package pojos;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Cliente  implements Serializable {
    
    private String dni;
    private String nombre;
    private String sexo;
    private int edad;
    private String ciudad;
    private String aficiones;
    private ArrayList<String> arrayAficiones;
    private Set<Cita> citas;
   
    public Cliente() {
        this.arrayAficiones  = new ArrayList();
        this.citas = new HashSet<>();
    }

    public Cliente(String dni, String nombre, String sexo, int edad, String ciudad) {
        this.dni = dni;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
        this.arrayAficiones  = new ArrayList();
        this.citas = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<String> getArrayAficiones() {
        return arrayAficiones;
    }

    public void setArrayAficiones(ArrayList<String> arrayAficiones) {
        this.arrayAficiones = arrayAficiones;
    }

    public Set<Cita> getCitas() {
        return citas;
    }

    public void setCitas(Set<Cita> citas) {
        this.citas = citas;
    }

    public String getAficiones() {
        return aficiones;
    }

    public void setAficiones(String aficiones) {
        this.aficiones = aficiones;
    }
    
}