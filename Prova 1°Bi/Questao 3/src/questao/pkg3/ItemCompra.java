package questao.pkg3;

public class ItemCompra {
    private String nome;
    private int quantidade;
    private float preco;

    public ItemCompra(){
        this.nome = "Não definido";
        this.preco = 0;
        this.quantidade = 0;
    }

    public ItemCompra(String nome, int quantidade, float preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public float calcularTotal(){
        return this.quantidade * this.preco;
    }
    
    public void adicionarDesconto(float desconto){
        if(0 < desconto && desconto < 50){
            this.preco -= (desconto/100) * this.preco;
        }
        else{
            System.out.println("O gerente ta maluco");
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() > 0){
            this.nome = nome;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if(preco > 0){
            this.preco = preco;
        }
        
    }
    
    
}
