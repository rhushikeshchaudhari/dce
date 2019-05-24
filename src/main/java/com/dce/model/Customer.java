package com.dce.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@DynamicInsert
@SelectBeforeUpdate
@DynamicUpdate
@Table(name = "customer")
public class Customer {
	@Id
	private Long accountNo;
	
	@Column(nullable=false)
	private String firstName;
	
	private String middleName;

	@Column(nullable=false)
	private String lastName;
	
	@Column(nullable=false)
	private LocalDate dateOfBirth;
	
	private String designation;
	
	@Column(nullable=false)
	private String department;
	
	@Column(nullable=false)
	private String section;
	
	private Double monthlySalary;
	
	@Column(nullable=false)
	private String residentialAddress;
	
	@Column(nullable=false)
	private String homeAddress;
	
	@Column(nullable=false)
	private String mobileNo;
	
	private String email;
	
	private LocalDate dateOfAppointment;
	
	@Column(nullable=false)
	private LocalDate dateOfMembership;
	
	private LocalDate dateOfResign;
	
	@Column(nullable=false)
	private String nomineeName;
	
	@Column(nullable=false)
	private String nomineeRel;
	
	@OneToOne
	private Customer recommendedBy;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	
	
}
