package io;

import entities.Pet;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ManipuladorDeArquivos {
    public static List<String> lerFormularioDeCadastro() {
        List<String> perguntas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("formulario.txt"))) {
            String line = br.readLine();
            while (line != null) {
                perguntas.add(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return perguntas;
    }

    public static File criarArquivo(Pet pet) {
        File directory = new File("src/petsCadastrados");
        if (!directory.exists()) {
            directory.mkdirs();
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'-HHmm");
        LocalDateTime now = LocalDateTime.now();
        String formattedTime = now.format(formatter);
        String formattedName = pet.getNomeCompleto().replaceAll("(\\s)", "").toUpperCase();
        String fileName = formattedTime + formattedName + ".TXT";
        return new File(directory, fileName);
    }

    public static boolean salvarDadosNoArquivo(File file, List<String> dados) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            for (int i = 0; i < dados.size(); i++) {
                bw.write((i + 1) + " - " + dados.get(i));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
