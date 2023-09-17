package presenter;

import model.NoticiasModel;
import model.UsuarioModel;
import pojos.Noticia;
import pojos.Usuario;
import view.View;

import java.util.Scanner;

public class Presenter {
    private NoticiasModel noticiasModel;
    private View view;
    private Scanner input;
    private UsuarioModel usuarioModel;

    Presenter(){
        init();
    }

    public void init(){
        noticiasModel = new NoticiasModel();
        usuarioModel = new UsuarioModel();
        view = new View();
        input = new Scanner(System.in);
        QuemarUsuarios();
        view.showMessage(usuarioModel.ShowUsuarios());
        for (int i = 0; i < 10; i++) {
            QuemarNoticias(i);
        }
        InicioSesion();
        MenuNoticias();
    }

    public void InicioSesion(){
        int i = 1;
        do{
            view.showMessage("Ingrese email");
            String email = input.nextLine();
            view.showMessage("Ingrese contraseña");
            String password = input.nextLine();
            Usuario ini = new Usuario(email, password);
            i = usuarioModel.InicioSesion(ini);
            if(i == -1){
                view.showMessage("Usuario o contraseña incorrecta");
            }
        }while ( i == -1);
    }

    public void MenuNoticias(){
        int i = 1;
        do {
            view.Menu();
            int index = input.nextInt();
            input.nextLine();
            switch (index) {
                case 1:
                    AddNoticia();
                    break;
                case 2:
                    ModificarNoticia();
                    break;
                case 3:
                    RemoveNoticia();
                    break;
                case 4:
                    view.showMessage(noticiasModel.showNoticias());
                    break;
            }
            i = index;
        }while (i != 0);
    }

    public void AddNoticia(){
        int id = noticiasModel.getNoticias().size();
        view.showMessage("Ingresa el Titulo de la noticia");
        String titulo = input.nextLine();
        view.showMessage("Ingresa la descripcion de la noticia");
        String descripcion = input.nextLine();
        noticiasModel.AddNoticia(new Noticia(id,titulo,descripcion));
    }

    public void RemoveNoticia(){
        view.showMessage("ingresa el id de la noticia que deseas eliminar");
        int id = input.nextInt();
        noticiasModel.RemoveNoticia(id);
    }

    public void ModificarNoticia(){
        view.showMessage("Ingresa el id de la noticias que deseas modificar");
        int id = input.nextInt();
        input.nextLine();
        view.showMessage("ingresa el nuevo titulo");
        String newTitulo = input.nextLine();
        view.showMessage("ingresa la nueva descripcion");
        String newDescripcion = input.nextLine();
        noticiasModel.ModicarNoticia(new Noticia(id, newTitulo, newDescripcion));
    }

    public void QuemarNoticias(int i){
        int id = i;
        String titulo = "titulo";
        String descripcion = "descripcion";
        noticiasModel.AddNoticia(new Noticia(id,titulo,descripcion));
    }

    public void QuemarUsuarios(){
        String email = "deam10";
        String password = "1234";
        usuarioModel.AddUsuario(new Usuario(email, password));
    }


    public static void main(String[] args) {
        new Presenter();
    }
}
