package br.univille;

public class Churrasco {
    
    private int adultos;
    private int criancas;
    
    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }
    public void setCriancas(int criancas) {
        this.criancas = criancas;
    }


    public float calculaQtdCarne(){
        float total = 0;
        total = total + (adultos * 250f);
        total = total + (criancas * 100f);
        return  total;
    }
}
