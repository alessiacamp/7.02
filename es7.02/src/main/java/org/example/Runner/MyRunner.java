package org.example.Runner;



import org.example.Entity.*;
import org.example.Services.EdificioService;
import org.example.Services.PostazioneService;
import org.example.Services.PrenotazioneService;
import org.example.Services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;


@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private UtenteService utentiService;

    @Autowired
    private PrenotazioneService prenotazioniService;

    @Autowired
    private PostazioneService postazioniService;

    @Autowired
    private EdificioService edificiService;

    @Override
    public void run(String... args) throws Exception {

        Utente mario = new Utente("mario_bros", "Mario", "mario@nintendo.com");
        Utente luigi = new Utente("luigi_bros", "Luigi", "luigi@nintendo.com");
        Utente peach = new Utente("princess_peach", "Peach", "peach@nintendo.com");

        Edificio edificio1 = new Edificio("Palazzo Rosso", "Via Roma 10", "Mushroom Kingdom");
        Edificio edificio2 = new Edificio("Castello Blu", "Via Luigi 22", "Luigi's Mansion");

        Postazione postazione1 = new Postazione("Sala Riunioni 1", 3, Tipo.SALARIUNIONI, edificio1);
        Postazione postazione2 = new Postazione("Ufficio Individuale", 1, Tipo.PRIVATO, edificio1);
        Postazione postazione3 = new Postazione("Area Co-working", 10, Tipo.OPENSPACE, edificio2);

        Prenotazione prenotazione1 = new Prenotazione(LocalDate.of(2024, 11, 1), postazione1, mario);
        Prenotazione prenotazione2 = new Prenotazione(LocalDate.of(2024, 11, 2), postazione2, luigi);
        try {
            utentiService.saveUtente(mario);
            utentiService.saveUtente(luigi);
            utentiService.saveUtente(peach);
            edificiService.saveEdificio(edificio1);
            edificiService.saveEdificio(edificio2);
            postazioniService.savePostazione(postazione1);
            postazioniService.savePostazione(postazione2);
            postazioniService.savePostazione(postazione3);
            prenotazioniService.savePrenotazione(prenotazione1);
            prenotazioniService.savePrenotazione(prenotazione2);
            List<Postazione> postazioni = postazioniService.filtraTipoCitta("PRIVATO", "Mushroom Kingdom");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}