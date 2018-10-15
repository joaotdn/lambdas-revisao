package com.example.cliapplication;

import com.example.cliapplication.entidades.Usuario;
import com.example.cliapplication.servicos.UsuarioServico;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        BiFunction<String, Integer, Usuario> creator = Usuario::new;
        Usuario joao = creator.apply("Joao Teodoro", 150);
        Usuario maria = creator.apply("Maria Clara", 120);
        Usuario jose = creator.apply("Jose Dantas", 90);

        List<Usuario> usuarios = Arrays.asList(joao, jose, maria);

//        usuarios
//                .stream()
//                .filter(u -> u.getPontos() > 100)
//                .forEach(System.out::println);
//
//        List<Integer> in = usuarios
//                .stream()
//                .map(Usuario::getPontos)
//                .collect(Collectors.toList());
//
//        in.forEach(System.out::println);

        Stream<Integer> stream = usuarios.stream()
                .map(Usuario::getPontos);

        System.out.println(stream);
    }
}
