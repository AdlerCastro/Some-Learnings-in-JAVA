package questao.pkg2;

import java.util.Scanner;

public class Questao2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char resposta;
        boolean sla = true;
       
        Geral:
        while (sla = true) {
            System.out.println("Pressione Y para desenhar ou Q para fechar o programa");
            resposta = input.next().charAt(0);
            switch (resposta) {
                case 'Y':
                case 'y':
                    System.out.println("YYY     YYY\n YYY   YYY\n  YYY YYY\n   YYYYY\n    YYY\n    YYY\n    YYY\n    YYY\n    YYY\n   YYYYY");
                    sla= true;
                    break;
                    
                case 'Q':
                case 'q':
                    break Geral;
                default:
                    System.out.println("\nNão foi possível reconhecer a resposta\n\n\n\n");
                    sla = true;
                    break;
            }
        }
    }
    
}
