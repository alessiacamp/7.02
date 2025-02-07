package org.example.Services;


import org.example.Entity.Postazione;

import org.example.Repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {
    @Autowired
    private PostazioneRepository postazioneRepository;

    public void savePostazione( Postazione postazione){
        postazioneRepository.save(postazione);
    }
}
