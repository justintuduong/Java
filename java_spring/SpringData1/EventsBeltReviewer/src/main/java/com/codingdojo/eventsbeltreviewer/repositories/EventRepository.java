package com.codingdojo.eventsbeltreviewer.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.eventsbeltreviewer.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {

	List<Event> findAll();
	List<Event> findByState(String state);
	List<Event> findByStateNot(String state);
	void deleteById(Long id);
}
