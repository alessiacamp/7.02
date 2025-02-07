package org.example.Repository;

import org.example.Entity.Postazione;
import org.example.Entity.Prenotazione;
import org.example.Entity.Tipo;
import org.example.Entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface PrenotazioneRepository extends JpaRepository <Prenotazione, UUID> {
    List<Prenotazione> findByUtenteAndDataInizio(Utente utente, LocalDate dataInizio);
    List<Prenotazione> findByPostazioneAndDataInizio(Postazione postazione, LocalDate dataInizio);

}
