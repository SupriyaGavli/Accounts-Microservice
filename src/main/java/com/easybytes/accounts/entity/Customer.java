package com.easybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor
@Entity
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    //@GenericGenerator(name="native", strategy = "native")
    @Column(name="customer_id")
    private Long customerId;

    @Column(name="name")
    private String name;

    private String email;

    private String mobileNumber;
}
