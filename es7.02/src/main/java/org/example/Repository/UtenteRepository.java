package org.example.Repository;

import org.example.Entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UtenteRepository extends JpaRepository <Utente, UUID> {
}
