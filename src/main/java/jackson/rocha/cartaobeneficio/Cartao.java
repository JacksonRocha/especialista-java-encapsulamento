package jackson.rocha.cartaobeneficio;

import java.io.Serializable;

public class Cartao implements Serializable {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;
    private boolean ativo;

    public Cartao() {
    }

    public Cartao(String titular) {
        this.titular = titular;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void debitar(double valorDebito) {
        if (getSaldo() < valorDebito) {
            throw new RuntimeException("Saldo insuficiente para efetuar o pagamento");
        }

        this.saldo -= valorDebito;
    }


    public void depositar(double valorDeposito) {
        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de deposito não pode ser menor que R$ %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        this.saldo += valorDeposito - TARIFA_DEPOSITO;
    }
}
