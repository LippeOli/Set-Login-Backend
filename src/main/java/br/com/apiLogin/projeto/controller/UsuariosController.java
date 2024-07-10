package br.com.apiLogin.projeto.controller;

import java.util.List;

import br.com.apiLogin.projeto.DAO.IUsuario;
import br.com.apiLogin.projeto.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {

    @Autowired
    private IUsuario dao;

    @GetMapping("/usuarios")
    public List<Usuario> listaUsuarios() {
        return (List<Usuario>) dao.findAll();
    }

}
