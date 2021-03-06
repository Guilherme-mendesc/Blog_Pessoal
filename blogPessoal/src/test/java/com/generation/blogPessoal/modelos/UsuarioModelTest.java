package com.generation.blogPessoal.modelos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.generation.blogPessoal.model.Usuario;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UsuarioModelTest {
	
	public Usuario usuario;
	
	@Autowired
	private final Validator validator = Validation.buildDefaultValidatorFactory()
	.getValidator();
	

	
	@Test
	void validacaoDosAtributos() { 
		Set<ConstraintViolation<Usuario>> falhas = validator.validate(usuario);
		assertTrue(falhas.isEmpty());
	}
	
	

}
