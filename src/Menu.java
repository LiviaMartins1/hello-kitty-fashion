import java.util.Scanner;

public class Menu {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        Hellokitty kitty = new Hellokitty();
        IO.println("<<<<<<< Hello Kitty Fashion >>>>>>>");
        IO.println("    ");
        IO.println("---------- Roupa ----------");
        IO.println("Escolha uma roupa: ");
        IO.println("1- Vestido vermelho");
        IO.println("2- Blusa e saia");
        IO.println("3 - Vestido rosa");
        IO.println("4 - Vestido azul");
        IO.println("5 - Pijama de gatinho");
        IO.println("6 - Saia e blusa branca");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            kitty.getLook().setRoupa(new Roupa("Vestido", "Vermelho"));
        } else if (opcao == 2) {
            kitty.getLook().setRoupa(new Roupa("Blusa e saia", "Colorida"));
        } else if (opcao == 3) {
            kitty.getLook().setRoupa(new Roupa("Vestido", "Rosa"));
        } else if (opcao == 4) {
            kitty.getLook().setRoupa(new Roupa("Vestido", "Azul"));
        } else if (opcao == 5) {
            kitty.getLook().setRoupa(new Roupa("Pijama de gatinho", "Rosa"));
        } else if (opcao == 6) {
            kitty.getLook().setRoupa(new Roupa("Saia e blusa", "Branca"));
        }

        IO.println("---------- Acessorio ----------");
        IO.println("Escolha um acessorio: ");
        IO.println("1- Lacinho");
        IO.println("2- Bolsa");
        IO.println("3 - Coroa dourada");
        IO.println("4 - Colar de perolas");
        IO.println("5 - Tiara de flores");
        IO.println("6 - Oculos de sol");


        opcao = scanner.nextInt();
        if (opcao == 1) {
            kitty.getLook().setAcessorio(new Acessorio("Lacinho"));
        } else if (opcao == 2) {
            kitty.getLook().setAcessorio(new Acessorio("Bolsa"));
        } else if (opcao == 3) {
            kitty.getLook().setAcessorio(new Acessorio("Coroa"));
        } else if (opcao == 4) {
            kitty.getLook().setAcessorio(new Acessorio("Colar de perolas"));
        } else if (opcao == 5) {
            kitty.getLook().setAcessorio(new Acessorio("Tiara de flores"));
        } else if (opcao == 6) {
            kitty.getLook().setAcessorio(new Acessorio("Oculos de sol"));
        }
            IO.println("---------- Sapato ----------");
            IO.println("Escolha o sapato: ");
            IO.println("1- Sapato branco");
            IO.println("2- Bota");
            IO.println("3 - Tenis rosa");
            IO.println("4 - Sandalia dourada");
            IO.println("5 - Sapatilha vermelha");
            IO.println("6 - Tenis azul");


            opcao = scanner.nextInt();

            if (opcao == 1) {
                kitty.getLook().setSapato(new Sapato("Tamanco", "Branco"));
            } else if (opcao == 2) {
                kitty.getLook().setSapato(new Sapato("Bota", "Preta"));
            } else if (opcao == 3) {
                kitty.getLook().setSapato(new Sapato("Tênis", "Rosa"));
            } else if (opcao == 4) {
                kitty.getLook().setSapato(new Sapato("Sandália", "Dourada"));
            } else if (opcao == 5) {
                kitty.getLook().setSapato(new Sapato("Sapatilha", "Vermelha"));
            } else if (opcao == 6) {
                kitty.getLook().setSapato(new Sapato("Tênis", "Azul"));
            } else {
                IO.println("Opção inválida!");
            }

           kitty.mostarLook();
    }
}
