package br.com.apiLogin.projeto.controller;

import java.util.List;
import java.util.Optional;

import br.com.apiLogin.projeto.DAO.IUsuario;
import br.com.apiLogin.projeto.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private IUsuario dao;

    @GetMapping
    public List<Usuario> listaUsuarios() {
        return (List<Usuario>) dao.findAll();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        Usuario novoUsuario = dao.save(usuario);
        return novoUsuario;
    }

    @PutMapping
    public Usuario editar(@RequestBody Usuario usuario) {
        Usuario novoUsuario = dao.save(usuario);
        return novoUsuario;
    }

    @DeleteMapping("/{id}")
    public Optional<Usuario> excluirUsuario(@PathVariable Integer id){
        Optional<Usuario> usuario = dao.findById(id);
        dao.deleteById(id);
        return usuario;
    }


}
