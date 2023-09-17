package model;

import pojos.Equipo;
import pojos.Partidos;

import java.util.ArrayList;

public class PartidosModel {

    ArrayList<Partidos> partidos;

    public PartidosModel(){
        partidos = new ArrayList<>();
        init();
    }

    public void init(){
        partidos.add(new Partidos(1, new Equipo("Real Madrid", null, "escuela 1"),
                new Equipo("Pasto futbol club", null, "escuela 2"), "3-5"));
        partidos.add(new Partidos(2, new Equipo("millonarios", null, "escuela 3"),
                new Equipo("Juventus", null, "escuela 4"), "3-5"));
        partidos.add(new Partidos(3, new Equipo("Atletico Nacional", null, "escuela 5"),
                new Equipo("la vecindad del chavo", null, "escuela 6"), "3-5"));
    }

    public int SearchPartido(int id){
        int index = -1;
        for (int i = 0; i < partidos.size(); i++){
            if(partidos.get(i).getId() == id){
                index = i;
            }
        }
        return index;
    }

    public boolean modificarPartido(int id, String marcador){
        int index = SearchPartido(id);
        if(index == -1){
            return false;
        }else {
            partidos.get(index).setMarcador(marcador);
            return true;
        }
    }

    public String toStringPartidos (){
        String box = "";
        for (Partidos p: partidos) {
            box += p.getEquipo1().getNombre()+ " vs " + p.getEquipo2().getNombre() + " marcador : " + p.getMarcador() + "\n";
        }
        return box;
    }


}
