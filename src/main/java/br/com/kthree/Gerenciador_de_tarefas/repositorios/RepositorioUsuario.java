package br.com.kthree.Gerenciador_de_tarefas.repositorios;

import br.com.kthree.Gerenciador_de_tarefas.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario , Long> {

    Usuario findByEmail(String email);
}
