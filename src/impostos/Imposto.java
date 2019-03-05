package impostos;

import domain.OrcamentoDomain;

public interface Imposto {

    double calcula(OrcamentoDomain orcamento);
}
