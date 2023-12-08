import java.util.Scanner;

//Objetivo: Construir um retângulo

public class Retangulo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.println("Comprimento: ");
        int Comprimento = input.nextInt();
        
        System.out.println("Altura: ");
        int Altura = input.nextInt();

        for(x = 0; x < Comprimento; x++){
            
            System.out.print("*");
        }

        System.out.print("\n");

        for(y = 0; y < Altura-2; y++){
            System.out.print("*");
            for(x = 0; x < Comprimento - 2; x ++){
                System.out.print(" ");
            }

            System.out.print("*\n");
        }

        for(x = 0; x < Comprimento; x++){
            
            System.out.print("*");
        }
        
    }
    
}
