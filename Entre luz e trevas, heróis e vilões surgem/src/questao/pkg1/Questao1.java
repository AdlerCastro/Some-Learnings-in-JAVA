package questao.pkg1;

public class Questao1 {

    public static void main(String[] args) {
        
        /* ----------------     Herói    ----------------- */
        System.out.println("-------------------    Criação dos Herói   -------------------");
        
        Heroi heroi = new Heroi("Mago", 10.5, 2.8, "Pedreiro");
        
        heroi.escreverStatus();
        
        System.out.println("\n\tAltura:");
        //Mudança de Altura
        System.out.println("Altura atual: "+heroi.getAltura());
        heroi.setAltura(2.0);
        System.out.println("Nova altura: "+heroi.getAltura());
        
        System.out.println("\n\tPossibilidades de erro na altura:");
        //Erro na mudança
        heroi.setAltura(0);
        heroi.setAltura(4);
        
        
        System.out.println("\n\n\tCategoria:");
        //Mudança de Categoria
        System.out.println("Categoria atual: "+heroi.getCategoria());
        heroi.setCategoria("Elfo");
        System.out.println("Nova categoria: "+heroi.getCategoria());
        
        System.out.println("\n\tPossibilidades de erro na categoria:");
        //Erro na mudança
        heroi.setCategoria("a");
        
        
        System.out.println("\n\n\tProfissão:");
        //Mudança de Profissao
        System.out.println("Profissão atual: "+heroi.getProfissao());
        heroi.setProfissao("Arqueiro");
        System.out.println("Nova profissão: "+heroi.getProfissao());
        
        System.out.println("\n\tPossibilidades de erro na profissão:");
        //Erro na mudança
        heroi.setProfissao("a");
        
        System.out.println("\n\n\tPeso:");
        //Mudança de Peso
        System.out.println("Peso atual: "+heroi.getPeso());
        heroi.setPeso(0.3);
        System.out.println("Novo peso: "+heroi.getPeso());
        
        System.out.println("\n\tPossibilidades de erro no peso:");
        //Erro na mudança
        heroi.setPeso(0);
        
        /* ----------------     Vilao    ----------------- */
        
        System.out.println("-------------------    Criação do Vilão    -------------------");
        
        Vilao vilao = new Vilao();
        
        vilao.escreverStatus();
        
        System.out.println("\n\tAltura:");
        //Mudança de Altura
        System.out.println("Altura atual: "+vilao.getAltura());
        vilao.setAltura(2.5);
        System.out.println("Nova altura: "+vilao.getAltura());
        
        System.out.println("\n\tPossibilidades de erro na altura:");
        //Erro na mudança
        vilao.setAltura(0);
        vilao.setAltura(4);
        
        
        System.out.println("\n\n\tCriatura:");
        //Mudança de Criatura
        System.out.println("Criatura atual: "+vilao.getCriatura());
        vilao.setCriatura("Orc");
        System.out.println("Nova criatura: "+vilao.getCriatura());
        
        System.out.println("\n\tPossibilidades de erro na criatura:");
        //Erro na mudança
        vilao.setCriatura("a");
        
        System.out.println("\n\n\tProfissão:");
        //Mudança de Profissao
        System.out.println("Profissão atual: "+vilao.getProfissao());
        vilao.setProfissao("Arqueiro de Sauron");
        System.out.println("Nova profissão: "+vilao.getProfissao());
        
        System.out.println("\n\tPossibilidades de erro na profissão:");
        //Erro na mudança
        vilao.setProfissao("a");
        
        System.out.println("\n\n\tPeso:");
        //Mudança de Peso
        System.out.println("Peso atual: "+vilao.getPeso());
        vilao.setPeso(0.5);
        System.out.println("Novo peso: "+vilao.getPeso());
        
        System.out.println("\n\tPossibilidades de erro no peso:");
        //Erro na mudança
        vilao.setPeso(0);
        
    }
    
}
