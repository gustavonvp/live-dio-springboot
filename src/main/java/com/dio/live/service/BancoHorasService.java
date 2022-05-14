package com.dio.live.service;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.CategoriaUsuario;
import com.dio.live.repository.BancoHorasRepository;
import com.dio.live.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }

    public BancoHoras saveBancoHoras(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);

    }

    public List<BancoHoras> findAll() {
        return   bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> getById(Long idBancoHoras) {
        return bancoHorasRepository.findById(idBancoHoras);
    }

    public BancoHoras updateBancoHoras(BancoHoras BancoHoras){
        return bancoHorasRepository.save(BancoHoras);

    }

    public void deleteBancoHoras(Long idBancoHoras) {
        bancoHorasRepository.deleteById(idBancoHoras);
    }
}
