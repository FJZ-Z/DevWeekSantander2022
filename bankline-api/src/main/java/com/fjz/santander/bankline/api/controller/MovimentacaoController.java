package com.fjz.santander.bankline.api.controller;

import com.fjz.santander.bankline.api.dto.NovaMovimentacao;
import com.fjz.santander.bankline.api.model.Movimentacao;
import com.fjz.santander.bankline.api.repository.MovimentacaoRepository;
import com.fjz.santander.bankline.api.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
    @Autowired
    private MovimentacaoRepository repository;
    @Autowired
    private MovimentacaoService service;
    @GetMapping
    public List<Movimentacao> findAll(){
        return repository.findAll();
    }
    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao){
        service.save(movimentacao);
    }
}
