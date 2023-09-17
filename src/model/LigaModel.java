package model;

import java.util.ArrayList;

public class LigaModel {
    private String descripcion;
    private ArrayList<String> sedes;
    private ArrayList<String> cargos;

    public LigaModel(){
        descripcion = "\"En su forma más básica, una liga de fútbol es una competición \n" +
                "entre varios equipos que se enfrentan entre sí en partidos a lo largo \n" +
                "de una temporada. Generalmente, cada equipo juega dos veces contra los demás, \n" +
                "una vez en su estadio y otra en el del contrario.\"\n";
        sedes = new ArrayList<>();
        cargos = new ArrayList<>();
        init();
    }

    public void init(){
        sedes.add("Polideportivo");
        sedes.add("Club de Baloncesto Muiscas Sogamoso");
        sedes.add("Sede Deportiva Patriotas Boyacá");
        sedes.add("Liga de Triatlón de Boyacá");

        cargos.add("aguatero izquierdo");
        cargos.add("Administrados de sedes");
        cargos.add("Generente de la sede");
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

    public String toStringSedes() {
        String box = "";
        for (String s: sedes) {
            box += s + "\n";
        }

        return box;
    }

    public String toStringCargos() {
        String box = "";
        for (String s: cargos) {
            box += s + "\n";
        }

        return box;
    }
}
