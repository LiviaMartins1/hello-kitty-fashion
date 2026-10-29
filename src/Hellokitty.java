public class Hellokitty {

    private String nome;
    private Look look;

    public Hellokitty() {
        look = new Look();
    }

    public void vestir(Look look){
        this.look = look;
    }

    public void mostarLook(){
        IO.println("Personagem: Hello Kitty");
        look.exibir();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Look getLook() {
        return look;
    }

    public void setLook(Look look) {
        this.look = look;
    }
}
