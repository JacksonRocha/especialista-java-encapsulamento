package jackson.rocha.cartaobeneficio;

public class Cartao {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMI_DEPOSITO = 50;

    private String titular;
    private double saldo;

    public Cartao(String titular) {
        this.titular = titular;
    }

    public String obterTitular() {
        return titular;
    }

    public double obterSaldo() {
        return saldo;
    }

    public void alterarSaldo(double valor) {
        this.saldo = valor;
    }
}
