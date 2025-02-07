package org.example.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "postazioni")
@Getter
@Setter
@NoArgsConstructor
public class Postazione {
    @Id
    @GeneratedValue
    @Column(name = "codice_postazione")

    private UUID codicePostazione;

    @Column(nullable = false)
    private String descrizione;

    @Column(nullable = false)
    private int occupanti;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "codice_edificio", nullable = false)
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazione;

    public Postazione(String descrizione, int occupanti, Tipo tipo, Edificio edificio) {
        this.edificio = edificio;
        this.descrizione = descrizione;
        this.occupanti = occupanti;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Postazione{" +
                "codicePostazione=" + codicePostazione +
                ", descrizione='" + descrizione + '\'' +
                ", occupanti=" + occupanti +
                ", tipo=" + tipo +
                ", edificio=" + edificio +
                ", prenotazione=" + prenotazione +
                '}';
    }
}
