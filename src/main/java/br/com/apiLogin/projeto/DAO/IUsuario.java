package br.com.apiLogin.projeto.DAO;

import br.com.apiLogin.projeto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
