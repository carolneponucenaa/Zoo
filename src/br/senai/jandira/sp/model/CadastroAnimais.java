package br.senai.jandira.sp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroAnimais {
    Scanner teclado = new Scanner(System.in);
    Animais animais = new Animais();

    public void UsuariosCadastro() {
        System.out.println("-------------- Cadastro De Animais ---------------- ");
        System.out.println("Informe nome do animal: ");
        animais.nome = teclado.nextLine();
        System.out.println("Informe a idade do animal: ");
        animais.idade = teclado.nextInt();
        System.out.println("Informe o sexo do animal: ");
        animais.sexo = teclado.next();
        System.out.println("Informe a identificação: ");
        animais.identificacao= teclado.nextLong();
        System.out.println("--------------- Animal Cadastrado com Sucesso -----------------");
    }

}
