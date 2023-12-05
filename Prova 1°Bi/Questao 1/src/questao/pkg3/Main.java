package questao.pkg3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ItemCompra> lista = new ArrayList<>();
        
        lista.add(new ItemCompra("Abacaxi", 1, 5));
        lista.add(new ItemCompra("Manga", 2, 3));
        lista.add(new ItemCompra("Banana", 6, 2));
        
        System.out.println("Valor total da lista: " + calcularTotalLista(lista));
        
        
    }
    
    public static double calcularTotalLista(ArrayList<ItemCompra> Lista){
        double total = 0;
        
        for(int i = 0; i < Lista.size(); i++){
            total += Lista.get(i).calcularTotal();
        }
        
        return total;
    }
    
}
