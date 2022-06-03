package br.com.treinaweb.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.treinaweb.adoteumpet.core.models.Pet;
import br.com.treinaweb.adoteumpet.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner {

	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setNome("Foquinho");
		pet.setHistoria("Historia Emocionante");
		pet.setFoto("https://www.caesparaadocao.com.br/themes/caesparaadocao.com.br/uploads/caes/galeria/08052017100520_foguinho-caes-para-adocao.jpg");
		petRepository.save(pet);
	}

}
