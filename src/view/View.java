package view;

public class View {

    public View() {
    }

    public void Menu(){
        System.out.println("0 - salir");
        System.out.println("1 - añadir nueva noticia");
        System.out.println("2 - modificar noticia");
        System.out.println("3 - eliminar noticia");
        System.out.println("4 - ver noticias");
    }

    public void Login(){
        System.out.println("0 - salir");
        System.out.println("1 - crear cuenta");
        System.out.println("2 - iniciar sesion");
    }

    public void showMessage(String message){
        System.out.println(message);
    }

}
