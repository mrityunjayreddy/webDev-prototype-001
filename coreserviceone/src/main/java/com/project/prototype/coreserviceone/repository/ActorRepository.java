package com.project.prototype.coreserviceone.repository;

import com.project.prototype.coreserviceone.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ActorRepository extends JpaRepository<Actor, UUID> {
}
