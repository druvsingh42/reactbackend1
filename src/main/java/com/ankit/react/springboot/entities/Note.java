package com.ankit.react.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_notes")
@Data
public class Note {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ",schema = "APPS")
	private Long id;
	private String title;
	private String body;
	private String category;

}
