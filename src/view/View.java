package view;

public class View {

    public View() {
    }

    public void MenuNoticias(){
        System.out.println("0 - salir");
        System.out.println("1 - añadir nueva noticia");
        System.out.println("2 - modificar noticia");
        System.out.println("3 - eliminar noticia");
        System.out.println("4 - ver noticias");
    }

    public void Imagenes(){
        System.out.println("imagen 1");
        System.out.println("imagen 2");
        System.out.println("imagen 3");
        System.out.println("imagen 4");
        System.out.println("imagen 5");
    }

    public void equipos(){
        System.out.println("Real madrid - escuela 1 - aliniacion 2-4-4");
        System.out.println("Pasto futbol club - escuela 2 - aliniacion 2-4-4");
        System.out.println("millonarios - escuela 3 - aliniacion 2-4-4");
        System.out.println("Juventus - escuela 4 - aliniacion 2-4-4");
        System.out.println("Atletico Nacional - escuela 5 - aliniacion 2-4-4");
    }

    public void Login(){
        System.out.println("0 - salir");
        System.out.println("1 - crear cuenta");
        System.out.println("2 - iniciar sesion\n");
    }

    public void MenuGeneral(){
        System.out.println("0 - salir");
        System.out.println("1 - ver sedes");
        System.out.println("2 - ver cargos");
        System.out.println("3 - menu noticias");
        System.out.println("5 - ver equipos");
        System.out.println("6 - ver fotos representativas ");
    }

    public void showMessage(String message){
        System.out.println(message);
    }

}
