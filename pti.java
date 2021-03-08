/*
Escreva um programa em Java que leia uma sequência N de números inteiros (negativos, positivos e o zero) para um vetor. No início do programa é solicitado ao usuário (pelo teclado) qual é a quantidade de elementos que serão lidos para o vetor e depois disso os números são lidos para o vetor.

Em seguida você deve implementar para cada um dos itens abaixo uma função:

a) Calcule e retorna o valor da maior diferença entre dois elementos distintos no vetor.
b) Verifica se o vetor está em ordem crescente, e retorna true caso esteja e false caso contrário.

*/

import java.util.Arrays;
import java.util.Scanner;

class Main {

  static Scanner leitor = new Scanner(System.in);

   //Função para criar vetor
    static int[] criaVetor() {
      int tamanho;
      System.out.println("Digite o tamanho do vetor: ");
       tamanho = leitor.nextInt();//definindo quantos elementos terão no vetor
       
      int[] vetor = new int[tamanho];     
      for (int i = 0; i < vetor.length; i++) {
        System.out.printf("Vetor[%d] = \n", i);
            vetor[i] = leitor.nextInt(); // inserindo valores do vetor
        }
       return vetor;
    }

    //Função para imprimir vetor
    static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor [%d] = %d \n", i, vetor[i]);
        }
    }

    //Função para verificar se o vetor está ordenado
    static boolean verifOrdem(int[] vetor){
      for (int i = 0; i < vetor.length - 1; i++) {
        if (vetor[i] > vetor[i + 1]) {
          return false;
        }
      }
      return true;      
    }
    //Função para calcular a diferença
     static int dif_element(int[] vetorOrdenado) {
        int dif = vetorOrdenado[vetorOrdenado.length - 1] - vetorOrdenado[0];
        return dif;
 }

   
    public static void main(String[] args) {
        int[] vetor = criaVetor();//chamada da função de criar vetor   
        imprimirVetor(vetor);//chamada da função de imprimir vetor 

        int[] vetorOrdenado = new int[vetor.length];//criação de um novo vetor para ordenação
        for(int i = 0; i < vetor.length; i++){
          vetorOrdenado[i] = vetor[i];
        }
        Arrays.sort(vetorOrdenado);
        if(verifOrdem(vetor)){//chamada da função de verificação        
          System.out.println("O vetor está ordenado!");//resposta para retorno true
        } else {
            System.out.println("O vetor não está ordenado!");//resposta para retorno false
            imprimirVetor(vetorOrdenado);//imprimir vetor ordenado
          }
                
        System.out.println("A maior diferença entre dois elementos é: " + dif_element(vetorOrdenado));//chamada da função para calculo da diferença
    }
}
