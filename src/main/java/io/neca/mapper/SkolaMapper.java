package io.neca.mapper;

import org.springframework.context.annotation.Configuration;

import io.neca.dto.SkolaDto;
import io.neca.model.Skola;

@Configuration
public class SkolaMapper {

	public SkolaDto skolaToDto(Skola skola) {
		SkolaDto skolaDto = new SkolaDto();
		skolaDto.setIme(skola.getIme());
		skolaDto.setTip(skola.getTip());
		skolaDto.setMesto(skola.getMesto());
		
		return skolaDto;
	}
	
	public Skola dtoToSkola(SkolaDto skolaDto) {
		Skola skola = new Skola();
		skola.setIme(skolaDto.getIme());
		skola.setTip(skolaDto.getTip());
		skola.setMesto(skolaDto.getMesto());
		
		return skola;
	}
	
}
