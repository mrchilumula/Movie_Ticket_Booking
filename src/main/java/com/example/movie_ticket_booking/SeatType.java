package com.example.movie_ticket_booking;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SeatType extends  BaseModel{
    private String seatType;
    private int price;
}
