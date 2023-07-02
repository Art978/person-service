package telran.java47.person.service;

import java.util.List;

import telran.java47.person.dto.AddressDto;
import telran.java47.person.dto.CityPopulationDto;
import telran.java47.person.dto.PersonDto;

public interface PersonService {
	Boolean addPerson(PersonDto personDto);

	PersonDto findPersonById(Integer id);

	
	List<PersonDto> findByCity(String cityName);

	PersonDto updateName(Integer id, String name);

	PersonDto updateAddress(Integer id, AddressDto address);

	List<PersonDto> findByName(String name);

	PersonDto deletePerson(Integer id);

	CityPopulationDto getCityPopulation();

}
