package domain.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum TipoDeInvestimentoEnum {
    CONSERVADOR(new HashMap<Double,Double>(){{put(1.0, 0.008);}}),
    MODERADO(new HashMap<Double,Double>(){{put(0.45, 0.025); put(0.55, 0.007);}}),
    ARROJADO(new HashMap<Double,Double>(){{put(0.2, 0.05); put(0.3, 0.03); put(0.5, 0.006);}});

    Map<Double,Double> probabilidades;

    TipoDeInvestimentoEnum(Map<Double,Double> probabilidades){
        this.probabilidades = probabilidades;
    }

    public double getRendimento(){

        double somaProb = 0.0;
        double chance = new java.util.Random().nextDouble();

        for (double prob : this.probabilidades.keySet()) {
            somaProb = somaProb + prob;
            if(chance <= somaProb)
                return this.probabilidades.get(prob);
        }

        return 0.0;
    }

}
