package DepasqualeRepository.eserciziodb.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DepasqualeRepository.eserciziodb.entities.Pizza;

@Repository
public interface PizzaRepo extends JpaRepository<Pizza, Integer> {
	// "SELECT u FROM User WHERE name= :name"
	Optional<Pizza> findByName(String name);

	// "SELECT u FROM User WHERE name= :name or prezzo = :prezzo"
	// List<Pizza> findByNameOrPrezzo(double prezzo);

	// "SELECT u FROM User WHERE LOWER(u.name) LIKE CONCAT(LOWER(:name), '%')
	List<Pizza> findByNameStartingWithIgnoreCase(String name);

	// DOCS https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
}
