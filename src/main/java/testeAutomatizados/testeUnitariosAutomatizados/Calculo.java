package testeAutomatizados.testeUnitariosAutomatizados;

public class Calculo {

    public int soma(int a, int b) {
        return a + b;
    }

    public double raizQuadrada(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Erro, impossivel efetuar a raiz quadrada real para n�mero negativos");
        }
        return Math.sqrt(number);
    }

    public boolean imparOuPar (int number){ // != (diferente)
        //Se o resto da divis�o divido por 2 diferir de 0, significa que o n�mero � impar (primo)
        return number % 2 != 0; // Se resto de uma divis�o divida por dois difere de zero (retorne true)
        //Se n�o retorne(false)
    }

}
