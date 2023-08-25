
package lab6p2_walterdoblado;


public class Consola {
    
    protected String id;
    protected String fabricante;
    protected int años;
    protected double precio;
    protected int jueDis;
    protected String modelo;

    public Consola() {
    }

    public Consola(String id, String fabricante, int años, double precio, int jueDis, String modelo) {
        this.id = id;
        this.fabricante = fabricante;
        this.años = años;
        this.precio = precio;
        this.jueDis = jueDis;
        this.modelo = modelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getJueDis() {
        return jueDis;
    }

    public void setJueDis(int jueDis) {
        this.jueDis = jueDis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Consola{" + "id=" + id + ", fabricante=" + fabricante + ", a\u00f1os=" + años + ", precio=" + precio + ", jueDis=" + jueDis + ", modelo=" + modelo + '}';
    }
    
    
    
    
    
}
