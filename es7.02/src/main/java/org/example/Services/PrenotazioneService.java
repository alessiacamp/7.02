package org.example.Services;


import org.example.Entity.Postazione;
import org.example.Entity.Prenotazione;

import org.example.Entity.Tipo;
import org.example.Entity.Utente;
import org.example.Repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public void savePrenotazione(Prenotazione prenotazione) {
        prenotazioneRepository.save(prenotazione);
    }

    public List<Prenotazione> filtraUtente(Utente utente, LocalDate data) {
        List<Prenotazione> prenotazione = prenotazioneRepository.findByUtenteAndDataInizio(utente, data);
        return prenotazione;
    }

    public List<Prenotazione> filtraPostazione (Postazione postazione, LocalDate data){
        List<Prenotazione> prenotazione = prenotazioneRepository.findByPostazioneAndDataInizio(postazione, data);
        return prenotazione;
    }

}

