package org.example.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "prenotazioni")
@Getter
@Setter
public class Prenotazione {
    @Id
    @GeneratedValue
    @Column(name = "codice_prenotazione")
    private UUID codicePrenotazione;

    @Column(nullable = false)
    private LocalDate dataInizio;

    @Column(nullable = false)
    private LocalDate dataFine;

    @ManyToOne
    @JoinColumn(name = "codice_postazione", nullable = false)
    private Postazione postazione;

    @ManyToOne
    @JoinColumn(name = "codice_utente", nullable = false)
    private Utente utente;

    public Prenotazione(LocalDate dataInizio, LocalDate dataFine, Postazione postazione, Utente utente) {
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.postazione = postazione;
        this.utente = utente;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "codicePrenotazione=" + codicePrenotazione +
                ", dataInizio=" + dataInizio +
                ", dataFine=" + dataFine +
                ", postazione=" + postazione +
                ", utente=" + utente +
                '}';
    }
}
