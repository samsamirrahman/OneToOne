package com;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user44")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
   @Id
   private  int id;
   
   private String name;
  
   @JoinColumn(name = "user_fk",referencedColumnName = "doorNumber")
   @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
   
   private Address address;
	
}
