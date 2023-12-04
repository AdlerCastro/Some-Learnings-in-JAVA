package questao.pkg2;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    ArrayList<Livro> conjuntoLivros;
    private String bibliotecario;
    
    public void adicionarLivro(Livro livro){
        if(livro != null){
            System.out.println("Livro " + livro + " adicionado com sucesso");
        }
        else{
            System.out.println("Valor inválido para livro");
        }
    }
    
    public void setBibliotecario(String bibliotecario){
        this.bibliotecario = bibliotecario;
    }
    
    public String getBibliotecario(){
        return this.bibliotecario;
    }
    
}
