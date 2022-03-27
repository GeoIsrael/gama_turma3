package br.paduan.spring02.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.spring02.dao.ContaCorrenteDAO;
import br.paduan.spring02.model.ContaCorrente;

public class ContaCorrenteController {
    
@RestController
@CrossOrigin("*") // solicitações podem vir de qualuqer origem
public class ProdutoController {

    @Autowired // injeção de dependência: JPA criar a classe e o objeto
    private ContaCorrenteDAO dao;

    @GetMapping("/contascorrentes")
    public ResponseEntity<ArrayList<ContaCorrente>> obterTodasAsContas() {
        ArrayList<ContaCorrente> lista = (ArrayList<ContaCorrente>) dao.findAll();  //lista todos

        if (lista != null) {
            return ResponseEntity.ok(lista); // ok - status 200
        } else {
            return ResponseEntity.notFound().build(); // status 404
        }
    }

    @GetMapping("/contascorrentes/{cod}") // 'id' é o nome do parâmetro
    public ResponseEntity<ContaCorrente> obterContaoPorCodigo(@PathVariable int cod){
        ContaCorrente cc = dao.findById(cod).orElse(null);  //busca o produto pela chave primária

        if (cc != null) {
            return ResponseEntity.ok(cc);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
}
