/*
Fundamentos Aritméticos em Java
4 / 5 - Contagem de Cédulas





 Intermediário
 Princípios Básicos
Desafio
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre o valor lido e a relação de notas necessárias.

Entrada
Você receberá um valor inteiro N (0 < N < 1000000).

Saída
Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim de linha.

 
Exemplo de Entrada	         Exemplo de Saída
576

                              576
                              5 nota(s) de R$ 100,00
                              1 nota(s) de R$ 50,00
                              1 nota(s) de R$ 20,00
                              0 nota(s) de R$ 10,00
                              1 nota(s) de R$ 5,00
                              0 nota(s) de R$ 2,00
                              1 nota(s) de R$ 1,00

11257

                              11257
                              112 nota(s) de R$ 100,00
                              1 nota(s) de R$ 50,00
                              0 nota(s) de R$ 20,00
                              0 nota(s) de R$ 10,00
                              1 nota(s) de R$ 5,00
                              1 nota(s) de R$ 2,00
                              0 nota(s) de R$ 1,00

503

                              503
                              5 nota(s) de R$ 100,00
                              0 nota(s) de R$ 50,00
                              0 nota(s) de R$ 20,00
                              0 nota(s) de R$ 10,00
                              0 nota(s) de R$ 5,00
                              1 nota(s) de R$ 2,00
                              1 nota(s) de R$ 1,00


Código do enunciado:


import java.io.IOException;
import java.util.Scanner;

public class Desafio{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //continue a solucao de acordo com as notas do enunciado
        int notasInseridas = leitor.nextInt();
        int atual = notasInseridas;
        int notas100 = atual / 100;
        atual -= notas100 * 100;
        int notas50 = ;
        atual -=  ;
        int notas20 = ;
        atual -=  ;
        int notas10 =   ;
        atual -=   ;
        int notas5 = ;
        atual -= ;
        int notas2 = ;
        atual -= ;
        int notas1 = atual;
        
        //continue a solucao de acordo com os exemplos de saída
        System.out.println(notasInseridas);
        System.out.println(  notas100 + " nota(s) de R$ 100,00");
        System.out.println(   + " nota(s) de R$ 50,00");
    }
	
}
*/

// Resolução:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContagemCedulas {
	public static void main(String[] args) throws IOException {
		String valorpagar;
		int apagar;
		int[] notas = new int[]{100, 50, 20, 10, 5, 2, 1};
		int[] totalNotas = new int[7];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		valorpagar = br.readLine();

		if (valorpagar != null && !"".equalsIgnoreCase(valorpagar) && !"0".equalsIgnoreCase(valorpagar)) {
			apagar = Integer.parseInt(valorpagar);

			for (int i = 0; i < 7; i++){
				totalNotas[i] = apagar / notas[i];
				apagar = apagar - totalNotas[i] * notas[i];
			}
		}

		System.out.println(""+ Integer.parseInt(valorpagar));

		for(int i = 0; i < 7; i++) {
			System.out.println(totalNotas[i] + " nota(s) de R$ " + notas[i] +",00");
		}

	}
}