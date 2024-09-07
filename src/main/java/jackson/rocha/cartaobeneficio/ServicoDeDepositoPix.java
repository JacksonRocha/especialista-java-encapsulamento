package jackson.rocha.cartaobeneficio;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no Pix

        if (valorDeposito < Cartao.VALOR_MINIMI_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de deposito não pode ser menor que R$ %.2f", Cartao.VALOR_MINIMI_DEPOSITO));
        }
        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Deposito", valorDeposito);
    }

}
