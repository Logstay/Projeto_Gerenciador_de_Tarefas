package br.com.kthree.Gerenciador_de_tarefas.serviços;

import br.com.kthree.Gerenciador_de_tarefas.modelos.Usuario;
import br.com.kthree.Gerenciador_de_tarefas.repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ServicoUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public Usuario procurarPorEmail(String email){
        return repositorioUsuario.findByEmail(email);

    }

    public void salvar(Usuario usuario){
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        repositorioUsuario.save(usuario);

    }
}
