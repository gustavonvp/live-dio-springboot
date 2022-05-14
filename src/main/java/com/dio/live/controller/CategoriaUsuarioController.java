package com.dio.live.controller;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categorias")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario createUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.saveCategoriaUsuario(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getJornadaList(){
        return categoriaUsuarioService.findAll();

    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> getJornadaByID(@PathVariable("idCategoria") Long idCategoria) throws Exception {
        return  ResponseEntity.ok(categoriaUsuarioService.getById(idCategoria).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public CategoriaUsuario updateJornada(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.updateCategoriaUsuarioService(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoria}")
    public ResponseEntity deleteByID(@PathVariable("idCategoria") Long idCategoria) throws Exception {
        try {
            categoriaUsuarioService.deleteCategoriUsuarioService(idCategoria);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();

    }
}
