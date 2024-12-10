package com.project.prototype.coreserviceone.service;


import com.project.prototype.coreserviceone.model.Actor;
import com.project.prototype.coreserviceone.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    ActorRepository actorRepository;

    public List<Actor> getAllActors(){
        return actorRepository.findAll();
    }
}
