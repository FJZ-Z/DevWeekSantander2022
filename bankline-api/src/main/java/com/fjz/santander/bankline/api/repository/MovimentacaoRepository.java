package com.fjz.santander.bankline.api.repository;

import com.fjz.santander.bankline.api.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao,Integer> {
}
