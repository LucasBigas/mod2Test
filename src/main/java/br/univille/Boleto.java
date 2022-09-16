package br.univille;

public class Boleto {
    
    private float valor;
    private int diaVencimento;
    private float percDesconto;
    private float percMulta;

    public float getValor() {
        return valor;
    }
    
    public int getDiaVencimento() {
        return diaVencimento;
    }
    
    public float getPercDesconto() {
        return percDesconto;
    }
    
    public float getPercMulta() {
        return percMulta;
    }
    
    public  Boleto(float valor, float percDesconto, float percMulta, int diaVencimento){
        this.valor = valor; this.percDesconto = percDesconto; this.percMulta = percMulta; this.diaVencimento = diaVencimento;

    }

    public float pagar(int diaVencimento){
        float reais = 0;
        if(diaVencimento <=10){
            reais = valor -(valor * percDesconto);
        }else{
            reais = valor +(valor * percMulta);
        }
        return reais;
    }

    
}
