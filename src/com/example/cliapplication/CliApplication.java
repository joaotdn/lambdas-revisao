package com.example.cliapplication;

import com.example.cliapplication.consumers.CustomConsumer;
import com.example.cliapplication.consumers.Mostrador;
import com.example.cliapplication.entidades.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CliApplication {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("joao teodoro", 130);
        Usuario u2 = new Usuario("maria jose", 300);
        Usuario u3 = new Usuario("mario world", 304);

        List<Usuario> list = Arrays.asList(u1, u2, u3);

        // maneira classica de iterar qualquer
        // objeto q implemente Iterable
//        for(Usuario u : list) {
//            System.out.println(u.getNome());
//        }
//
        // utilizando o forEach, q aceita como
        // referencia um classe q implemente a inteface
        // consumer
//        Mostrador m = new Mostrador();
//        list.forEach(m);

        // outra maneira mais simplificada usando lambda
//        Consumer<Usuario> mostrador = (Usuario u) -> System.out.println(u.getNome());
//        Consumer<Usuario> mostrador = u -> {
//            u.setModerator(true);
//            String str = u.isModerator() ? "Moderador" : "Não moderador";
//            System.out.println(u.getNome() + ": " + str);
//        };
//        list.forEach(mostrador);

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 100; i++) {
//                    System.out.println(i);
//                }
//            }
//        };
//        new Thread(r).start();

//        list.forEach(u -> System.out.println(u.getNome()));

//        CustomConsumer<Usuario> usuarios = u -> System.out.println(u.getNome());
//        list.forEach(u -> usuarios.accept(u));

        // Lambda gera uma classe dinamicamente
        // sem gerar um .class no diretorio, para representa-lo

//        Runnable o = () -> {
//            System.out.println("Sou lambda?");
//        };
//
//        System.out.println(o);
//        System.out.println(o.getClass());
//        final int i = 0;
//        list.forEach(u -> System.out.println(i));

        //i = 10; // nao pode ser alterado se estiver dentro de um lambda

        // a interface funcional Consumer
        // possui um metodo default, que compoe
        // a intacia da mesma, usada sequncialmente

//        Consumer<Usuario> msg = u -> System.out.println("Mensagem");
//        Consumer<Usuario> nome = u -> System.out.println(u.getNome());
//        list.forEach(msg.andThen(nome));

        // predicate

        List<Usuario> usuariosList = new ArrayList<>();
        usuariosList.add(u1);
        usuariosList.add(u2);
        usuariosList.add(u3);

        Predicate<Usuario> predicado = u -> u.getPontos() >= 301;

        usuariosList.removeIf(predicado);
        usuariosList.forEach(u -> System.out.println(u.getNome()));
    }
}
