package business;

import domain.ContaBancariaDomain;
import domain.enumeration.TipoDeInvestimentoEnum;

public class RealizadorDeInvestimentos {

    public RealizadorDeInvestimentos(){

    }

    public void investir(ContaBancariaDomain contaBancariaDomain, TipoDeInvestimentoEnum tipoDeInvestimentoEnum){
        double rendimentoPercent = tipoDeInvestimentoEnum.getRendimento();
        System.out.println("Rendimento: " + (rendimentoPercent * 100) + "%");
        double rendimento = rendimentoPercent * contaBancariaDomain.getSaldo();
        System.out.println("Depositado: " + rendimento);
        contaBancariaDomain.depositar(rendimento * 0.75);
        System.out.println("Novo Saldo: " + contaBancariaDomain.getSaldo());
    }

}
