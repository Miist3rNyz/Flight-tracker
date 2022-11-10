package connexion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
    @Autowired
    private RepertoireUtilisateur repo ;
    public void SaveUtilisateur(String username,String password){
        Utilisateur user = new Utilisateur();
        user.setUsername(username);
        user.setPassword(password);
        repo.save(user);

    }
}
