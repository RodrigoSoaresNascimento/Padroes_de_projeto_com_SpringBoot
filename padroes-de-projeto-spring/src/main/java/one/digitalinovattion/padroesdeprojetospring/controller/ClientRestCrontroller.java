package one.digitalinovattion.padroesdeprojetospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinovattion.padroesdeprojetospring.model.Client;
import one.digitalinovattion.padroesdeprojetospring.service.ClientService;

@RestController
@RequestMapping("clients")
public class ClientRestCrontroller {
	
	@Autowired
	private ClientService clientService;
	
	
	@GetMapping
	public ResponseEntity<Iterable<Client>> findAll(){
		
		return ResponseEntity.ok(clientService.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Client> searchById(@PathVariable Long id){
		
		return ResponseEntity.ok(clientService.searchLongId(id));
		
	}
	
	@PostMapping
	public ResponseEntity<Client> insert(@RequestBody Client client){
		
		clientService.insert(client);
		return ResponseEntity.ok(client);
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<Client> update (@RequestBody Long id,@RequestBody Client client ){
		
		clientService.update(id, client);
		return ResponseEntity.ok(client);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Client> delete (@PathVariable Long id){
		
		clientService.delete(id);
		return ResponseEntity.ok().build();
		
	}

}
