package org.example.account.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    private String name;
    private String email;
    private String phone;
    private OffsetDateTime creationDate;
    @ElementCollection
    private List<Long> bills;

    public Account(final String name,
                   final String email,
                   final String phone,
                   final OffsetDateTime creationDate,
                   final List<Long> bills) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.creationDate = creationDate;
        this.bills = bills;
    }

}
