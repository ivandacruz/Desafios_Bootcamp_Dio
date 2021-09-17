/*
Fundamentos Aritméticos em Java
1 / 5 - Quantidade de Números Positivos





 Básico
 Princípios Básicos
Desafio:
Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.

Entrada:
Você receberá seis valores, negativos e/ou positivos.

Saída:
Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos" ao final.

 
Exemplo de Entrada	      Exemplo de Saída
7                         4 valores positivos
-5
6
-3.4
4.6
12


* código dado pelo enunciado:


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class QuantidadeNumerosPositivos {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int valor1 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int valor2 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    double valor3 = Double.parseDouble(st.nextToken());

    double salary = valor2 * valor3; // Altere o valor da variável com o cálculo esperado
    System.out.println("NUMBER = " + valor1);
    System.out.printf("SALARY = U$ %.2f", salary);
  }
}
*/

// Resolução:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QtdeNumerosPositivos {
	public static void main(String[] args)throws IOException {
		String linha;
		Double n;
		int Pos, i;
		Pos=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (i=0; i < 6; i++) {
			linha = br.readLine();
			n = Double.parseDouble(linha);
			if(n > 0.0)Pos++;
		}
		System.out.println("" + Pos  +" valores positivos ");
	}
}