public class Roupa {
    private String nome;
    private String cor;

    public Roupa(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Roupa" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
