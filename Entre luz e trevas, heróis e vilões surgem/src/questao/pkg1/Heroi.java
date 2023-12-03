package questao.pkg1;

//Subclasse
public class Heroi extends Pessoa implements Status{
    //Atributos da classe
    private String categoria;

    public Heroi() {
        this.categoria = "SemCategoria";
        
        System.out.println("\nSurge um novo herói, aquele que combaterá as forças da escuridão!!");

    }

    public Heroi(String categoria, double peso, double altura, String profissao) {
        super(peso, altura, profissao);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        if(categoria.length() >= 3){
            this.categoria = categoria;
            System.out.println("Categoria atualizada para: "+ categoria);
        }else{
            System.out.println("\nEscreva uma categoria de pelo menos 3 letras");
        }
    }

    //Métodos implementados da interface
    @Override
    public void escreverStatus() {        
        System.out.println("\nO herói faz parte da categoria " + this.getCategoria() + " e tem como profissão " + this.getProfissao());
    }
    
}
