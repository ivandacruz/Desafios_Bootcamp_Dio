/*
Resolvendo Desafios em Java
1 / 3 - Preenchimento de Vetor III





 Intermediário
 Princípios Básicos
Leia um valor X. Coloque este valor na primeira posição de um vetor N[100]. Em cada posição subsequente de N (1 até 99), coloque a metade do valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contem um valor de dupla precisão com 4 casas decimais.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição. Cada valor do vetor deve ser apresentado com 4 casas decimais.

 
Exemplo de Entrada   	Exemplo de Saída

                          N[0] = 200.0000
200.0000                  N[1] = 100.0000
                          N[2] = 50.0000
                          N[3] = 25.0000
                          N[4] = 12.5000
                          ...

Código do enunciado:

import java.io.IOException;
import java.util.Scanner;

public class{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double X = leitor.nextDouble();
        double[] N = new double[100];
        N[0] = X;
        for (                                       ) {
        	
        }
        for (                              ) {
        	System.out.println(String.format("N[" + i + "] = %.4f", N[i]));
        }
    }
	
}

*/

// Resolução:

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class PreenchimentoVetorIII {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner leitor = new Scanner(System.in);
    double X = 0;
    
    X = leitor.nextDouble();
    BigDecimal[] N = new BigDecimal[100];
    N[0] = new BigDecimal(X);

    for (int i = 1; i < 100; ++i) {
      N[i] = N[i - 1].divide(new BigDecimal(2));
    }

    leitor.close();
    DecimalFormat decFormat = new DecimalFormat("0.0000");

    for (int i = 0; i < 100; ++i) {
      System.out.println("N[" + i + "] = " + decFormat.format(N[i]));
    }
  }
}