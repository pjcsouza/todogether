package com.todogether.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioForm {
	
	@NotBlank(message = "O nome precisa ser preenchido.")
	@Size(min = 3, max = 50, message = "Nome precisa conter entre {min} e {max} caracteres.")
	private String nome;
	
	@NotBlank(message = "O campo email precisa ser preenchido.")
	@Email(message = "O email '${validatedValue}' é inválido.")
	private String email;

}
