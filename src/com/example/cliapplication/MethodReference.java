package com.example.cliapplication;

import com.example.cliapplication.entidades.Usuario;
import com.example.cliapplication.servicos.UsuarioServico;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.Comparator.comparing;

public class MethodReference {
    public static void main(String[] args) {
        List<Usuario> usuarios = UsuarioServico.listUsuarios();

//        Consumer<Usuario> com = Usuario::tornarModerador;
//        usuarios.forEach(com);
//        usuarios.forEach(u -> System.out.println(u.isModerator()));

//        Function<Usuario, String> byName = Usuario::getNome;
//        usuarios.sort(comparing(byName).reversed());
//
//        List<String> arr = Arrays.asList("joao", "jose");
//
//        usuarios.forEach(System.out::println);

        // interface Supplier
        // funciona como uma fabrica, podendo ser reutilizada sempre q desejar uma instanciação
//        Supplier<Usuario> fabricaUsuario = Usuario::new;
//        Usuario novo = fabricaUsuario.get();

//        Function<String, Usuario> criador = Usuario::new;
//        Usuario joao = criador.apply("João Tedooro");
//        Usuario maria = criador.apply("Maria Jose");

        // interface bifunction, cria uma factory para contrutores com dois argumentos
        BiFunction<String, Integer, Usuario> criador = Usuario::new;
        Usuario joao = criador.apply("Joao Teodoro", 140);
        Usuario maria = criador.apply("Maria Jose", 290);


    }
}
