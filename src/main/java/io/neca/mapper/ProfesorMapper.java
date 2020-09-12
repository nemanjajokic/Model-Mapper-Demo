package io.neca.mapper;

import org.springframework.context.annotation.Configuration;

import io.neca.dto.ProfesorDto;
import io.neca.model.Profesor;

@Configuration
public class ProfesorMapper {

	public ProfesorDto profesorToDto(Profesor profesor) {
		ProfesorDto profesorDto = new ProfesorDto();
		profesorDto.setIme(profesor.getIme());
		profesorDto.setPrezime(profesor.getPrezime());
		profesorDto.setPredmet(profesor.getPredmet());
		
		return profesorDto;
	}
	
	public Profesor dtoToProfesor(ProfesorDto profesorDto) {
		Profesor profesor = new Profesor();
		profesor.setIme(profesorDto.getIme());
		profesor.setPrezime(profesorDto.getPrezime());
		profesor.setPredmet(profesorDto.getPredmet());
		
		return profesor;
	}
	
}
