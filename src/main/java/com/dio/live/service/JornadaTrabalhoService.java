package com.dio.live.service;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    JornadaTrabalhoRepository jornadaRepository;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornadaTrabalho(JornadaTrabalho jornadaTrabalho){
       return jornadaRepository.save(jornadaTrabalho);

    }

    public List<JornadaTrabalho> findAll() {
       return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public JornadaTrabalho updateJornadaTrabalho(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }

    public void deleteJornadaTrabalho(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
}
