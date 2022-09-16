package br.univille;

import java.util.ArrayList;



public class Aluno {
    
    private String nome;
    private float percFrequencia;
    private ArrayList<Avaliacao>listaDeNotas = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPercFrequencia() {
        return percFrequencia;
    }
    public void setPercFrequencia(float percFrequencia) {
        this.percFrequencia = percFrequencia;
    }
    public ArrayList<Avaliacao> getListaDeNotas() {
        return listaDeNotas;
    }
    public void setListaDeNotas(ArrayList<Avaliacao> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

    private float media(){
        float Media = 0;
        float soma = 0;
        for(Avaliacao umaAvaliacao :this.getListaDeNotas()){
            soma = soma + umaAvaliacao.getNota();
        }
        Media = soma / this.getListaDeNotas().size();
        return Media;
    }

    public boolean estaEmExame(){
        if((media() > 3 && media() <7) && percFrequencia >75f){
            return true;
        }
        
        return false;
    }

    public boolean estaAprovado(){
        if(media() >= 7 && percFrequencia > 75f){
            return true;
        }
        return false;
    }

    public boolean estaReprovado(){
        if(media() <=3 || percFrequencia <75f){
            return true;
        }
        return false;
    }

    


}
