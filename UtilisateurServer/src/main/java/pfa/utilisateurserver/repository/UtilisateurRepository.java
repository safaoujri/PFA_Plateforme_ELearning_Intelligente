package pfa.utilisateurserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pfa.utilisateurserver.entity.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
