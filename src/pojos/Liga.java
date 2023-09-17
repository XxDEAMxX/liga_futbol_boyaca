package pojos;

import java.util.ArrayList;

public class Liga {

    private String descripcion;
    private ArrayList<String> sedes;
    private ArrayList<String> cargos;

    public Liga(String descripcion, ArrayList<String> sedes, ArrayList<String> cargos) {
        this.descripcion = descripcion;
        this.sedes = sedes;
        this.cargos = cargos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<String> getSedes() {
        return sedes;
    }

    public void setSedes(ArrayList<String> sedes) {
        this.sedes = sedes;
    }

    public ArrayList<String> getCargos() {
        return cargos;
    }

    public void setCargos(ArrayList<String> cargos) {
        this.cargos = cargos;
    }
}
