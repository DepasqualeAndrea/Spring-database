package DepasqualeRepository.eserciziodb.exception;

public class ItemsNotFoundException extends RuntimeException {

	public ItemsNotFoundException(int id) {
		super("Item with id " + id + " not found!");
	}
}
