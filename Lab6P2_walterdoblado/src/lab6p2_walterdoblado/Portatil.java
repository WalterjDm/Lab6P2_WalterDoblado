
package lab6p2_walterdoblado;

import java.util.ArrayList;


public class Portatil extends Consola{

    private String tam;
    private int bateria;
    private boolean estuche;
    
    
    
    public Portatil() {
    }

    public Portatil(String tam, int bateria, boolean estuche, String id, String fabricante, int años, double precio, int jueDis, String modelo) {
        super(id, fabricante, años, precio, jueDis, modelo);
        this.tam = tam;
        this.bateria = bateria;
        this.estuche = estuche;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }

  

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
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
        return "Portatil{" + '}';
    }
    
    
    
    
}
