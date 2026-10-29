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

        IO.println("================================");
        IO.println("----- HELLO KITTY FASHION -----");
        IO.println("================================");
        IO.println("----- SEU LOOK ESCOLHIDO -----");
        IO.println("Roupa: " + roupa.getNome());
        IO.println("Acessório:" + acessorio.getNome());
        IO.println("Sapato: " +sapato.getNome());
        IO.println("================================");
        IO.println("--- Look montado com sucesso ---");
        IO.println("================================%n");
    }

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }

    public Roupa getRoupa() {
        return roupa;
    }

    public void setRoupa(Roupa roupa) {
        this.roupa = roupa;
    }

    public Sapato getSapato() {
        return sapato;
    }

    public void setSapato(Sapato sapato) {
        this.sapato = sapato;
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
