package com.mycorp.rickmortyspringproject.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="origin")
@Getter
@Setter
public class Origin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "origin_name")
    private String originName;

    @OneToMany(mappedBy="origin", fetch = FetchType.LAZY)
    private Set<Character> characters;
}
