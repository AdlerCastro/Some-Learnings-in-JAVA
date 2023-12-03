package questao.pkg1;

//Superclasse abstrata responsável pela criação das subclasses utilizando da mesma estrutura
abstract public class Pessoa {
    //Atributos da classe
    private double peso; //peso em kg
    private double altura; //altura em metros
    private String profissao;
    
    public Pessoa(){
        this.peso = 0.0;
        this.altura = 0.0;
        this.profissao = "Nao definido";
    }
    
    public Pessoa(double peso, double altura, String profissao){
        this.peso = peso;
        this.altura = altura;
        this.profissao = profissao;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        if(peso > 0 && peso < 0.6){
            this.peso = peso;
            System.out.println("Peso Atualizada para: "+ peso);
        }else{
            System.out.println("\nO peso minímo é de 600 gramas (0.6 kg)");
        }
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if(0 < altura && altura < 3){
            this.altura = altura;
            System.out.println("Altura Atualizada para: "+ altura);
        }
        else if(0 >= altura){
            System.out.println("\nA altura mínima é maior que 0");
        }
        else{
            System.out.println("A altura máxima é de 3 metros");
        }
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        if(profissao.length() >= 3){
            this.profissao = profissao;
            System.out.println("Profissão Atualizada para: "+ profissao);
        }else{
            System.out.println("\nEscreva uma profissão de pelo menos 3 letras");
        }
    }  
    
}
