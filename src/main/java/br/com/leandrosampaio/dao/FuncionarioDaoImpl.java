package br.com.leandrosampaio.dao;

import org.springframework.stereotype.Repository;

import br.com.leandrosampaio.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}