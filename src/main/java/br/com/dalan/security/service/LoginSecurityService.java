package br.com.dalan.security.service;

import br.com.dalan.exception.SenhaInvalidaException;
import br.com.dalan.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginSecurityService {

	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private UsuarioSecurityDetailsService usuarioDetailsService;
	
	public UserDetails autenticar(Usuario usuario) {
		UserDetails user = usuarioDetailsService.loadUserByUsername(usuario.getLogin());
		boolean senhasBatem =
				encoder.matches(usuario.getSenha(), user.getPassword());
		
		if (senhasBatem) {
			return user;
		}
		
		throw new SenhaInvalidaException();
	}
}