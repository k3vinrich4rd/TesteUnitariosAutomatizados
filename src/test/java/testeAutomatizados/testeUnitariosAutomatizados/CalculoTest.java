package testeAutomatizados.testeUnitariosAutomatizados;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculoTest {

    @Test
    void TestarCalculoDeSoma(){
        Calculo calculo = new Calculo();
        float soma = calculo.soma(6, 7);
        Assertions.assertEquals(13, soma);
    }

    @Test
    void TestarAMensagemDeExcecaoDoMetodoDeRaizQuadrada(){
        Calculo calculo = new Calculo();
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculo.raizQuadrada(-1));
        Assertions.assertEquals("Erro, impossivel efetuar a raiz quadrada real para número negativos", exception.getMessage());
    }

    @Test
    void TestarCalculoDeRaizQuadrada(){
        Calculo calculo = new Calculo();
        double raizQuadrada = calculo.raizQuadrada(25);
        Assertions.assertEquals(5, raizQuadrada);
    }

    @Test
    void TestandoRetornoDeUmNumeroImpar(){
        Calculo calculo = new Calculo();
        boolean impar = calculo.imparOuPar(3);
        Assertions.assertTrue(impar);
    }

    @Test
    void TestandoRetornoDeUmNumeroPar(){
        Calculo calculo = new Calculo();
        boolean par = calculo.imparOuPar(2);
        Assertions.assertFalse(par);
    }
}
