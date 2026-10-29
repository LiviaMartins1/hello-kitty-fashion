import java.util.Scanner;

public class Menu {

    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        Hellokitty kitty = new Hellokitty();
        IO.println("----- Hello Kitty Fashion ----- ");

        IO.println("Escolha uma roupa: ");
        IO.println("1- Vestido vermelho");
        IO.println("2- Blusa e saia");

        int opcao = scanner.nextInt();

        if (opcao == 1){
            kitty.getLook().setRoupa(new Roupa("Vestido", "Vermelho"));
        }else {
            kitty.getLook().setRoupa(new Roupa("Blusa e saia", "Vermelho, Preto"));

        }
        IO.println("Escolha um acessorio: ");
        IO.println("1- Lacinho");
        IO.println("2- Bolsa");

            opcao = scanner.nextInt();
             if ( opcao == 1){
                 kitty.getLook().setAcessorio(new Acessorio("Lacinho"));
             }else {
                 kitty.getLook().setAcessorio(new Acessorio("Bolsa"));

             }

        IO.println("Escolha o sapato: ");
        IO.println("1- Sapato branco");
        IO.println("2- Bota");

        opcao = scanner.nextInt();

        if (opcao == 1){
            kitty.getLook().setSapato(new Sapato("Sapato", "Branco"));
        }else{
            kitty.getLook().setSapato(new Sapato("Bota", "Preta"));
        }
        kitty.mostarLook();
    }

}
