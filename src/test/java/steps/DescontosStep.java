package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;

public class DescontosStep {

    @Dado("^que estou no site da QAzando$")
    public void que_estou_no_site_da_QAzando() {

        System.out.println("Passou 1");
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() {

        System.out.println("Passou 2");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {

        System.out.println("Passou 3");
    }

    @Entao("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto() {

        System.out.println("Passou 4");
    }


}
