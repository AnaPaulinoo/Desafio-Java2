public class Produto {
    String nome;
    int preço;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public Produto(String nome, int preço) {
        this.nome = nome;
        this.preço = preço;

    }
}
