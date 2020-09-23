package io.neca.service;

import java.util.List;

import io.neca.dto.UcenikDto;
import io.neca.model.Ucenik;
import io.neca.model.UcenikType;

public interface UcenikService {

	UcenikDto getUcenik(int broj);
	List<UcenikDto> getAll();
//	List<UcenikDto> getAllInfo();
	List<UcenikDto> poslednjihPet();
	List<UcenikType> najnoviji();
	void addUcenik(Ucenik ucenik);
	Ucenik findUcenikByID(int id);
	void deleteUcenik(int id);
	
}
