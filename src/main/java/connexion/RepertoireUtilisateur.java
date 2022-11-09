package connexion;

import org.springframework.data.jpa.repository.JpaRepository;
public interface RepertoireUtilisateur extends JpaRepository<Utilisateur, Long> {
}
