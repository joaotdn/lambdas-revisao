package com.example.cliapplication;

import com.example.cliapplication.entidades.Usuario;
import com.example.cliapplication.servicos.UsuarioServico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {

    public static void main(String[] args) {

        UsuarioServico servico = new UsuarioServico();

//        Comparator<Usuario> comparator = new Comparator<Usuario>() {
//            @Override
//            public int compare(Usuario o1, Usuario o2) {
//                return o1.getNome().compareTo(o2.getNome());
//            }
//        };

        // declarando tirando proveito da interface funcional
//        Comparator<Usuario> comparator = (u1, u2) -> u1.getNome().compareTo(u2.getNome());


        List<Usuario> usuarios = servico.listUsuarios();
//        Collections.sort(usuarios, comparator);
        // foi adicionado a interface list o metodo default sort
//        que recebe um comparator como argumento
//        usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
//        utilizando o metodo estatico da interface comparator
        Comparator<Usuario> comparator = Comparator.comparing(u -> u.getNome());
        usuarios.forEach(u -> System.out.println(u.getNome()));
        System.out.println("=======");
        usuarios.sort(comparator);
        usuarios.forEach(u -> System.out.println(u.getNome()));


    }

}
