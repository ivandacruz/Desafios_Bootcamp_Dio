/*
Primeiros passos em Java
3 / 3 - Divisores I





 Básico
 Princípios Básicos
Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.

 
Exemplo de Entrada	   Exemplo de Saída
 6                        1
                          2
                          3
                          6

(Referência: Agradecimentos a Cassio F.)


Código dado pelo enumciado:

import java.util.Scanner;

public class Problem {
//complete os espaços em branco com sua solução
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1;          ; i++) {
            if (n % i == 0) {
                System.out.println(       );
            }
        }
        System.out.println(        );
    }

}

*/

// Resolução:

import java.util.Scanner;
import java.io.IOException;

public class Divisores {
//complete os espaços em branco com sua solução
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int N = leitor.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) 
                System.out.println(i);
            
        }
        leitor.close();
    }

}