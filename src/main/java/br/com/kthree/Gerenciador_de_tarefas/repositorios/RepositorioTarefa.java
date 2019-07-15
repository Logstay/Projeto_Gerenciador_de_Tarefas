package br.com.kthree.Gerenciador_de_tarefas.repositorios;

import br.com.kthree.Gerenciador_de_tarefas.modelos.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepositorioTarefa extends JpaRepository<Tarefa,Long> {

    @Query("SELECT t FROM Tarefa t WHERE t.usuario.email = :emailUsuario")
    List<Tarefa> carregarTarefasPorUsuario(@Param("emailUsuario") String email);
}
