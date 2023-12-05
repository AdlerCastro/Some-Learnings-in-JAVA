package tipos.de.array;

import java.util.ArrayList;
import java.util.Collections;

public class TiposDeArray {

    public static void main(String[] args) throws Exception {
        //O código a seguir é uma apresentação do Array e suas variações, assim como, formas de utiliza-las
        System.out.println("Array nada mais é que um vetor com um tamanho fixo pré-definido iniciando sempre da posição 0, por exemplo um array de 5 posições: Array[5] vai de 0 a 4\n");
        
        //Array Estático é um vetor de tamanho fixo pré-definido
        System.out.println("A fim de determinar um array, é necessário definir seu tipo, nome e quantidade de posições, exemplo: 'tipo'[] 'nome do vetor' = new 'tipo'['numero de posições']\n");
        
        int x = 5;
        int i;
                
        String[] nomes = new String[x];
        nomes[0] = "Goku"; //Indice 0
        nomes[1] = "Chichi"; //Indice 1
        nomes[2] = "Gohan"; //Indice 2
        nomes[3] = "Goten"; //Indice 3
        nomes[4] = "Pan"; //Indice 4
        
        System.out.println("\n\t\t----------  Array Estático  ----------\nExemplificando o Array Estático, pode-se printar o valor correspondente a determinada posição do vetor utilizando 'nome do vetor' ['posição desejada'],\npor exemplo a posição 0 do vetor 'nomes' é dada por 'nomes[0]' é correspondente a: " + nomes[0] + "\n");
        System.out.println("Caso seja necessário imprimir todo o array, deve-se utilizar de um laço de repetição for para tal (assim como utilizado no código a seguir) e os valores do array nomes é:");
        
        //Método 1
        System.out.println("\nMétodo 1");
        for(i = 0; i < x; i++){
            System.out.println(nomes[i]);
        }
        System.out.println("\nMétodo 2");
        
        //Método 2
        for(i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        
        
        //Array Dinâmico é um vetor sem tamanho pré-definido, sendo considerado uma lista de 'maniulação livre'
        ArrayList<String> ListaNomes = new ArrayList<String>();
        ListaNomes.add("Vegeta"); //Indice 0
        ListaNomes.add("Bulma"); //Indice 1
        ListaNomes.add("Trunks"); //Indice 2
        
        System.out.println("\n\t\t----------  Array Dinâmmico  ----------\nExemplificando o Array Dinâmmico, pode-se printar o valor correspondente a determinada posição do vetor utilizando 'nome do vetor' ['posição desejada'],\npor exemplo a posição 0 do vetor 'nomes' é dada por 'ListaNomes.get(0)' é correspondente a: " + ListaNomes.get(0) + "\n");
        
        System.out.println("O tamanho atual da Lista de Nomes é: " + ListaNomes.size() + "\n");
        
        for(i = 0; i < ListaNomes.size(); i++){
            System.out.println(ListaNomes.get(i));
        }
            
        //Removendo um objeto do ArrayList
        
        System.out.println("\nPara remover um objeto da lista, siga os comandos do código. Por exemplo, se eu remover o Trunks ficaria: \n");
        ListaNomes.remove(2);
        
        //Método 1
        System.out.println("\nMétodo 1");
        for(i = 0; i < ListaNomes.size(); i++){
            System.out.println(ListaNomes.get(i));
        }
        
        //Método 2 utilizando FOREACH -----> for(Tipo de dados + " new Variavel"(representando os dados da lista) : "nome do ArrayList){System.out.println(variavel)}
        System.out.println("\nMétodo 2");
        for(String nomeLista : ListaNomes){
            System.out.println(nomeLista);
        }
        
        //Ver o tamanho do ArrayList
        System.out.println("\nO tamanho atual da Lista de Nomes é: " + ListaNomes.size());
    
        System.out.println("\n\t\t----------  Ordenando em sequência o ArrayList de números  ----------\nPode-se printar os valores de um ArrayList em ordem crescente usando o Collections, assim como representado a seguir \n");
        
        //ArrayList de números
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(-50);
        numeros.add(-27);
        numeros.add(-1);
        numeros.add(0);
        numeros.add(10);
        numeros.add(30);
        numeros.add(90);
        
        //Collections; sort --> ordenar
        Collections.sort(numeros);
        
        //Imprimindo em ordem crescente
        System.out.println("\t\tImprimindo em ordem crescente:");
        for(Integer numero : numeros){
            System.out.println(numero);
        }
        
        //Imprimindo em ordem decrescente
        Collections.sort(numeros, Collections.reverseOrder());
        
        //Imprimindo em ordem crescente
        System.out.println("\t\tImprimindo em ordem decrescente:");
        for(Integer numero : numeros){
            System.out.println(numero);
        }
        
        System.out.println("\n\t\t----------  Ordenando em sequência o ArrayList de números  ----------\nPode-se printar os valores de um ArrayList em ordem utilizando o Collections, assim como representado a seguir \n");
        
        //ArrayList de números
        ArrayList<String> Nomes = new ArrayList<String>();
        Nomes.add("Abigail");
        Nomes.add("Bianca");
        Nomes.add("Carolina");
        Nomes.add("Diana");
    Nomes.add("Eli");
        Nomes.add("Fernanda");
        Nomes.add("Giovana");
        
        //Collections; sort --> ordenar
        Collections.sort(Nomes);
        
        //Imprimindo em ordem crescente
        System.out.println("\t\tImprimindo em ordem crescente:");
        System.out.println("\t\tImprimindo em ordem decrescente:");
        for(String nomesLista : Nomes){
            System.out.println(nomesLista);
        }
        
        //Imprimindo em ordem decrescente
        Collections.sort(Nomes, Collections.reverseOrder());
        
        //Imprimindo em ordem crescente
        System.out.println("\t\tImprimindo em ordem decrescente:");
        for(String nomesLista : Nomes){
            System.out.println(nomesLista);
        }
    }
}