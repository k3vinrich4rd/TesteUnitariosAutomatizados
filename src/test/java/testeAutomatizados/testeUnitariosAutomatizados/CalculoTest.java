package testeAutomatizados.testeUnitariosAutomatizados;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculoTest {

    @Test
    @DisplayName("O teste dever� retornar o resultado de um calculo de uma soma")
    void TestarCalculoDeSoma() {
        Calculo calculo = new Calculo();
        float soma = calculo.soma(6, 7);
        Assertions.assertEquals(13, soma);
    }

    @Test
    @DisplayName("O teste dever� retornar uma mensagem de exce��o")
    void TestarAMensagemDeExcecaoDoMetodoDeRaizQuadrada() {
        Calculo calculo = new Calculo();
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculo.raizQuadrada(-1));
        Assertions.assertEquals("Erro, impossivel efetuar a raiz quadrada real para n�mero negativos", exception.getMessage());
    }

    @Test
    @DisplayName("O teste dever� retornar o calculo de uma raiz quadrada")
    void TestarCalculoDeRaizQuadrada() {
        Calculo calculo = new Calculo();
        double raizQuadrada = calculo.raizQuadrada(25);
        Assertions.assertEquals(5, raizQuadrada);
    }

    @Test
    @DisplayName("O teste dever� retorna true se o n�mero informado for impar")
    void TestandoRetornoDeUmNumeroImpar() {
        Calculo calculo = new Calculo();
        boolean impar = calculo.imparOuPar(3);
        Assertions.assertTrue(impar);
    }

    @Test
    @DisplayName("O teste dever� retornar true, se o n�mero informado for par")
    void TestandoRetornoDeUmNumeroPar() {
        Calculo calculo = new Calculo();
        boolean par = calculo.imparOuPar(2);
        Assertions.assertFalse(par);
    }
}
