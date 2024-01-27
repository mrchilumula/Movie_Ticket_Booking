package com.example.movie_ticket_booking;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Movie extends BaseModel{
    private String name;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Language> languages;


}
