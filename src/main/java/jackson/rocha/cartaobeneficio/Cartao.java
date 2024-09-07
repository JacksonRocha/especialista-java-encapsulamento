package jackson.rocha.cartaobeneficio;

public class Cartao {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

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

    public void debitar(double valorDebito) {
        if (obterSaldo() < valorDebito) {
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
