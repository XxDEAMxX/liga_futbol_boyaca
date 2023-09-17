package model;

import pojos.Noticia;

import java.util.ArrayList;

public class NoticiasModel {

    private ArrayList<Noticia> noticias;

    public NoticiasModel() {
        this.noticias = new ArrayList<>();
    }

    public ArrayList<Noticia> getNoticias() {
        return noticias;
    }

    public int SearchNoticia(int id){
        int index = -1;
        for (int i = 0; i < noticias.size(); i++) {
            if(noticias.get(i).getId() == id){
                index = i;
            }
        }
        return index;
    }

    public boolean AddNoticia (Noticia newNoticia) {
        if(SearchNoticia(newNoticia.getId()) == -1) {
            noticias.add(newNoticia);
            return true;
        } else {
            return false;
        }
    }

    public boolean ModicarNoticia (Noticia noticia){
        int index = SearchNoticia(noticia.getId());
        if(index == -1) {
            return false;
        } else {
            noticias.get(index).setDescripcion(noticia.getDescripcion());
            noticias.get(index).setTitulo(noticia.getTitulo());
            return true;
        }
    }

    public boolean RemoveNoticia(int id){
        int index = SearchNoticia(id);
        if(index == -1){
            return false;
        }else {
            noticias.remove(index);
            return true;
        }
    }

    public String showNoticias(){
        String box = "";
        for (Noticia not: noticias) {
            box += not.toString();
        }
        return box;
    }

}
