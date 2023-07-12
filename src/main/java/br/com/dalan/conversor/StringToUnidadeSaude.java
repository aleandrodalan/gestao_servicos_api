package br.com.dalan.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.dalan.models.UnidadeSaude;
import br.com.dalan.services.impl.UnidadeSaudeServiceImpl;

@Component
public class StringToUnidadeSaude implements Converter<String, UnidadeSaude> {

	@Autowired
	private UnidadeSaudeServiceImpl unidadeSaudeService;

	@Override
	public UnidadeSaude convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		
		Long id = Long.valueOf(text);
		return unidadeSaudeService.buscarPorId(id);
	}
}