package io.neca.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.neca.dto.UcenikDto;
import io.neca.exception.UcenikNotFoundException;
import io.neca.mapper.UcenikMapper;
import io.neca.model.Ucenik;
import io.neca.model.UcenikType;
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
		return ucenici.stream().map(u -> ucenikMapper.UcenikToDto(u)).collect(Collectors.toList());
	}
	
	@Override
	public List<UcenikDto> poslednjihPet() {
		List<Ucenik> ucenici = ucenikRepo.getlastFive();
		List<UcenikDto> uceniciDto = new ArrayList<>();
		
		for(Ucenik u : ucenici) uceniciDto.add(ucenikMapper.UcenikToDto(u));
		
		return uceniciDto;
	}

	@Override
	public List<UcenikType> najnoviji() {
		return ucenikRepo.getlastFive2();
	}

	@Override
	public void addUcenik(Ucenik ucenik) {
		ucenikRepo.save(ucenik);
	}

	@Override
	public Ucenik findUcenikByID(int id) {
		Optional<Ucenik> optional = ucenikRepo.findById(id);
		Ucenik ucenik = null;
		if(optional.isPresent()) {
			ucenik = optional.get();
		} else {
			throw new UcenikNotFoundException("ucenik sa id-ijem: " + id + "nije prodadjen");
		}
		
		return ucenik;
	}
	
	@Override
	public void deleteUcenik(int id) {
		ucenikRepo.deleteById(id);
	}

}
