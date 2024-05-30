package com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name = "address44")
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    int doorNumber;
	private String city;
	private	String state;
	private String country;
	
}
