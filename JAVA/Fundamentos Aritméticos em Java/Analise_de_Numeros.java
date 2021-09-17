/*
Fundamentos Aritméticos em Java
3 / 5 - Análise de Números





 Básico
 Princípios Básicos
Desafio
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

 
Exemplo de Entrada	          Exemplo de Saída
-5                            3 valor(es) par(es)
0                             2 valor(es) impar(es)
-3                            1 valor(es) positivo(s)
-4                            3 valor(es) negativo(s)
12



Código do enunciado:

import java.io.IOException;
import java.util.Scanner;

public class minhaClasse {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int  = 0;
        int  = 0;
        int  = 0;
        int  = 0;
        int   ;

//continue a solução
        for () {
        	
        }
//insira suas variaveis corretamente
        System.out.println( + " valor(es) par(es)");
        System.out.println( + " valor(es) impar(es)");
        System.out.println( + " valor(es) positivo(s)");
        System.out.println( + " valor(es) negativo(s)");
    }
	
}
*/

// Resolução:



import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class AnaliseNumeros {
	
    public static void main(String[] args) throws IOException {
        String linha;
//declare suas variaveis corretamente
        int Pos, Neg, Par, Impar, num;
  
        Pos = Neg = Par = Impar = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

//continue a solução
        for (int i = 0; i < 5; i++) {
          linha = br.readLine();
          num = Integer.parseInt(linha);
          
          if (num % 2 == 0){
              Par++;
          }else {
            Impar++;
          }
          if(num > 0) Pos++;
          if(num < 0) Neg++;
        }
//insira suas variaveis corretamente
        System.out.println("" + Par +" valor(es) par(es)");
        System.out.println("" + Impar +" valor(es) impar(es)");
        System.out.println("" + Pos +" valor(es) positivo(s)");
        System.out.println("" + Neg +" valor(es) negativo(s)");
    }
	
}