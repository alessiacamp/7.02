package org.example.Repository;

import org.example.Entity.Postazione;
import org.example.Entity.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, UUID> {

    List<Postazione> findByTipoAndEdificio_Citta(Tipo tipo, String citta);

}
