
package com.mycompany.atletismo;


public class Atleta {
    private int numAtleta;
    private String nombreAtleta;
    private float tiempoCarrera;
    
    

    public Atleta(int numAtleta, String nombreAtleta, float tiempoCarrera) {
        this.numAtleta = numAtleta;
        this.nombreAtleta = nombreAtleta;//nuevo
        this.tiempoCarrera = tiempoCarrera;//comentario nuevo
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setNumAtleta(int numAtleta) {
        this.numAtleta = numAtleta;
    }

    public void setNombreAtleta(String nombreAtleta) {
        this.nombreAtleta = nombreAtleta;
    }

    public void setTiempoCarrera(float tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }
    
    
    
}
