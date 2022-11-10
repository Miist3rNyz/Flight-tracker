package connexion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UtilisateurApplication {
    public static void main(String[] args) {

        UtilisateurService service=new UtilisateurService() ;
        service.SaveUtilisateur("Kevin","camelesbrise");
    }
}
