package org.example.Services;

import org.example.Entity.Edificio;
import org.example.Repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {

    @Autowired
    private EdificioRepository edificioRepository;

    public void saveEdificio(Edificio edificio){
        edificioRepository.save(edificio);
    }

}
