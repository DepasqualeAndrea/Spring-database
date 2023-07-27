package DepasqualeRepository.eserciziodb.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import DepasqualeRepository.eserciziodb.dao.PizzaDao;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PizzaRunner implements CommandLineRunner {
	@Autowired
	private PizzaDao pDao;

	@Override
	public void run(String... args) throws Exception {
//		Pizza margherita = Pizza.builder().name("Pizza margherita").prezzo(6.50).build();
//		Pizza cotto = Pizza.builder().name("Pizza cotto").prezzo(7.50).build();
//		Pizza crudo = Pizza.builder().name("Pizza crudo").prezzo(7.90).build();
//		Pizza salsicciaEfunghi = Pizza.builder().name("Pizza salsiccia E funghi").prezzo(8.50).build();
//		Pizza salsicciaEfriariell = Pizza.builder().name("Pizza salsiccia E friariell").prezzo(10.50).build();
//
//		pDao.save(margherita);
//		pDao.save(cotto);
//		pDao.save(crudo);
//		pDao.save(salsicciaEfunghi);
//		pDao.save(salsicciaEfriariell);

		try {
//			Pizza bianca = Pizza.builder().name("Pizza con cotto").prezzo(6.50).build();
//			pDao.findByIdAndUpdate(1, bianca);
			pDao.findByIdAndDelete(4);
			log.info("Pizza eliminata con successos");
		} catch (ItemsNotFoundException e) {
			log.error(e.getMessage());
		}
	}

}
