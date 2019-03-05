package Testes;

import Business.Orcamento;
import Impostos.impl.ICCC;
import Impostos.impl.ICMS;
import Impostos.impl.ISS;
import Impostos.Imposto;

public class TesteDeImpostos {

    public static void main (String[] args){
        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(500.0);

        double valorIcms = icms.calcula(orcamento);
        System.out.println("Valor ICMS: " + valorIcms);

        double valorIss = iss.calcula(orcamento);
        System.out.println("Valor ISS: " + valorIss);


        //Exercício sobre ICCC
        Orcamento orcamento2 = new Orcamento(1000.0);
        Orcamento orcamento3 = new Orcamento(1400.0);
        Orcamento orcamento4 = new Orcamento(5000.0);

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
