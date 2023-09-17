package pojos;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<String> jugadores;
    private String escuelaDeFormacion;

    public Equipo(String nombre, ArrayList<String> jugadores, String escuelaDeFormacion) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.escuelaDeFormacion = escuelaDeFormacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    public String getEscuelaDeFormacion() {
        return escuelaDeFormacion;
    }

    public void setEscuelaDeFormacion(String escuelaDeFormacion) {
        this.escuelaDeFormacion = escuelaDeFormacion;
    }
}
