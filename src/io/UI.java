package io;

public class UI {
    public static void mostrarMenuInicial() {
        System.out.println("========= MENU =========");
        System.out.println("""
                1. Cadastrar um novo pet
                2. Alterar os dados do pet cadastrado
                3. Deletar um pet cadastrado
                4. Listar todos os pets cadastrados
                5. Listar pets por algum critério (idade, nome, raça)
                6. Sair""");
        System.out.println("========================");
        System.out.print("Qual sua escolha? ");
    }

    public static void mostrarFormularioDeCadastro() {
        System.out.println();
        System.out.println("FORMULÁRIO DE CADASTRO");
        System.out.println("Responda às perguntas abaixo:");
    }

    public static void mostrarPergunta(String pergunta) {
        System.out.print(pergunta + " ");
    }
}
