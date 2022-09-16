package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calc;

    @BeforeEach
    public void paraCada(){
        calc = new Calculadora();
    }
    //Annotation
    @DisplayName("Testa soma do valor dois com dois")
    @Test
    public void testaSomaDoiseDois(){
        assertEquals(4, calc.soma(2, 2));
    }
    @DisplayName("Teste soma do valor dois com cinco")
    @Test
    public void testaSomaDoiseCinco(){
        assertEquals(7, calc.soma(2, 5));
    }
    @DisplayName("Teste subtracao do valor tres com dois")
    @Test
    public void testaSubtracaoTreseDois(){
        assertEquals(1, calc.subtracao(3, 2));
    }
    @DisplayName("Teste subtracao do valor 6 com 4")
    @Test
    public void testaSubtracaoSeiseQuatro(){
        assertEquals(2, calc.subtracao(6, 4));
    }
    @DisplayName("Teste subtracao do valor 10 com 3")
    @Test
    public void testaSubtracaoDezeTres(){
        assertEquals(7, calc.subtracao(10, 3));
    }
    @DisplayName("Teste multiplicacao do valor 5 com 3")
    @Test
    public void multiplicacaoCincoeTres(){
        assertEquals(15, calc.multiplicacao(5, 3));
    }
    @DisplayName("Teste multiplicacao do valor 2 com 4")
    @Test
    public void multiplicacaoDoiseQuatro(){
        assertEquals(8, calc.multiplicacao(2, 4));
    }
    @DisplayName("Teste de multiplicacao do valor 6 com 6")
    @Test
    public void multiplicacaoSeiseSeis(){
        assertEquals(36, calc.multiplicacao(6, 6));
    }
    @DisplayName("Teste de divisao do valor 4 com 2")
    @Test
    public void divisaoQuatroeDois(){
        assertEquals(2, calc.divisao(4, 2));
    }
    @DisplayName("Teste de divisao do valor 5 com 5")
    @Test
    public void divisaoCincoeCinco(){
        assertEquals(1, calc.divisao(5, 5));
    }
    @DisplayName("Teste de divisao do valor 6 com 2")
    @Test
    public void divisaoSeiseDois(){
        assertEquals(3, calc.divisao(6, 2));
    }

    @Test 
    public void testaDvisaoDezeZero(){
        try{
            calc.divisao(10,0);
            fail("Deveria ocorrer ArithmeticException ");
        }catch(ArithmeticException e){
            assertTrue(true);
        }
    }
    @Test
    public void testaDvisaoDezeZerov2(){
        assertThrows(ArithmeticException.class, 
        () -> calc.divisao(10, 0));
    }

}
