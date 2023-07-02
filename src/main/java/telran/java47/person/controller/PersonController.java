package telran.java47.person.controller;



import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java47.person.dto.AddressDto;
import telran.java47.person.dto.CityPopulationDto;
import telran.java47.person.dto.PersonDto;
import telran.java47.person.service.PersonService;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

	final PersonService personService;

	@PostMapping
	public Boolean addPerson(@RequestBody PersonDto personDto) {
		return personService.addPerson(personDto);
	}

	@GetMapping("/{id}")
	public PersonDto findPersonById(@PathVariable Integer id) {
		return personService.findPersonById(id);
	}
	@Transactional
	@GetMapping("/city/{city}")
	public List<PersonDto> findByCity(@PathVariable String city){
		return personService.findByCity(city);
	}
	@PutMapping("/{id}/name/{name}")
	public PersonDto updateName(@PathVariable Integer id, @PathVariable String name) {
		return personService.updateName(id, name);
	}
	@PutMapping("/{id}/{address}")
	public PersonDto updateAddress(@PathVariable Integer id, @RequestBody AddressDto address) {
		return personService.updateAddress(id,address);
	}
	@Transactional
	@GetMapping("/name/{name}")
	public List<PersonDto> findByName(@PathVariable String name){
		return personService.findByName(name);
	}
	@DeleteMapping("/{id}")
	public PersonDto deletePerson(@PathVariable Integer id) {
		return personService.deletePerson(id);
	}
	@Transactional
	@GetMapping("/population/city")
	public CityPopulationDto cityPopulation() {
		return personService.getCityPopulation();
	}
	

}
