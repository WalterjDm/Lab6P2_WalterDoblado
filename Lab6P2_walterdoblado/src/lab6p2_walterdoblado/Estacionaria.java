
package lab6p2_walterdoblado;


public class Estacionaria  extends Consola{

    public Estacionaria() {
    }

    public Estacionaria(String id, String fabricante, int años, double precio, int jueDis, String modelo) {
        super(id, fabricante, años, precio, jueDis, modelo);
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
        return "Estacionaria{" + '}';
    }
    
    
    
    
    
    
}
