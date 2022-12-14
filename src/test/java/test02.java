package test.java;

import main.java.Commun.Classe_mere;
import main.java.Pages.Page_Acceuil;
import org.testng.annotations.Test;

public class test02 extends Classe_mere {
    @Test
    public void test02(){
        Page_Acceuil p =new Page_Acceuil(driver);
        String val1="standard_user";
        p.saisirlogin(val1);

        String val2="secret_sauce";
        p.saisirMdp(val2);
        p.cliquerBoutonLogin();


    }
}
