package com.mycorp.rickmortyspringproject.dao;

import com.mycorp.rickmortyspringproject.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "genders", path = "gender")
public interface GenderRepository extends JpaRepository<Gender, Long> {
}
