package testeAutomatizados.testeUnitariosAutomatizados;

public class Calculo {

    public int soma(int a, int b) {
        return a + b;
    }

    public double raizQuadrada(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Erro, impossivel efetuar a raiz quadrada real para número negativos");
        }
        return Math.sqrt(number);
    }

    public boolean imparOuPar (int number){ // != (diferente)
        //Se o resto da divisão divido por 2 diferir de 0, significa que o número é impar (primo)
        return number % 2 != 0; // Se resto de uma divisão divida por dois difere de zero (retorne true)
        //Se não retorne(false)
    }

}
