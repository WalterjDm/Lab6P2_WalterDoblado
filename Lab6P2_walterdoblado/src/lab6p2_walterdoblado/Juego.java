
package lab6p2_walterdoblado;

import java.util.Date;


public class Juego {
   
    private String nombre;
    private String des;
    private Date fecha;
    private int preciojue;
    private boolean estado;
    private boolean rentable;
    private boolean agregado;
    private int cantDis;

    public Juego() {
    }

    public Juego(String nombre, String des, Date fecha, int preciojue, boolean estado, boolean rentable, boolean agregado, int cantDis) {
        this.nombre = nombre;
        this.des = des;
        this.fecha = fecha;
        this.preciojue = preciojue;
        this.estado = estado;
        this.rentable = rentable;
        this.agregado = agregado;
        this.cantDis = cantDis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPreciojue() {
        return preciojue;
    }

    public void setPreciojue(int preciojue) {
        this.preciojue = preciojue;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public int getCantDis() {
        return cantDis;
    }

    public void setCantDis(int cantDis) {
        this.cantDis = cantDis;
    }

    @Override
    public String toString() {
        return "Juego{" + "nombre=" + nombre + ", des=" + des + ", fecha=" + fecha + ", preciojue=" + preciojue + ", estado=" + estado + ", rentable=" + rentable + ", agregado=" + agregado + ", cantDis=" + cantDis + '}';
    }
    
    
    
    
    
}