/*
Solução de Problemas com Java

2 / 7 - Vogais Extraterrestres

 Intermediário                                            Strings

Desafio
Desde o Gerador de Improbabilidade Infinita, muitos nem questionam sobre vidas extraterrestres, e se aprofundam em questionamentos mais improváveis, como, por exemplo, será que seres de outros planetas usam os mesmos caracteres que nós para se comunicarem? E se isso for verdade, será que usam as mesmas letras vogais que a gente? Pensando nisso, vários cientistas criaram inúmeros tipos de alfabetos alienígenas, usando as letras do nosso alfabeto, além dos dígitos, de 0 a 9, com as suas respectivas vogais. Baseados nisto, eles querem a sua ajuda para identificar vogais em alfabetos alienígenas e realizar a contagem.

Escreva um programa que, dado uma sequência de vogais, em um determinado alfabeto alienígena, contabilize, em um texto escrito com o mesmo alfabeto, quantas vogais o mesmo possui.

Entrada
Haverá diversos casos de teste. Cada caso de teste é formado por duas linhas. A primeira linha informa uma palavra, formada por todas as vogais alienígenas de um determinado planeta. A segunda linha contém uma frase formada por letras do mesmo alfabeto. A entrada termina com fim de arquivo.

Saída
Para cada caso de teste, imprima a quantidade de vogais alienígenas correspondente.

 
Exemplo de Entrada	                               Exemplo de Saída
aeiou                                                 16

o rato roeu a roupa do rei de roma                     8

4310                                                   3

t3st3 p4r4 c0d1f1c4r

kwy

the quick brown fox jumps over the lazy dog



Código do enunciado:
import java.util.*;

public class ContagemRepetidadeNumeros {

	public static void main(String[] args) {
           Scanner scr = new Scanner(System.in);
           int valores = scr.nextInt();
           Map<Integer, Integer> numeros = new HashMap<>();

    //declare as variaveis corretamente e continue a sua solução

        for (int i = 0; i < valores; i++) {
            var numero = scr.nextInt();
    
            if(numeros.containsKey(numero)) {
              var qtde = numeros.get(numero); 
              numeros.put(numero, ++qtde);
                
            } else {
              numeros.put(numero, 1);
                
            }
        }

        numeros.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));
    }
}    


*/

// Resolução:


import java.util.Scanner;

public class VogaisExtraterrestre {
  public static void main(String[] args){
    Scanner src = new Scanner(System.in);
    String alfabeto;
    String frase;
    int quantidade = 0;
    
    while (src.hasNextLine()){
        quantidade = 0;
        alfabeto = src.nextLine();
        frase = src.nextLine();
        for (int i = 0; i < alfabeto.length(); i++){
            for (int j = 0; j < frase.length(); j++){
              if (frase.charAt(j) == alfabeto.charAt(i)){
                 quantidade++;
              }
            }
        }
        System.out.println(quantidade);
    }
  }
}