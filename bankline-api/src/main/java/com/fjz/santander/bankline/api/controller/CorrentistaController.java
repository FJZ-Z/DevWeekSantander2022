package com.fjz.santander.bankline.api.controller;

import com.fjz.santander.bankline.api.dto.NovoCorrentista;
import com.fjz.santander.bankline.api.model.Correntista;
import com.fjz.santander.bankline.api.repository.CorrentistaRepository;
import com.fjz.santander.bankline.api.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
    @Autowired
    private CorrentistaRepository repository;
    @Autowired
    private CorrentistaService service;
    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();
    }
    @PostMapping
    public void save(@RequestBody NovoCorrentista correntista){
        service.save(correntista);
    }
}
