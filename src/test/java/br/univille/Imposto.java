package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Imposto {

    @Test
   public void ImpostoIRRF(){
    Rendimento rendimento1 = new Rendimento("Casa", 2500f);

    ImpostoDeRenda impostoDeRenda1 = new ImpostoDeRenda();
    impostoDeRenda1.setValorImptoRetidonaFonte(1000f);
    impostoDeRenda1.getListaRendimentos().add(rendimento1);
    assertEquals(1250f, impostoDeRenda1.calculaValorIFPF());
   }

    
}
