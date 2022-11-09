package connexion;

import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class unitTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private RepertoireUtilisateur repo;
    @Test
    public void testCreateUser() {
        Utilisateur user = new Utilisateur();
        user.setUsername("Kevin");
        user.setPassword("Samueltahack");


        Utilisateur savedUser = repo.save(user);

        Utilisateur existUser = entityManager.find(Utilisateur.class, savedUser.getId());

        assertThat(user.getUsername()).isEqualTo(existUser.getUsername());

    }
    // test methods go below
    public static void main(String[] args) {
            unitTest test = new unitTest();
            test.testCreateUser();
        };
};



