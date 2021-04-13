package com.mycorp.rickmortyspringproject.dao;

import com.mycorp.rickmortyspringproject.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "characters", path ="characters")
public interface CharacterRepository extends JpaRepository<Character, Long> {
}
