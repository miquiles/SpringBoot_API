package com.api.rest.model;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Data
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 50)
	private String nome;
	@Column(nullable = false, length = 50)
	private String email;
	@Column(nullable = false, length = 20)
	private String senha;
	@Column(nullable = false)
	private boolean admin =  false;


}
