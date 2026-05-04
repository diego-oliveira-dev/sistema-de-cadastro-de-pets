package components;

import enums.PetSexo;
import enums.PetTipo;

public class Pet {
    private String nomeCompleto;
    private PetTipo tipo;
    private PetSexo sexo;
    private String endereco;
    private int idade;
    private double peso;
    private String raca;

    public Pet() {

    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setTipo(PetTipo tipo) {
        this.tipo = tipo;
    }

    public void setSexo(PetSexo sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public PetTipo getTipo() {
        return tipo;
    }

    public PetSexo getSexo() {
        return sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", tipo=" + tipo +
                ", sexo=" + sexo +
                ", endereco='" + endereco + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", raca='" + raca + '\'' +
                '}';
    }
}
