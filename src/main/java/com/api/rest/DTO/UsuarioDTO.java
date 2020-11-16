package com.api.rest.DTO;

import com.api.rest.model.Usuario;
import lombok.*;

@Getter
@Setter
public class UsuarioDTO {
	
	private String nome;
	private String email;
	
	public UsuarioDTO() {}
	
	public UsuarioDTO(Usuario usuario) {
		
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
	}

	
	

}
