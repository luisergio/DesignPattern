package testes;

import domain.OrcamentoDomain;
import impostos.impl.ICCC;
import impostos.impl.ICMS;
import impostos.impl.ISS;
import impostos.Imposto;

public class TesteDeImpostos {

    public static void main (String[] args){
        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto iccc = new ICCC();

        OrcamentoDomain orcamento = new OrcamentoDomain(500.0);

        double valorIcms = icms.calcula(orcamento);
        System.out.println("Valor ICMS: " + valorIcms);

        double valorIss = iss.calcula(orcamento);
        System.out.println("Valor ISS: " + valorIss);


        //Exercício sobre ICCC
        OrcamentoDomain orcamento2 = new OrcamentoDomain(1000.0);
        OrcamentoDomain orcamento3 = new OrcamentoDomain(1400.0);
        OrcamentoDomain orcamento4 = new OrcamentoDomain(5000.0);

        double valorIcc = iccc.calcula(orcamento);
        System.out.println("Valor ICCC: " + valorIcc);
        valorIcc = iccc.calcula(orcamento2);
        System.out.println("Valor ICCC: " + valorIcc);
        valorIcc = iccc.calcula(orcamento3);
        System.out.println("Valor ICCC: " + valorIcc);
        valorIcc = iccc.calcula(orcamento4);
        System.out.println("Valor ICCC: " + valorIcc);
    }
}
