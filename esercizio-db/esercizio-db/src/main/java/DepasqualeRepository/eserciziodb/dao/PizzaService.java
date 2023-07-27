package DepasqualeRepository.eserciziodb.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DepasqualeRepository.eserciziodb.entities.Pizza;
import DepasqualeRepository.eserciziodb.exception.ItemsNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PizzaService implements PizzaDao {
	@Autowired
	private PizzaRepo pizzaRepo;

	public void save(Pizza pizza) {
		pizzaRepo.save(pizza);
		log.info(pizza.getName() + "Pizza Salvata");
	}

	public List<Pizza> findAll() {
		return pizzaRepo.findAll();
	}

	public Pizza findById(int id) throws ItemsNotFoundException {
		Optional<Pizza> pizza = pizzaRepo.findById(id);

		if (pizza.isPresent()) {
			return pizza.get();
		} else {
			throw new ItemsNotFoundException(id);
		}
		// return pizzaRepo.findById(id).orElseThrow(() -> new
		// ItemsNotFoundException(id));
	}

	public void findByIdAndUpdate(int id, Pizza pizza) throws ItemsNotFoundException {
		Pizza found = this.findById(id);
		found.setId(id);
		found.setName(pizza.getName());
		found.setPrezzo(pizza.getPrezzo());

		pizzaRepo.save(found);
	}

	public void findByIdAndDelete(int id) throws ItemsNotFoundException {
		Pizza found = this.findById(id);
		pizzaRepo.delete(found);
	}

	public long count() {
		return pizzaRepo.count();
	}

	public List<Pizza> findByPartialNameIgnoreCase(String name) {
		return pizzaRepo.findByNameStartingWithIgnoreCase(name);
	}

}
