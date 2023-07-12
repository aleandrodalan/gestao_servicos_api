package br.com.dalan.dto;

import java.time.LocalDate;

import br.com.dalan.enums.StatusEnum;
import br.com.dalan.models.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

	private Long id;
	private String login;
	private String senha;
	private String repetirSenha;
	private LocalDate ultimoAcesso;
	private StatusEnum status;
	private Pessoa pessoa;
}