package connexion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
    @Autowired
    private RepertoireUtilisateur repo;
    public void SaveUtilisateur(){
        Utilisateur user = new Utilisateur();
        user.setUsername("Kevin");
        user.setPassword("Samueltahack");
        repo.save(user);

    }
}
