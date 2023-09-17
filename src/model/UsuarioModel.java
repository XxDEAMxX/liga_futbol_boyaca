package model;

import pojos.Usuario;

import java.util.ArrayList;

public class UsuarioModel {
    private ArrayList<Usuario> usuarios;

    public UsuarioModel() {
        this.usuarios = new ArrayList<>();
    }

    public int SearchUsuario(String email){
        int index = -1;
        for (int i = 0; i<usuarios.size(); i++){
            if(email == usuarios.get(i).getEmail()){
                index = i;
            }
        }
        return index;
    }

    public boolean AddUsuario(Usuario usuario){
        int index = SearchUsuario(usuario.getEmail());
        if(index == -1) {
            usuarios.add(usuario);
            return true;
        }else {
            return false;
        }
    }

    public boolean RemoveUsuario(String email){
        int index = SearchUsuario(email);
        if(index == -1) {
            return false;
        }else {
            usuarios.remove(index);
            return true;
        }
    }

    public boolean ModificarUsuario(Usuario usuario){
        int index = SearchUsuario(usuario.getEmail());
        if(index == -1){
            return false;
        }else {
            usuarios.get(index).setEmail(usuario.getEmail());
            usuarios.get(index).setPassword(usuario.getPassword());
            return true;
        }
    }

    public int InicioSesion(Usuario usuario){
        int index = -1;
        for (int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).getEmail().equalsIgnoreCase(usuario.getEmail())
                    && usuarios.get(i).getPassword().equalsIgnoreCase(usuario.getPassword())){
                index = i;
            }
        }
        return index;
    }

    public String ShowUsuarios(){
        String box = "";
        for (Usuario user: usuarios) {
            box += user.toString();
        }
        return box;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
