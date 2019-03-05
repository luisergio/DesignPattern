package Impostos.impl;

import Business.Orcamento;
import Impostos.Imposto;

public class ISS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
