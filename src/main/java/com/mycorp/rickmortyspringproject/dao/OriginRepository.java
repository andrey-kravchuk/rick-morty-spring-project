package com.mycorp.rickmortyspringproject.dao;

import com.mycorp.rickmortyspringproject.entity.Origin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "origins", path = "origin")
public interface OriginRepository extends JpaRepository<Origin, Long> {
}
