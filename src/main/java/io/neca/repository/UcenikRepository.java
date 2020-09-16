package io.neca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.neca.model.Ucenik;
import io.neca.model.UcenikType;

public interface UcenikRepository extends JpaRepository<Ucenik, Integer> {

//	@Procedure("get_all_info")
//	List<Ucenik> getAllInfo();
	
	@Query("select new io.neca.model.Ucenik(u.ime, u.prezime) from Ucenik u")
	List<Ucenik> getlastFive();

	@Query(value = "select broj, ime, prezime from ucenik order by broj desc limit 5", nativeQuery = true)
	List<UcenikType> getlastFive2();

	@Query(value = "select * from ucenik order by broj desc limit 3", nativeQuery = true)
	List<Ucenik> getLastThree();
	
//	@Query(value = "select ime, prezime from ucenik order by broj desc limit 5", nativeQuery = true)
//	List<Ucenik> getlastFive();
	
}
