package br.com.digitalhouse;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa tairo = new Pessoa("Tairo", "Roberto", 30);
        Pessoa jessica = new Pessoa("Jessica", "Milena", 18);
        Pessoa vini = new Pessoa("Vini", "PHP", 35);

        pessoas.add(tairo);
        pessoas.add(jessica);
        pessoas.add(vini);

        //  for (Pessoa pessoa : pessoas) {
        //     System.out.println("Nome: " + pessoa.getNome() + " Sobrenome: " + pessoa.getSobreNome() + "\n");
        //   }
        //}*/

        Set<Pessoa> pessoaSet = new HashSet<>();
        pessoaSet.add(tairo);
        pessoaSet.add(jessica);
        pessoaSet.add(vini);
        pessoaSet.add(vini);
        pessoaSet.add(vini);


        // for (Pessoa pessoa: pessoaSet){
        // System.out.println ("Nome + pessoa.getNome

        Map<String, Pessoa> pessoaMap = new HashMap<>();
        pessoaMap.put("tairo",tairo);
        pessoaMap.put("jessica",jessica);
        pessoaMap.put("vini",vini);

        for (String chave : pessoaMap.keySet()){
            System.out.println("Nome: " + pessoaMap.get(chave).getNome()  + " \nSobrenome: " + pessoaMap.get(chave).getSobreNome() + "\n");
        }

        //loteria dos sonhos exerc1 aula 9
        Map<Integer,String> loteriaDosSonhos = new HashMap<>();
        loteriaDosSonhos.put(0,"Ovos");
        loteriaDosSonhos.put(1,"Agua");
        loteriaDosSonhos.put(2,"Escopeta");
        loteriaDosSonhos.put(3,"Cavalo");
        loteriaDosSonhos.put(4,"Dentista");
        loteriaDosSonhos.put(5,"Fogo");

        for (int chave : loteriaDosSonhos.keySet()){
            System.out.println("Valor da loteria: " + loteriaDosSonhos.get(chave)) ;
        }

        // exercicio 2 item 3
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);
        for (Integer list : lista) {
            System.out.println(list);
        }
        // exercicio 2 item 4

        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(8);
        conjunto.add(8);

        for (Integer conjuntos : conjunto) {
            System.out.println(conjuntos);
        }
    }
}
