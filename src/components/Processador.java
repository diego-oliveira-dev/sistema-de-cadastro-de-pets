package components;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Processador {

    public static void cadastrarPet() {
        System.out.println();
        System.out.println("FORMULÁRIO DE CADASTRO");
        System.out.println("Responda às perguntas abaixo:");

        try (BufferedReader br = new BufferedReader(new FileReader("formulario.txt"))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println();
        System.out.println("Processando cadastro do seu pet");
    }
}
