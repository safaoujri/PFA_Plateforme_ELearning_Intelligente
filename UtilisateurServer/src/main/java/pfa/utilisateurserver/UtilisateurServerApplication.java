package pfa.utilisateurserver;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import pfa.utilisateurserver.entity.Utilisateur;
import pfa.utilisateurserver.repository.UtilisateurRepository;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients


public class UtilisateurServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilisateurServerApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UtilisateurRepository utilisateurRepository) {
		return args -> {
			utilisateurRepository.save(new Utilisateur());
//			utilisateurRepository.save(new Utilisateur(1L,"lk","kj","kj","kl","kj","dek"));
//			utilisateurRepository.save(new Utilisateur(2L,"lk","kj","kj","kl","kj","dek"));
		};
	}
}
