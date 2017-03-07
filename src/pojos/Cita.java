package pojos;

import java.io.*;
import java.util.Date;

public class Cita  implements Serializable {

    private Cliente individuo1;
    private Cliente individuo2;
    private Date fecha;
    private String lugar;
    private String matrimonio;

    public Cita() {}

    public Cita(Cliente individuo1, Cliente individuo2, Date fecha, String lugar) {
       this.individuo1 = individuo1;
       this.individuo2 = individuo2;
       this.fecha = fecha;
       this.lugar = lugar;
       this.matrimonio = "no";
    }

    public Cliente getIndividuo1() {
        return individuo1;
    }

    public void setIndividuo1(Cliente individuo1) {
        this.individuo1 = individuo1;
    }

    public Cliente getIndividuo2() {
        return individuo2;
    }

    public void setIndividuo2(Cliente individuo2) {
        this.individuo2 = individuo2;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMatrimonio() {
        return matrimonio;
    }

    public void setMatrimonio(String matrimonio) {
        this.matrimonio = matrimonio;
    }
    
}