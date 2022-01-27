package one.digitalinovattion.padroesdeprojetospring.service;

import one.digitalinovattion.padroesdeprojetospring.model.Client;

public interface ClientService {
	
	Iterable<Client> findAll ();
	
	Client searchLongId(Long id);
	
	void insert (Client client);
	
	void update (Long id, Client client);
	
	void delete (Long id);


}
