package one.digitalinovattion.padroesdeprojetospring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinovattion.padroesdeprojetospring.model.Address;
import one.digitalinovattion.padroesdeprojetospring.model.Client;
import one.digitalinovattion.padroesdeprojetospring.model.ClientAddress;
import one.digitalinovattion.padroesdeprojetospring.model.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ClientAddress clientAddress;
	
	@Autowired
	private ViaCepService viaCepService;
	
	@Override
	public Iterable <Client> findAll() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	@Override
	public Client searchLongId(Long id) {
		Optional<Client> client = clientRepository.findById(id);
		return  client.get();
	}

	@Override
	public void insert(Client client) {
		
		SaveClientWithCep(client);
	}

	private void SaveClientWithCep(Client client) {
		String cep = client.getAddress().getCep();
		Address address = clientAddress.findById(cep).orElseGet(()->{
			Address newAddress = viaCepService.consultCep(cep);
			clientAddress.save(newAddress);
			return newAddress;
		});
		client.setAddress(address);
		clientAddress.save(client);
	}

	@Override
	public void update(Long id, Client client) {
		Optional<Client> clientbd = clientRepository.findById(id);
		if(clientbd.isPresent()) {
			SaveClientWithCep(client);
		}
		
	}

	@Override
	public void delete(Long id) {
		clientRepository.deleteById(id);
		
	}

	
	

}
