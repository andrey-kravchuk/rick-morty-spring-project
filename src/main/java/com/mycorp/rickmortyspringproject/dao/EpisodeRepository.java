package com.mycorp.rickmortyspringproject.dao;

import com.mycorp.rickmortyspringproject.entity.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "episodes", path = "episode")
public interface EpisodeRepository extends JpaRepository<Episode, Long> {
}
