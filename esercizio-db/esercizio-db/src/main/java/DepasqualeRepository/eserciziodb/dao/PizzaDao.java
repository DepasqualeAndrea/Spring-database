package DepasqualeRepository.eserciziodb.dao;

import java.util.List;

import DepasqualeRepository.eserciziodb.entities.Pizza;

public interface PizzaDao {

	public void save(Pizza pizza);

	public void findByIdAndUpdate(int id, Pizza pizza);

	public void findByIdAndDelete(int id);

	public Pizza findById(int id);

	public List<Pizza> findAll();

	public long count();

	public List<Pizza> findByPartialNameIgnoreCase(String name);

}
