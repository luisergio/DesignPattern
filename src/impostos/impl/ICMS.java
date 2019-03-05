package impostos.impl;

import domain.OrcamentoDomain;
import impostos.Imposto;

public class ICMS implements Imposto {

    @Override
    public double calcula(OrcamentoDomain orcamento)
    {
        return orcamento.getValor() * 0.1;
    }
}
