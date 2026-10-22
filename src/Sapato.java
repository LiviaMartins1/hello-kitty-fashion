public class Sapato {
    private String nome;
    private String cor;

    public Sapato(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Sapato" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
