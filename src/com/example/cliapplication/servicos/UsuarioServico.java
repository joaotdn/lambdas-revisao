package com.example.cliapplication.servicos;

import com.example.cliapplication.entidades.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioServico {

    public static List<Usuario> listUsuarios() {
        Usuario u1 = new Usuario("joao teodoro", 130);
        Usuario u2 = new Usuario("maria jose", 300);
        Usuario u3 = new Usuario("mario world", 304);

        List<Usuario> list = new ArrayList<>();
        list.add(u2);
        list.add(u3);
        list.add(u1);

        return list;
    }

}
