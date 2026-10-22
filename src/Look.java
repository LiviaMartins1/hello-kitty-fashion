public class Look {

    private Acessorio acessorio;
    private Roupa roupa;
    private Sapato sapato;

    public void trocarRoupa(Roupa roupa){
        this.roupa = roupa;
    }

    public void trocarAcessorio(Acessorio acessorio){
        this.acessorio = acessorio;
    }

    public void trocarSapato(Sapato sapato){
        this.sapato = sapato;
    }

    public void exibir() {
        IO.println("--- Look da Hello Kitty --- ");
        IO.println("Roupa: " + roupa);
        IO.println("Acessório: " + acessorio);
        IO.println("Sapato: " + sapato);
    }

    @Override
    public String toString() {
        return "Look" +
                "acessorio=" + acessorio +
                ", roupa=" + roupa +
                ", sapato=" + sapato +
                '}';
    }
}
