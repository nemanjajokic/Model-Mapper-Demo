package io.neca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.neca.dto.SkolaDto;
import io.neca.mapper.SkolaMapper;
import io.neca.model.Skola;
import io.neca.repository.SkolaRepository;

@Service
public class SkolaServiceImpl implements SkolaService {

	@Autowired
	SkolaRepository skolaRepo;
	
	@Autowired
	SkolaMapper skolaMapper;
	
	@Override
	public SkolaDto getSkola(String ime) {
		Skola skola = skolaRepo.getOne(ime);
		return skolaMapper.skolaToDto(skola);
	}

}
