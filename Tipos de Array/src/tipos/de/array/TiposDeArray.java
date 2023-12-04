package tipos.de.array;

import java.util.Arrays;
import java.util.ArrayList;

public class TiposDeArray {

    public static void main(String[] args) throws Exception {
        //O código a seguir é uma apresentação do Array e suas variações, assim como, formas de utiliza-las
        System.out.println("Array nada mais é que um vetor com um tamanho fixo pré-definido iniciando sempre da posição 0, por exemplo um array de 5 posições: Array[5] vai de 0 a 4\n");
        
        //Array Estático é um vetor de tamanho fixo pré-definido
        System.out.println("A fim de determinar um array, é necessário definir seu tipo, nome e quantidade de posições, exemplo: 'tipo'[] 'nome do vetor' = new 'tipo'['numero de posições']\n");
        
        int x = 5;
        
        String[] nomes = new String[x];
        nomes[0] = "Goku"; //Indice 0
        nomes[1] = "Chichi"; //Indice 1
        nomes[2] = "Gohan"; //Indice 2
        nomes[3] = "Goten"; //Indice 3
        nomes[4] = "Pan"; //Indice 4
        
        System.out.println("\n\t\t----------  Array Estático  ----------\nExemplificando o Array Estático, pode-se printar o valor correspondente a determinada posição do vetor utilizando 'nome do vetor' ['posição desejada'],\npor exemplo a posição 0 do vetor 'nomes' é dada por 'nomes[0]' é correspondente a: " + nomes[0] + "\n");
        System.out.println("Caso seja necessário imprimir todo o array, deve-se utilizar de um laço de repetição for para tal (assim como utilizado no código a seguir) e os valores do array nomes é:");
        
        
        
        for(int i = 0; i < x; i++){
            System.out.println(nomes[i]);
        }
        
        
        //Array Dinâmico é um vetor sem tamanho pré-definido, sendo considerado uma lista de 'maniulação livre'
        ArrayList<String> ListaNomes = new ArrayList<String>();
        ListaNomes.add("Vegeta"); //Indice 0
        ListaNomes.add("Bulma"); //Indice 1
        ListaNomes.add("Trunks"); //Indice 2
        
        System.out.println("\n\t\t----------  Array Dinâmmico  ----------\nExemplificando o Array Estático, pode-se printar o valor correspondente a determinada posição do vetor utilizando 'nome do vetor' ['posição desejada'],\npor exemplo a posição 0 do vetor 'nomes' é dada por 'nomes[0]' é correspondente a: " + nomes[0] + "\n");
        System.out.println(ListaNomes);
        
    }
    
}
