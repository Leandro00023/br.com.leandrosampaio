package br.com.leandrosampaio.service;

import java.util.List;

import br.com.leandrosampaio.domain.Funcionario;


public interface FuncionarioService {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();
}
