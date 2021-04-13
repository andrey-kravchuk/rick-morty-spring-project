package com.mycorp.rickmortyspringproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="app_character")
@Getter
@Setter
@NoArgsConstructor
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "character_name")
    private String characterName;

    @ManyToOne
    @JoinColumn(name = "gender_id", nullable = false)
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "origin_id", nullable = false)
    private Origin origin;

    @ManyToOne
    @JoinColumn(name = "episode_id", nullable = false)
    private Episode episode;
}
