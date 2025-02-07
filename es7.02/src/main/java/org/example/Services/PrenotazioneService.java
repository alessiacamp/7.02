package org.example.Services;


import org.example.Entity.Prenotazione;

import org.example.Repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public void savePrenotazione(Prenotazione prenotazione){
        prenotazioneRepository.save(prenotazione);
    }
}
