/*
Desafios Aritméticos em JavaScript

3 / 3 - Substituição em Vetor I

 Básico                   Princípios Básicos

Desafio:
Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.

Entrada:
A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

Saída:
Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

 
Exemplo de Entrada	   Exemplo de Saída
0                      X[0] = 1
-5                     X[1] = 1
63                     X[2] = 63
0                      X[3] = 1
...                    ...
 
Código do enunciado:

const input = gets();

for (let i = 0; i < 10; i++) {
  console.log(`X[${i}] = ${n[i] <= 0 ? 1 : n[i]}`);
}

*/

//  Resolução:


function SubstituicaovetorI() {

  for (let i = 0; i < 10; i++) {
    let X = parseInt(gets());
    
    if (X <= 0){
      X = 1;
    }
    console.log(`X[${i}] = ${X}`);
  }

}
SubstituicaovetorI();







 