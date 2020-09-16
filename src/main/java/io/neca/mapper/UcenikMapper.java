package io.neca.mapper;

import org.springframework.context.annotation.Configuration;

import io.neca.dto.UcenikDto;
import io.neca.model.Ucenik;

@Configuration
public class UcenikMapper {
	
	public UcenikDto UcenikToDto(Ucenik ucenik) {
		UcenikDto ucenikDto = new UcenikDto();
		if(ucenik.getBroj() != 0) ucenikDto.setBroj(ucenik.getBroj());
		if(ucenik.getIme() != null) ucenikDto.setIme(ucenik.getIme());
		if(ucenik.getPrezime() != null) ucenikDto.setPrezime(ucenik.getPrezime());
		if(ucenik.getSmer() != 0) ucenikDto.setSmer(ucenik.getSmer());
		if(ucenik.getSkola() != null) ucenikDto.setSkola(ucenik.getSkola());
		
		return ucenikDto;
	}
	
	public Ucenik dtoToUcenik(UcenikDto ucenikDto) {
		Ucenik ucenik = new Ucenik();
		if(ucenikDto.getBroj() != 0) ucenik.setBroj(ucenikDto.getBroj());
		if(ucenikDto.getIme() != null) ucenik.setIme(ucenikDto.getIme());
		if(ucenikDto.getPrezime() != null)ucenik.setPrezime(ucenikDto.getPrezime());
		if(ucenikDto.getSmer() != 0) ucenik.setSmer(ucenikDto.getSmer());
		if(ucenikDto.getSkola() != null) ucenik.setSkola(ucenikDto.getSkola());
		
		return ucenik;
	}
	
}
