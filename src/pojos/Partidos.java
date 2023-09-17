package pojos;

public class Partidos {

    private int id;
    private Equipo equipo1;
    private Equipo equipo2;
    private String marcador;

    public Partidos(int id, Equipo equipo1, Equipo equipo2, String marcador) {
        this.id = id;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.marcador = marcador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }
}
