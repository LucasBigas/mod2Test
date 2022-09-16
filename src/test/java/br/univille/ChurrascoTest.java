package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ChurrascoTest {
   
    @DisplayName("Quantidade de adulto 1 e criancas 0")
    @Test
    public void QtdCarne(){
     Churrasco  churras = new Churrasco();
        churras.setAdultos(1);
        churras.setCriancas(0);
        assertEquals(250f, churras.calculaQtdCarne());
    }
    
}
