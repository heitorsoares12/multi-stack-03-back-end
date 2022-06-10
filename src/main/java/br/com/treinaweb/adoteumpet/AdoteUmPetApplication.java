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
		pet.setNome("SOS Amazônia");
		pet.setHistoria("Nós somos a SOS Amazônia, uma ONG com a missão de promover a conservação da biodiversidade e o crescimento da consciência ambiental na Amazônia.");
		pet.setFoto("https://static.tildacdn.com/tild3334-3662-4937-a638-653039346664/thumbnail-80.jpg");
		petRepository.save(pet);
	}

}
