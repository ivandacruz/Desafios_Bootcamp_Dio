/*
Fundamentos Aritméticos em Java
5 / 5 - Consumo Médio do Automóvel





 Básico
 Princípios Básicos
Desafio
Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e o total de combustível consumido (em litros).

Entrada
Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km), e um valor real Y que representa o total de combustível consumido, com um dígito após o ponto decimal.

Saída
Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula), incluindo no final a mensagem "km/l".

 
Exemplo de Entrada	        Exemplo de Saída
500                          14.286 km/l
35.0



2254                         18.119 km/l
124.4



4554                         9.802 km/l
464.6

Codigo dado pelo enunciado:

import java.io.IOException;
import java.util.Scanner;

public class Desafio {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int  = leitor.nextInt();
        double  = leitor.nextDouble();

        double media =  ;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("%.3f km/l",      ));   
    }
	
}
*/
// Resolução:


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContest;

public class ConsumoMedioAutomovel {
	public static void main(String[] args) throws IOException {
		BigDecimal km;
		BigDecimal combustivel;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		km = new BigDecimal(br.readLine());
		combustivel = new BigDecimal(br.readLine());
		BigDecimal comMedio = km.divide(combustivel, MathContest.DECIMAL32).setScale(3, BigDecimal.ROUND_HALF_EVEN);

		System.out.println("" + comMedio + "km/l");

	}
}