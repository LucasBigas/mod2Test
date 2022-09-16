package br.univille;

import java.util.ArrayList;

public class ImpostoDeRenda {
    
    private float valorImptoRetidonaFonte;
    private ArrayList<Rendimento>listaRendimentos = new ArrayList<>();
    
    public float getValorImptoRetidonaFonte() {
        return valorImptoRetidonaFonte;
    }
    public void setValorImptoRetidonaFonte(float valorImptoRetidonaFonte) {
        this.valorImptoRetidonaFonte = valorImptoRetidonaFonte;
    }
    public ArrayList<Rendimento> getListaRendimentos() {
        return listaRendimentos;
    }
    public void setListaRendimentos(ArrayList<Rendimento> listaRendimentos) {
        this.listaRendimentos = listaRendimentos;
    }

    public float calculaValorIFPF(){
        float percentual = 0;
        float imposto = 0;
        float somaRendimentos= 0;
        for(var umRendimento : getListaRendimentos()){
            somaRendimentos += umRendimento.getValor();
        }

        var valorPorMes = somaRendimentos / 12f;

        if(valorPorMes >= 1903f  && valorPorMes < 2826f){
            percentual = 7.5f;
        }else{
            if(valorPorMes >2826f && valorPorMes <3751f){
                percentual = 15f;
            }else{
                if(valorPorMes >3751f && valorPorMes <4664f){
                    percentual = 22.5f;
                }else{
                    if(valorPorMes > 4664f){
                        percentual = 27.5f;
                    }
                }
            }
        }

        imposto =  (somaRendimentos * percentual / 100f);
        imposto = imposto - getValorImptoRetidonaFonte();
        
        return imposto;
    }

    

}
