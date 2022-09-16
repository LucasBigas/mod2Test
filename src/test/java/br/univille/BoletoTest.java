package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BoletoTest {
    
    @Test
    public void PagarAntesdaData(){
        Boleto boleto1 = new Boleto(1500f, 0.1f, 0.2f, 10);
        assertEquals(1350f, boleto1.pagar(10));
    }

    @Test
    public void PagarDepois(){
        Boleto boleto2 = new Boleto(1500f, 0.1f, 0.2f, 11);
        assertEquals(1800f, boleto2.pagar(11));
    }
}
