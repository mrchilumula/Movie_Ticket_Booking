package com.example.movie_ticket_booking;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Seat extends BaseModel {
    private String seatNumber;

    private int rowNumber;
    private int columnNumber;
    @ManyToOne
    private SeatType seatType;
}
