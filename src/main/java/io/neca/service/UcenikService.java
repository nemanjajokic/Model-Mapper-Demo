package io.neca.service;

import java.util.List;

import io.neca.dto.UcenikDto;

public interface UcenikService {

	UcenikDto getUcenik(int broj);
	List<UcenikDto> getAll();
	
}
