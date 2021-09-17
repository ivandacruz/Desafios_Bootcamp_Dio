/*
Resolvendo Desafios em Java
3 / 3 - Uniformes de final de ano





 Intermediário
 Estrutura de Dados
Desafio
O professor Girafales organizou a confecção de um uniforme para as turmas da escola para comemorar o final do ano. Após algumas conversas, ficou decidido com os alunos que eles poderiam escolher a cor do uniforme entre branco ou vermelho. Assim sendo, Girafales precisa de sua ajuda para organizar as listas de quem quer o uniforme em cada uma das turmas, relacionando estas camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.

Entrada
Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo, que indica a quantidade de uniformes a serem feitas para aquela turma. As próximas N*2 linhas contém informações de cada um dos uniformes (serão duas linhas de informação para cada uniforme). A primeira linha irá conter o nome do estudante e a segunda linha irá conter a cor do uniforme ("branco" ou "vermelho") seguido por um espaço e pelo tamanho do uniforme "P" "M" ou "G". A entrada termina quando o valor de N for igual a zero (0) e esta valor não deverá ser processado.

Saída
Para cada caso de entrada deverão ser impressas as informações ordenadas pela cor em ordem ascendente, seguido pelos tamanhos em ordem descendente e por último por ordem ascendente de nome, conforme o exemplo abaixo.
 

 
Exemplo de Entrada:

9
Maria Jose
branco P
Mangojata Mancuda
vermelho P
Cezar Torres Mo
branco P
Baka Lhau
vermelho P
JuJu Mentina
branco M
Amaro Dinha
vermelho P
Adabi Finho
branco G
Severina Rigudinha
branco G
Carlos Chade Losna
vermelho P
0

Exemplo de Saída:

branco P Cezar Torres Mo
branco P Maria Jose
branco M JuJu Mentina
branco G Adabi Finho
branco G Severina Rigudinha
vermelho P Amaro Dinha
vermelho P Baka Lhau
vermelho P Carlos Chade Losna
vermelho P Mangojata Mancuda



Código do enunciado:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;


public class UniformesdeFinaldeAno {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String owner, l, color, size;
        String[] details;
        Tshirt[] tshirts;
        Tshirt tshirt;
        int N;
        boolean firstCase = true;
        while (!(l = read()).equals("0")) {
           
            } else {
                out.println();
            }
            N = toInt(l);
            tshirts = new Tshirt[N];
            for (int i = 0; i < N; i++) {
               
            }
            Arrays.sort(tshirts, new Comparator<Tshirt>() {
                @Override
                public int compare(Tshirt t1, Tshirt t2) {
                    String color1 = t1.getColor();
                    String color2 = t2.getColor();
                    int diff = color1.compareTo(color2);
                    if (diff != 0) {
                        return diff;
                    } else {
                       
                        }
                        if (                           ) {
                            return -1;
                        }
                        return 1;
                    }
                }
            });
            for (                                  ) {
    
            }

        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}

class Tshirt {

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}
*/


// Resolução 01:


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class UniformesFinalAno {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int linhas = Integer.parseInt(st.nextToken());
        List<Uniforme> uniformes = new ArrayList<>();
        
        for (int i = 0; i <= linhas; i++) {
            var next = br.readLine();
            if(next.equals("0")) {
                break;
            }
            Uniforme uniforme = new Uniforme();
            uniforme.setNomeEstudante(next);
            var camiseta = br.readLine().split(" ");
            uniforme.setCorUniforme(camiseta[0]);
            uniforme.setTamUniforme(camiseta[1]);
            uniformes.add(uniforme);
        }
        Comparator<Uniforme> comparator = Comparator
                .comparing(Uniforme::getCorUniforme).reversed()
                .thenComparing(Uniforme::getTamUniforme).reversed()
                .thenComparing(Uniforme::getNomeEstudante);
        
        uniformes.stream().sorted(comparator).forEach(System.out::println);
    }
    
    public static class Uniforme {
        private String nomeEstudante;
        private String corUniforme;
        private String tamUniforme;
        
        @Override
        public String toString() {
            return corUniforme + " " + tamUniforme + " "+ nomeEstudante;
        }
        
        public String getNomeEstudante() {
            return nomeEstudante;
        }
        
        public void setNomeEstudante(String nomeEstudante) {
            this.nomeEstudante = nomeEstudante;
        }
        
        public String getCorUniforme() {
            return corUniforme;
        }
        
        public void setCorUniforme(String corUniforme) {
            this.corUniforme = corUniforme;
        }
        
        public String getTamUniforme() {
            return tamUniforme;
        }
        
        public void setTamUniforme(String tamUniforme) {
            this.tamUniforme = tamUniforme;
        }
    }
}



// Resolução 02:

import java.io.IOException;
import java.util.*;

public class YearEndUniform 
{  
  private String name;
  private String uniformSize;
  private String uniformColor;

  public String getUniformColor() 
  {  
    return this.uniformColor;  
  }

  public void setUniformColor(String uniformColor) 
  {  
    this.uniformColor = uniformColor;
  }

  public String getName() 
  {  
    return this.name;
  }

  public void setName(String name) 
  {
    this.name = name;
  }

  public String getUniformSize() 
  {
    return this.uniformSize;
  }

  public void setUniformSize(String uniformSize) 
  {
    this.uniformSize = uniformSize;
  }

  public YearEndUniform(String name, String uniformColor, String uniformSize) 
  {
    this.name = name;
    this.uniformColor = uniformColor;
    this.uniformSize = uniformSize;
  }

  public void printStudentInfos() 
  {
      System.out.println(this.uniformColor + " " + uniformSize + " " + name);
  }
  
  public static void main(String[] args) throws IOException 
  {  
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt(); 
    scanner.nextLine();
    ArrayList<YearEndUniform> arrayUniforms= new ArrayList<>(N);
    String name, uniformDetails, uniformColor, uniformSize;

    for(int i = 0; i < N; i++) 
    {  
      name = scanner.nextLine(); 
      uniformDetails = scanner.nextLine();  
      uniformColor = uniformDetails.split(" ")[0];
      uniformSize= uniformDetails.split(" ")[1];
      arrayUniforms.add(new YearEndUniform(name, uniformColor, uniformSize));
    }

    scanner.close();
    Collections.sort(arrayUniforms, new UniformComparator());

    for(var item : arrayUniforms) 
    {  
      item.printStudentInfos(); 
    }
  }

  static class UniformComparator implements Comparator<YearEndUniform> 
  {  
    @Override
    public int compare(YearEndUniform student0, YearEndUniform student1) 
    {  
      int res = student0.uniformColor.compareTo(student1.uniformColor);
    
      if(res == 0) 
      {
        res = student0.uniformSize.compareTo(student1.uniformSize);
        
        if(res == 0) 
        {  
          res = student0.name.compareTo(student1.name);
        } else {
          res = -res;
        }
      }
      return res;
    }
  }
}