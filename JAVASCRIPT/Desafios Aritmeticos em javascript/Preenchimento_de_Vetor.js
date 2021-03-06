/*

Desafios Aritméticos em JavaScript

2 / 3 - Preenchimento de Vetor I

 Básico                      Princípios Básicos

Desafio
Você recebeu o desafio de ler um valor e criar um programa que coloque o valor lido na primeira posição de um vetor N[10]. Em cada posição subsequente, coloque o dobro do valor da posição anterior. Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.

Entrada
A entrada contém um valor inteiro (V<=50).

Saída
Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o valor armazenado na posição i. O primeiro número do vetor N (N[0]) irá receber o valor de V.

 
Exemplo de Entrada	Exemplo de Saída

 1                      N[0] = 1
                        N[1] = 2
                        N[2] = 4
                        ...


Código do enunciado:

const input = gets();
const n = Number(lines.shift());

for (                                       ) {
  console.log("N[" + a + "] = " + b);
}

*/

// Resolução:

const input = gets();
let a = input;  //substitui aqui o number por input
// executando as condições
for (let cont = 0; cont < 10; cont++) {
	console.log(`N[${cont}] = ${a}`);
	a = a * 2;
}