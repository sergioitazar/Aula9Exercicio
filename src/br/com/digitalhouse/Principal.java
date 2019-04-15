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
    }
}