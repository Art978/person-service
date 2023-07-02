package telran.java47.person.dao;

import java.util.Map;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import telran.java47.person.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	@Query("SELECT p FROM Person p WHERE p.address.city = :city")
	Stream<Person> findByCityIgnoreCase(@Param("city") String city);
	
	
	@Query("SELECT p FROM Person p WHERE p.name = :name")
	Stream<Person> findByNameIgnoreCase(@Param("name") String name);
	
//	@Query("SELECT * FROM PERSON CITY = :city")
	Stream<String>  countByCityInAddress();
}
