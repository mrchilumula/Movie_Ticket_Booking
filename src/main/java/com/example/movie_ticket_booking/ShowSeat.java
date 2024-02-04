package com.example.movie_ticket_booking;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Shows show;
    @ManyToOne
    private Seats seat;
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus seatStatus;
    private String seatType;
    private int price;
}
