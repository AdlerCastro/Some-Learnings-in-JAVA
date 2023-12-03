package questao.pkg1;

//Subclasse
public class Vilao extends Pessoa implements Status {
    //Atributos da classe
    private String criatura;

    public Vilao(){
        this.criatura = "NaoDefinida";
        System.out.println("\nOnde existe luz, também haverá sombras. Assim, surge uma nova criatura das trevas!!");
    }

    public Vilao(String criatura, double peso, double altura, String profissao) {
        super(peso, altura, profissao);
        this.criatura = criatura;
    }

    public String getCriatura() {
        return this.criatura;
    }

    public void setCriatura(String criatura) {
        
        if(criatura.length() >= 3){
            this.criatura = criatura;
            System.out.println("Criatura atualizada para: "+ criatura);
        }else{
            System.out.println("\nEscreva uma criatura de pelo menos 3 letras");
        }
    }

    //Métodos implementados da interface
    @Override
    public void escreverStatus() {
        System.out.println("\nA criatura tem " + this.getPeso() + "de peso, altura de " + this.getAltura() + " e seu tipo é " + this.getCriatura());
    }
    
}
