package com.example.movie_ticket_booking;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter@Getter
@Entity
public class Ticket extends     BaseModel {
    private int amount;
    private Date timeOfBooking;

    @ManyToMany
    private List<Seat> seats;

    @ManyToOne
    private User bookedBy;

    @ManyToOne
    private Show show;

    @OneToMany(mappedBy = "ticket")
    private List<Payment> payments;

    @Enumerated(EnumType.ORDINAL)
    private TicketStatus status;
}

