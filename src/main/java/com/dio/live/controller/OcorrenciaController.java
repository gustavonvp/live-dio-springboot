package com.dio.live.controller;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.model.JornadaTrabalho;
import com.dio.live.model.Ocorrencia;
import com.dio.live.service.CategoriaUsuarioService;
import com.dio.live.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.saveOcorrencia(ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> getOcorrenciaList(){
        return ocorrenciaService.findAll();

    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<Ocorrencia> getJornadaByID(@PathVariable("idOcorrencia") Long idOcorrencia) throws Exception {
        return  ResponseEntity.ok(ocorrenciaService.getById(idOcorrencia).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.updateOcorrencia(ocorrencia);
    }

    @DeleteMapping("/{idOcorrencia}")
    public ResponseEntity deleteByID(@PathVariable("idOcorrencia") Long idOcorrencia) throws Exception {
        try {
            ocorrenciaService.deleteOcorrencia(idOcorrencia);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Ocorrencia>) ResponseEntity.ok();

    }
}
