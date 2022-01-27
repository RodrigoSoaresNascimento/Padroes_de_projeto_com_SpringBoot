package one.digitalinovattion.padroesdeprojetospring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientAddress extends CrudRepository <Address, String> {

	void save(Client client);

}
