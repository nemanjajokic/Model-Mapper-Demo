package io.neca.mapper;

import org.springframework.context.annotation.Configuration;

import io.neca.dto.UcenikDto;
import io.neca.model.Ucenik;

@Configuration
public class UcenikMapper {

	public UcenikDto UcenikToDto(Ucenik ucenik) {
		UcenikDto ucenikDto = new UcenikDto();
		ucenikDto.setBroj(ucenik.getBroj());
		ucenikDto.setIme(ucenik.getIme());
		ucenikDto.setPrezime(ucenik.getPrezime());
		ucenikDto.setSmer(ucenik.getSmer());
		
		return ucenikDto;
	}
	
	public Ucenik dtoToUcenik(UcenikDto ucenikDto) {
		Ucenik ucenik = new Ucenik();
		ucenik.setBroj(ucenikDto.getBroj());
		ucenik.setIme(ucenikDto.getIme());
		ucenik.setPrezime(ucenikDto.getPrezime());
		ucenik.setSmer(ucenikDto.getSmer());
		
		return ucenik;
	}
	
}
