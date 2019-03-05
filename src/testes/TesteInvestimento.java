package testes;

import business.RealizadorDeInvestimentos;
import domain.ContaBancariaDomain;
import domain.enumeration.TipoDeInvestimentoEnum;

public class TesteInvestimento {

    public static void main(String[] args)
    {
        ContaBancariaDomain contaBancariaDomain = new ContaBancariaDomain(300.0);

        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

        realizadorDeInvestimentos.investir(contaBancariaDomain, TipoDeInvestimentoEnum.CONSERVADOR);
        realizadorDeInvestimentos.investir(contaBancariaDomain, TipoDeInvestimentoEnum.MODERADO);
        realizadorDeInvestimentos.investir(contaBancariaDomain, TipoDeInvestimentoEnum.ARROJADO);
    }
}
