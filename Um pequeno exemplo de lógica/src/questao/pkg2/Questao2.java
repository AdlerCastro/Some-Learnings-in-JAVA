package questao.pkg2;

import java.util.Scanner;

public class Questao2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char resposta;
        char resposta2;
        boolean sla = true;
        boolean sla2 = true;
        
        Geral:
        while(sla2){
            
            Sla:
            while (sla) {
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
                        break Sla;
                    default:
                        System.out.println("\nNão foi possível reconhecer a resposta\n\n\n\n");
                        break;
                }
            }
            
            System.out.println("1 para continuar e 0 para sair");
            resposta2 = input.next().charAt(0);
            
            switch (resposta2){
                case '1':
                    sla2 = true;
                    break;

                case '0':
                    sla2 = false;
                    break; //Ou break Geral;
                    
                default:
                    System.out.println("\nNão foi possível reconhecer a resposta\n\n\n\n");
                    break;
            }
        }
    
    }
}
