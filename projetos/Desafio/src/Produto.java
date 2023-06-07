public class Produto {
    String nome;
    String codigo;
    int preço;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public Produto(String nome, String codigo, int preço) {
        this.nome = nome;
        this.codigo = codigo;
        this.preço = preço;
    }
}