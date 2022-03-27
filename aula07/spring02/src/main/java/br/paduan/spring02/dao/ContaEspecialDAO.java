package br.paduan.spring02.dao;

import org.springframework.data.repository.CrudRepository;

import br.paduan.spring02.model.ContaEspecial;

public interface ContaEspecialDAO extends CrudRepository<ContaEspecial, Integer>{
    
}
