package br.com.leandrosampaio.dao;

import java.util.List;

import br.com.leandrosampaio.domain.Departamento;

	public interface DepartamentoDao {

	    void save(Departamento departamento);

	    void update(Departamento departamento);

	    void delete(Long id);

	    Departamento findById(Long id);

	    List<Departamento> findAll();
}