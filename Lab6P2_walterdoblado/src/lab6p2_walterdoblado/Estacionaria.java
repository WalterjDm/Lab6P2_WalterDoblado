package lab6p2_walterdoblado;

import java.util.ArrayList;

public class Estacionaria extends Consola {

    private int numContr;
    private int almacen;
    private String tipConex;
    
    
    public Estacionaria() {
    }

    public Estacionaria(int numContr, int almacen, String tipConex, String id, String fabricante, int años, double precio, int jueDis, String modelo) {
        super(id, fabricante, años, precio, jueDis, modelo);
        this.numContr = numContr;
        this.almacen = almacen;
        this.tipConex = tipConex;
    }

    public int getNumContr() {
        return numContr;
    }

    public void setNumContr(int numContr) {
        this.numContr = numContr;
    }

    public int getAlmacen() {
        return almacen;
    }

    public void setAlmacen(int almacen) {
        this.almacen = almacen;
    }

    public String getTipConex() {
        return tipConex;
    }

    public void setTipConex(String tipConex) {
        this.tipConex = tipConex;
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
        return "Estacionaria{" + '}';
    }

}
