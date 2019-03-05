package domain;

public class ContaBancariaDomain {

    double saldo;

    public ContaBancariaDomain(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDoDeposito){
        if(valorDoDeposito < 0)
            throw new RuntimeException("O valor depositado deve ser maior do que zero.");

        valorDoDeposito = Math.round(valorDoDeposito * 100);

        this.saldo += (valorDoDeposito / 100);
    }
}
