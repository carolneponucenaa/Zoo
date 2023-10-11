package br.senai.jandira.sp.model;

public class Animais {
    public String nome, sexo;
    public int idade;
    public long identificacao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(long identificacao) {
        this.identificacao = identificacao;
    }
}