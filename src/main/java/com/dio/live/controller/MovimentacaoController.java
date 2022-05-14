package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.model.Localidade;
import com.dio.live.model.Movimentacao;
import com.dio.live.service.LocalidadeService;
import com.dio.live.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {


    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao createLocalidade(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.saveMovimentacao(movimentacao);
    }

    @GetMapping
    public List<Movimentacao> getLocalidadeList(){
        return movimentacaoService.findAll();

    }

    @GetMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> getJornadaByID(@PathVariable("idMovimentacao") Long idMovimentacao) throws Exception {
        return  ResponseEntity.ok(movimentacaoService.getById(idMovimentacao).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Movimentacao updateLocalidade(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.saveMovimentacao(movimentacao);
    }

    @DeleteMapping("/{idMovimentacao}")
    public ResponseEntity deleteByID(@PathVariable("idMovimentacao") Long idMovimentacao) throws Exception {
        try {
            movimentacaoService.deleteMovimentacao(idMovimentacao);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Movimentacao>) ResponseEntity.ok();

    }
}
