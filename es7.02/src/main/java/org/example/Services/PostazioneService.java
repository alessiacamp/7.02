package org.example.Services;


import org.example.Entity.Postazione;

import org.example.Entity.Tipo;
import org.example.Repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {
    @Autowired
    private PostazioneRepository postazioneRepository;

    public List<Postazione> filtraTipoCitta(String tipo, String citta){
        List <Postazione> postazione = postazioneRepository.findByTipoAndEdificio_Citta(Tipo.valueOf(tipo), citta);
        return postazione;
    }

    public void savePostazione( Postazione postazione){
        postazioneRepository.save(postazione);
    }
}
