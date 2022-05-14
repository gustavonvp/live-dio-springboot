package com.dio.live.controller;
import com.dio.live.model.NivelAcesso;
import com.dio.live.model.Ocorrencia;
import com.dio.live.service.NivelAcessoService;
import com.dio.live.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@RestController
@RequestMapping("/nivelaccess")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createOcorrencia(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.saveNivelAcesso(nivelAcesso);
    }

    @GetMapping
    public List<NivelAcesso> getOcorrenciaList(){
        return nivelAcessoService.findAll();

    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<NivelAcesso> getJornadaByID(@PathVariable("idNivelAcess") Long idNivelAcess) throws Exception {
        return  ResponseEntity.ok(nivelAcessoService.getById(idNivelAcess).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public NivelAcesso updateOcorrencia(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.updateNivelAcesso(nivelAcesso);
    }

    @DeleteMapping("/{idNivelAcess}")
    public ResponseEntity deleteByID(@PathVariable("idNivelAcess") Long idNivelAcess) throws Exception {
        try {
            nivelAcessoService.deleteNivelAcesso(idNivelAcess);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();

    }
}
