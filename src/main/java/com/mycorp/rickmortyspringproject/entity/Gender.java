package com.mycorp.rickmortyspringproject.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="gender")
@Getter
@Setter
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "state")
    private String genderName;

    @OneToMany(mappedBy="gender", fetch = FetchType.LAZY)
    private Set<Character> characters;
}
