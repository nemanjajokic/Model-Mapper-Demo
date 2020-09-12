package io.neca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.neca.dto.ProfesorDto;
import io.neca.mapper.ProfesorMapper;
import io.neca.model.Profesor;
import io.neca.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {

	@Autowired
	private ProfesorRepository profesorRepo;
	
	@Autowired
	private ProfesorMapper profesorMapper;
	
	@Override
	public ProfesorDto getProfesor(String ime) {
		Profesor profesor = profesorRepo.getOne(ime);
		return profesorMapper.profesorToDto(profesor);
	}

}
