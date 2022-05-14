package com.dio.live.service;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.model.Usuario;
import com.dio.live.repository.CategoriaUsuarioRepository;
import com.dio.live.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {


    CategoriaUsuarioRepository categoriaUsuarioRepository;

    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository) {
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    public CategoriaUsuario saveCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);

    }

    public List<CategoriaUsuario> findAll() {
        return   categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> getById(Long idCategoria) {
        return categoriaUsuarioRepository.findById(idCategoria);
    }

    public CategoriaUsuario updateCategoriaUsuarioService(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);

    }

    public void deleteCategoriUsuarioService(Long idCategoria) {
        categoriaUsuarioRepository.deleteById(idCategoria);
    }
}
