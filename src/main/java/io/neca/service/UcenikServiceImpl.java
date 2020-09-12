package io.neca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.neca.dto.UcenikDto;
import io.neca.mapper.UcenikMapper;
import io.neca.model.Ucenik;
import io.neca.repository.UcenikRepository;

@Service
public class UcenikServiceImpl implements UcenikService {

	@Autowired
	UcenikRepository ucenikRepo;
	
	@Autowired
	UcenikMapper ucenikMapper;
	
	@Override
	public UcenikDto getUcenik(int broj) {
		Ucenik ucenik = ucenikRepo.getOne(broj);
		return ucenikMapper.UcenikToDto(ucenik);
	}

	@Override
	public List<UcenikDto> getAll() {
		List<Ucenik> ucenici = ucenikRepo.findAll();
		List<UcenikDto> uceniciDto = new ArrayList<>();
		
		for(Ucenik u : ucenici) {
			uceniciDto.add(ucenikMapper.UcenikToDto(u));
		}
			
		return uceniciDto;
	}

}
