package com.example.cliapplication.consumers;

import com.example.cliapplication.entidades.Usuario;

import java.util.function.Consumer;

public class Mostrador implements Consumer<Usuario> {

    /**
     * a interface Consumer possui apenas um metodo
     * accpt, responsavel por pegar um objeto o consumi-lo.
     * @param usuario
     */

    @Override
    public void accept(Usuario usuario) {
        System.out.println(usuario.getNome());
    }
}
