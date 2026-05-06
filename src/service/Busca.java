package service;

import io.ManipuladorDeArquivos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Busca {

    public static void listarPets() {
        ManipuladorDeArquivos fileHandler = new ManipuladorDeArquivos();
        File[] arquivos = fileHandler.coletarDadosCadastrados();
        // manuseio de arquivo + logica + output = ManipuladorDeArquivos + Busca + UI
        List<String> lista = new ArrayList<>();
        for (int i = 0; i < arquivos.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append((i + 1) + ". ");
            String item = fileHandler.coletarItemDaLista(arquivos[i], sb);
            lista.add(item);
        }
        lista.forEach(System.out::println);
    }
}
