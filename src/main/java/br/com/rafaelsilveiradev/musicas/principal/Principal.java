package br.com.rafaelsilveiradev.musicas.principal;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    

    public void exibeMenu(){
        var opcao = -1;
        while (opcao != 0){
            var menu = """
                1- Cadastrar artistas
                2- Cadastrar músicas
                3- Listar músicas
                4- Buscar músicas por artistas
                5- Pesquisar dados sobre um artista
                
                0- Sair
                """;
        System.out.println(menu);
        opcao = leitura.nextInt();
        leitura.nextLine();

        switch (opcao) {
            case 1:
                
                break;
            case 0:
                System.out.println("Saindo...");
                System.exit(0);
            default:
                System.out.println("Opção Invalida");
        }
        }
    }
}
