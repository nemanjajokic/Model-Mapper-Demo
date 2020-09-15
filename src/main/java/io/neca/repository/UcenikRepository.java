package io.neca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.neca.model.Ucenik;

public interface UcenikRepository extends JpaRepository<Ucenik, Integer> {

//	@Procedure("get_all_info")
//	@Query(value = "use skola; call get_all_info", nativeQuery = true)
//	List<Ucenik> getAllInfo();

//	@Query(value = "SELECT * from ucenik ORDER BY broj DESC LIMIT 5", nativeQuery = true)
//	List<Ucenik> getlastFive();
	
	@Query("select new io.neca.model.Ucenik(u.ime, u.prezime) from Ucenik u")
	List<Ucenik> getlastFive();
	
//	@Query(value = "select * from ucenik order by broj desc limit 5", nativeQuery = true)
//	List<Ucenik> getlastFive();
	
//	@Query("SELECT u.ime, u.prezime FROM Ucenik u ORDER BY broj DESC")
//	List<Ucenik> getlastFive();
	
}
