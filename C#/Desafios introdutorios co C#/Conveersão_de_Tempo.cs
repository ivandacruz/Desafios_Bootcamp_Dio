/*
Desafios Introdutórios com C#

3 / 3 - Conversão de Tempo

 Básico                            Princípios Básicos

Desafio
Você terá o desafio de ler um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma loja, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

 
Exemplo de Entrada	  Exemplo de Saída

556                    0:9:16



1                      0:0:1


Código dado pelo enunciado:

using System;

    class MinhaClasse {
        static void Main(string[] args) {
            var timeInSeconds = int.Parse(Console.ReadLine());
                ------------- esse aqui eu retirei e o troquei pelo 
                              traduzido tempo (esteva time in seconds)

       //continue a solucao
            var hours = ;
            timeInSeconds =  ;  // esse aqui eu retirei
            var minutes =   ;
            var seconds =    ;

            Console.WriteLine($"{hours}:{minutes}:{seconds}");
        }
    }

*/

// Resolução:

using System;

    class ConversaoDeTempo {
        static void Main(string[] args) {
            var tempo = int.Parse(Console.ReadLine());

       //continue a solucao
            var hours =(tempo / 3600);
            var minutes =  (tempo % 3600) / 60;
            var seconds = (tempo % 3600) % 60 ;

            Console.WriteLine($"{hours}:{minutes}:{seconds}");
        }
    }