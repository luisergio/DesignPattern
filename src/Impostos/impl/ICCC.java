package Impostos.impl;

import Business.Orcamento;
import Impostos.Imposto;

public class ICCC implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        final double valor = orcamento.getValor();
        if (valor < 1000.0)
            return valor * 0.05;
        else if(valor >= 1000.0 && valor <= 3000.0)
            return valor * 0.07;
        else
            return (valor * 0.08) + 30;
    }
}
