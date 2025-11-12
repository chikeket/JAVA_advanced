package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/* ORM */
//toString 넣으면 안됨 오류남 그래서 @Data 쓰면 안됨

@DynamicUpdate
@NoArgsConstructor
@Getter
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column(length = 20, nullable = false)
	String name;
	String phone;
	
	String email;	
	
	@Temporal(TemporalType.TIMESTAMP)
	LocalDateTime regdate;

	
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
//	@JoinColumn(name = "address_id")
	List<Address> address = new ArrayList<Address>();
	
	@Builder
	public Customer(String name, String phone, String email, Address address) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address.add(address);
	}
	
	public void updateNameAndEmail(String name, String email) {
		this.name = name;
		this.email = email;
	}
}
